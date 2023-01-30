package com.enze.run;

import com.enze.bean.Business;
import com.enze.bean.Customer;
import com.enze.bean.Movie;
import com.enze.bean.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.BiConsumer;

public class MovieSystem {
    /*
            定义系统的数据容器，用于存储数据。
            1.存储很多用户(客户对象、商家对象)
     */
    public static final List<User> ALL_USERS = new ArrayList<>();
    /*
            2.存储系统全部商家和其排片信息
            商家1 = [m1,m2,m3...]
            商家2 = [m1,m2,m3...]
            商家3 = [m1,m2,m3...]
    */
    public static final Map<Business, List<Movie>> ALL_MOVIES = new HashMap<>();

    /*
            3.准备一些测试数据
    */
    static {
        Customer c = new Customer();
        c.setLoginName("zyf888");
        c.setPassWord("123456");
        c.setUserName("黑马刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Customer c1 = new Customer();
        c1.setLoginName("gzl888");
        c1.setPassWord("123456");
        c1.setUserName("黑马关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassWord("123456");
        b.setUserName("黑马包租公");
        b.setMoney(0);
        b.setSex('男');
        b.setPhone("110110");
        b.setAddress("火星6号2B二层");
        b.setShopName("甜甜圈国际影城");
        ALL_USERS.add(b);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b, movies); // b = []

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassWord("123456");
        b2.setUserName("黑马包租婆");
        b2.setMoney(0);
        b2.setSex('女');
        b2.setPhone("110110");
        b2.setAddress("火星8号8B八层");
        b2.setShopName("巧克力国际影城");
        ALL_USERS.add(b2);
        // 注意，商家一定需要加入到店铺排片信息中去
        List<Movie> movies2 = new ArrayList<>();
        ALL_MOVIES.put(b2, movies2); // b2 = []
    }

    public static final Scanner SYS_SC = new Scanner(System.in);

    public static User loginUser;
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static final Logger LOGGER = LoggerFactory.getLogger("MovieSystem.class");
    public static final Map<String, List<Double>> MOVIES_SCORE = new HashMap<>();

    public static void main(String[] args) {
        showMain();
    }

    private static void showMain() {
        System.out.println("=================恩泽电影首页=================");
        while (true) {
            System.out.println("1、登录");
            System.out.println("2、用户注册");
            System.out.println("3、商家注册");
            System.out.println("4、请输入操作命令__");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("命令有误，请重新输入");
            }
        }
    }

    private static void login() {
        while (true) {
            System.out.println("请输入登录名:");
            String loginName = SYS_SC.nextLine();
            System.out.println("请输入密码:");
            String passWord = SYS_SC.nextLine();

            //1.根据用户名查询用户对象
            User user = getUserByLoginName(loginName);
            if (user != null) {
                //2.比对密码是否正确
                loginUser = user; /* 记住登录 */
                LOGGER.info(user.getUserName() + "登录了系统");
                if (user.getPassWord().equals(passWord)) {
                    if (user.getClass() == Business.class) {
                        showBusinessMain();
                    } else {
                        showCustomerMain();
                    }
                    return; //把login干掉，回到首页！！
                } else {
                    System.out.println("密码错误！ ");
                }
            } else {
                System.out.println("登录名称错误！ 请确认！！");
            }
        }

    }

    private static void showCustomerMain() {
        while (true) {
            System.out.println("============黑马电影客户界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士"
                    + "欢迎您进入系统" + "\t余额：" + loginUser.getMoney()));
            System.out.println("请您选择要操作的功能：");
            System.out.println("1、展示全部影片信息功能:");
            System.out.println("2、根据电影名称查询电影信息:");
            System.out.println("3、评分功能:");
            System.out.println("4、购票功能:");
            System.out.println("5、退出系统:");
            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    showAllMovies();
                    break;
                case "2":
                    break;
                case "3":
                    // 评分功能
                    scoreMovie();
                    break;
                case "4":
                    // 购票功能
                    buyMovie();
                    break;
                case "5":
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }


    private static void scoreMovie() {
        // 1、查询当前登录成功的用户历史购买记录，看哪些电影是它可以评分的。
        Customer c = (Customer) loginUser;
        Map<String, Boolean> movies = c.getBuyMovies();
        if(movies.size() == 0 ){
            System.out.println("当前您没有看过电影，不能评价！");
            return;
        }
        // 买过了 ，看哪些电影是它可以评分的。
        movies.forEach((name, flag) -> {
            if(flag){
                System.out.println(name +"此电影已评价");
            }else {
                System.out.println("请您对：" + name +"进行打分（0-10）：");
                double score = Double.valueOf(SYS_SC.nextLine());

                // 先根据电影名称拿到评分数据
                List<Double> scores = MOVIES_SCORE.get(name); // MOVIES_SCORE = [ 名称=[10] , ... ]
                if(scores == null){
                    // 说明此电影是第一次评价
                    scores = new ArrayList<>();
                    scores.add(score);
                    MOVIES_SCORE.put(name , scores);
                }else {
                    scores.add(score);
                }

                movies.put(name, true);
            }
        });
    }
    private static void scoreMovies() {
        System.out.println("===============用户评分=================");
        Customer c = (Customer) loginUser;
        //1.选择要打分的电影
        Map<String, Boolean> buyMovies = c.getBuyMovies();
        if (buyMovies.size() < 1) {
            System.out.println("您还没有看过电影，不能评价");
            return;
        }
        //买过了，看看哪些电影可以进行评分
        buyMovies.forEach((s, b) -> {
            if (b) {
                System.out.println("您已经对电影" + s + "进行评价了");
            } else {
                System.out.println("请您对电影" + s + "进行评价： 范围0.0-10.0");
                Double score = Double.valueOf(SYS_SC.nextLine());
                //根据电影名称拿到评分数据
                List<Double> scores = MOVIES_SCORE.get(s);
                if (scores == null) {
                    scores = new ArrayList<>();
                    scores.add(score);
                    MOVIES_SCORE.put(s, scores);
                } else {
                    scores.add(score);
                }
                buyMovies.put(s, true);
                MOVIES_SCORE.forEach((s1, doubles) -> System.out.println("电影" + s1 + "的评分情况是" + doubles));
            }
        });
    }

    /**
     * 用户购票功能  ALL_MOVIE = {b1 = [m1,m2],b2=[m1,m2]}
     */
    private static void buyMovie() {
        showAllMovies();
        System.out.println("=============用户购票===================");
        while (true) {
            System.out.println("请您输入需要买票的门店：");
            String selectShop = SYS_SC.nextLine();
            Business business = getBusinessByShopName(selectShop);
            if (business == null) {
                System.out.println("您输入的店铺名称有误，请重新输入");
            } else {
                List<Movie> movies = ALL_MOVIES.get(business);
                if (movies.size() > 0) {
                    //选片
                    System.out.println("请您输入需要购买的电影票：");
                    String movieName = SYS_SC.nextLine();
                    Movie movie = getMovieByShopName(business, movieName);
                    if (movie == null) {
                        System.out.println("该影院内没有这个电影，请选择其他影院");
                    } else {
                        System.out.println("请您输入要购买数量：");
                        String Number = SYS_SC.nextLine();
                        int selectNumber = Integer.valueOf(Number);
                        movie.setNumber(movie.getNumber() - selectNumber);
                        loginUser.setMoney(loginUser.getMoney() - movie.getPrice() * selectNumber);
                        business.setMoney(business.getMoney() + movie.getPrice() * selectNumber);
                        Customer c = (Customer) loginUser;
                        c.getBuyMovies().put(movie.getName(), false);
                        System.out.println("恭喜您，购票成功！");
                        return;
                    }
                } else {
                    System.out.println("该电影院没片");
                    System.out.println("请问您还要继续吗？y/n");
                    String command = SYS_SC.nextLine();
                    switch (command) {
                        case "y":
                            break;
                        default:
                            System.out.println("退出购买功能！");
                            return;
                    }
                }
            }
        }
    }

    public static Business getBusinessByShopName(String shopName) {
        Set<Business> businesses = ALL_MOVIES.keySet();
        for (Business business : businesses) {
            if (business.getShopName().equals(shopName)) {
                return business;
            }
        }
        return null;
    }

    public static Movie getMovieByShopName(Business business, String name) {
        List<Movie> movies = ALL_MOVIES.get(business);
        for (Movie movie : movies) {
            if (movie.getName().contains(name)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * 展示全部商家和其排片信息
     */
    private static void showAllMovies() {
        ALL_MOVIES.forEach((business, movies) -> {
            System.out.println("店铺名：" + business.getShopName() + "\t\t电话：" + business.getPhone()
                    + "\t\t地址：" + business.getAddress());
            System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\\放映时间");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t"
                        + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber()
                        + "\t\t" + sdf.format(movie.getStartTime()));
            }
        });
    }

    private static void showBusinessMain() {
        while (true) {
            System.out.println("============黑马电影商家界面===================");
            System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士"
                    + "欢迎您进入系统"));
            System.out.println("1、展示详情:");
            System.out.println("2、上架电影:");
            System.out.println("3、下架电影:");
            System.out.println("4、修改电影:");
            System.out.println("5、退出:");

            System.out.println("请输入您要操作的命令：");
            String command = SYS_SC.nextLine();
            switch (command) {
                case "1":
                    // 展示全部排片信息
                    System.out.println("====================");
                    showBusinessInfos();
                    break;
                case "2":
                    // 上架电影信息
                    addMovie();
                    break;
                case "3":
                    // 下架电影信息
                    deleteMovie();
                    break;
                case "4":
                    // 修改电影信息
                    updateMovie();
                    break;
                case "5":
                    System.out.println(loginUser.getUserName() + "请您下次再来啊~~~");
                    return; // 干掉方法
                default:
                    System.out.println("不存在该命令！！");
                    break;
            }
        }
    }

    private static void updateMovie() {
        System.out.println("============修改电影===================");
        Business b = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(b);
        if (movies.size() == 0) {
            System.out.println("当前无片可以修改");
            return;
        }
        while (true) {
            System.out.println("请您输入要修改的电影名称：");
            String movieName = SYS_SC.nextLine();
            //3.去查询有没有这个影片
            Movie movie = getMovieByName(movieName);
            if (movie == null) {
                System.out.println("您没有上架这个影片！");
                System.out.println("请问您还要继续吗？y/n");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    default:
                        System.out.println("退出修改功能！");
                        return;
                }
            } else {
                System.out.println("请您修改" + movie.getName() + "的名称：");
                movie.setName(SYS_SC.nextLine());
                System.out.println("请您修改" + movie.getName() + "的演员：");
                movie.setActor(SYS_SC.nextLine());
                System.out.println("请您修改" + movie.getName() + "的价格：");
                movie.setPrice(Double.valueOf(SYS_SC.nextLine()));
                System.out.println("请您修改" + movie.getName() + "的票数：");
                movie.setNumber(Integer.valueOf(SYS_SC.nextLine()));
                while (true) {
                    try {
                        System.out.println("请您修改" + movie.getName() + "的放映时间：");
                        String stime = SYS_SC.nextLine();
                        movie.setStartTime(sdf.parse(stime));
                        System.out.println("影片信息修改成功: \n" + movie);
                        showBusinessInfos();
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        LOGGER.error("时间格式输入有误，请重新输入！");
                    }
                }
            }
        }
    }

    private static void deleteMovie() {
        System.out.println("============下架电影===================");
        Business b = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(b);
        if (movies.size() == 0) {
            System.out.println("当前无片可以下架");
            return;
        }
        //2.让用户选择需要下架的电影名称
        while (true) {
            System.out.println("请您输入要下架的电影名称：");
            String movieName = SYS_SC.nextLine();
            //3.去查询有没有这个影片
            Movie movie = getMovieByName(movieName);
            if (movie == null) {
                System.out.println("您没有上架这个影片！");
                System.out.println("请问您还要继续吗？y/n");
                String command = SYS_SC.nextLine();
                switch (command) {
                    case "y":
                        break;
                    default:
                        System.out.println("退出下架功能！");
                        return;
                }
            } else {
                System.out.println("您已成功下架" + movie.getName());
                movies.remove(movie);
                showBusinessInfos();
                return;
            }
        }

    }

    public static Movie getMovieByName(String movieName) {
        Business b = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(b);
        for (Movie movie : movies) {
            if (movie.getName().contains(movieName)) {
                return movie;
            }
        }
        return null;
    }

    /**
     * 商家进行电影上架
     */
    private static void addMovie() {
        Business b = (Business) loginUser;
        List<Movie> movies = ALL_MOVIES.get(b);
        System.out.println("请您输入新片名：");
        String name = SYS_SC.nextLine();
        System.out.println("请您输入主演：");
        String actor = SYS_SC.nextLine();
        System.out.println("请您输入时长：");
        String time = SYS_SC.nextLine();
        System.out.println("请您输入票价：");
        String price = SYS_SC.nextLine();
        System.out.println("请您输入票数：");
        String totalNumber = SYS_SC.nextLine(); // 200\n
        while (true) {
            try {
                System.out.println("请您输入影片放映时间：");
                String stime = SYS_SC.nextLine();
                // public Movie(String name, String actor, double time, double price, int number, Date startTime)        // 封装成电影对象 ，加入集合movices中去
                Movie movie = new Movie(name, actor, Double.valueOf(time), Double.valueOf(price)
                        , Integer.valueOf(totalNumber), sdf.parse(stime));
                movies.add(movie);
                System.out.println("您已经成功上架了：《" + movie.getName() + "》");
                LOGGER.info("商家" + loginUser.getUserName() + "成功上架了" + movie.getName());
                return; // 直接退出去
            } catch (ParseException e) {
                e.printStackTrace();
                LOGGER.error("时间解析出了毛病");
            }
        }
    }

    /**
     * 展示商家的详细信息：展示当前登录的信息
     */
    private static void showBusinessInfos() {
        System.out.println("============商家详情界面===================");
        LOGGER.info("商家 [" + loginUser.getUserName() + "] 正在看自己的详情...");
        //1.根据商家对象，作为Map集合的键，提取对应的值，就是排片信息 Map<Business, List<Movie>> ALL_MOVIES
        Business b = (Business) loginUser;
        System.out.println("店铺名：" + b.getShopName() + "\t\t电话：" + b.getPhone() + "\t\t地址：" + b.getAddress());
        List<Movie> movies = ALL_MOVIES.get(b);
        System.out.println("片名\t\t\t主演\t\t时长\t\t评分\t\t票价\t\t余票数量\\放映时间");
        if (movies.size() > 0) {
            for (Movie movie : movies) {
                System.out.println(movie.getName() + "\t\t\t" + movie.getActor() + "\t\t" + movie.getTime() + "\t\t"
                        + movie.getScore() + "\t\t" + movie.getPrice() + "\t\t" + movie.getNumber()
                        + "\t\t" + sdf.format(movie.getStartTime()));
            }
        } else {
            System.out.println("您的店铺当前无片可播");
        }
    }

    /**
     * 根据用户名查用户
     *
     * @param loginName 输入的用户名
     * @return 用户对象 或 null
     */
    public static User getUserByLoginName(String loginName) {
        for (User user : ALL_USERS) {
            if (user.getLoginName().equals(loginName)) {
                return user;
            }
        }
        return null;
    }
}
