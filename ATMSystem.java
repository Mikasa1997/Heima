package com.learning.atm;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        /* 1.定义账户类 */
        /* 2.定义一个集合，负责存储账户对象 */
        ArrayList<Account> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        /* 3.展示系统的欢迎页 */
        while (true) {
            System.out.println("-------------------ATM系统------------------------");
            System.out.println("1.账户登录");
            System.out.println("2.账户开户");
            System.out.println("请您选择操作：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    /* 用户登录操作 */
                    login(accounts, sc);
                    break;
                case 2:
                    /* 用户开户操作 */
                    register(accounts, sc);
                    showAllUser(accounts);
                    break;
                default:
                    System.out.println("您选择的操作有误!!!!! 系统退出！！！");
                    return;

            }
        }

    }

    /**
     * 登录功能
     *
     * @param accounts 已有账户对象的集合
     * @param sc       扫描器
     */
    public static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("------------------用户登录操作-----------------");
        /* 1.判断账户集合中是否存在账户，如果不存在，登录功能不能进行 */
        if (accounts.size() == 0) {
            System.out.println("目前账户集合没有一个账户，登录无法基于执行！！！");
            return; /* 卫语言风格，解决方法的执行 */
        }
        while (true) {
            System.out.println("请您输入您的银行卡号:");
            String cardId = sc.next();
            Account account = getAccountByCardId(accounts, cardId);

            if (account != null) {
                while (true) {
                    System.out.println("请您输入您的账户密码:");
                    String passWord = sc.next();
                    if (passWord.equals(account.getPassWord())) {
                        System.out.println("您已登录成功！！！");
                        /* 展示登陆后的操作页 */
                        showUserCommand(account, sc, accounts);
                        return;
                    } else {
                        System.out.println("请您输入您的账户密码有误！！，请您重新输入！！！");
                    }
                }
            } else {
                System.out.println("登录卡号不存在，请您重新输入！！");
            }
        }

    }

    /**
     * 展示用户登陆后的操作页
     */
    private static void showUserCommand(Account account, Scanner sc, ArrayList<Account> accounts) {
        while (true) {
            System.out.println("-------------------用户操作页-------------------");
            System.out.println("1. 查询账户");
            System.out.println("2. 存款");
            System.out.println("3. 取款");
            System.out.println("4. 转账");
            System.out.println("5. 修改密码");
            System.out.println("6. 退出");
            System.out.println("7. 注销账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    /* 查询账户功能 */
                    showUser(account);
                    break;
                case 2:
                    /* 存款功能 */
                    addMoney(account, sc);
                    break;
                case 3:
                    /* 取款功能 */
                    takeMoney(account, sc);
                    break;
                case 4:
                    /* 转账功能 */
                    transMoney(accounts, account, sc);
                    break;
                case 5:
                    /* 修改密码 */
                    changePassWord(account, sc);
                    return;
                case 6:
                    /* 退出功能 */
                    System.out.println("退出成功，欢迎下次光临");
                    return; /* 干掉当前方法 */
                case 7:
                    /* 注销账户功能 */
                    cancelAccount(accounts, account);
                    return;
                default:
                    System.out.println("您的输入有误！");

            }
        }


    }

    private static void cancelAccount(ArrayList<Account> accounts, Account account) {
        System.out.println("恭喜您，销户成功！");
        accounts.remove(account);
        return;
    }

    private static void changePassWord(Account account, Scanner sc) {
        while (true) {
            System.out.println("请您输入当前密码");
            String oldPassWord = sc.next();
            if (oldPassWord.equals(account.getPassWord())) {
                while (true) {
                    System.out.println("请您输入新密码:");
                    String newPassWord = sc.next();
                    System.out.println("请您再次输入新密码：");
                    String secNewPassWord = sc.next();
                    if (newPassWord.equals(secNewPassWord)) {
                        System.out.println("恭喜您，修改密码成功，请您重新登录");
                        account.setPassWord(newPassWord);
                        return;
                    } else {
                        System.out.println("您两次输入的密码不一致！");
                    }
                }
            } else {
                System.out.println("您当前密码输入有误！");
            }
        }
    }

    /**
     * 转账功能
     *
     * @param accounts 所有账户的集合
     * @param account  我的账户
     * @param sc       扫描器
     */
    private static void transMoney(ArrayList<Account> accounts, Account account, Scanner sc) {
        System.out.println("-------------------用户转账操作-------------------");
        if (accounts.size() < 2) {
            System.out.println("对不起，目前只有您一个账户，无法转账！");
            return;
        }

        double money = account.getMoney();
        if (money < 100) {
            System.out.println("您的余额不足 100，无法转账！");
            return;
        }
        while (true) {
            System.out.println("请您输入对方卡号：");
            String cardId = sc.next();
            Account aimAccount = getAccountByCardId(accounts, cardId);
            if (aimAccount == null) {
                System.out.println("对不起，没有查到该账户，请您重新输入：");
            } else {
                while (true) {
                    System.out.println("请您输入收款人姓氏：");
                    String lastName = sc.next();
                    String aimLastName = String.valueOf(aimAccount.getUserName().charAt(0));
                    if (!lastName.equals(aimLastName)) {
                        System.out.println("对不起，目标卡号和号主的姓氏不符，请核对后再操作！");
                    } else {
                        while (true) {
                            System.out.println("请您输入要转账的金额:");
                            double transMoney = sc.nextDouble();
                            if (transMoney > account.getMoney() - 100) {
                                System.out.println("对不起，您没有足够的余额");
                            } else if (transMoney > account.getQuotaMoney()) {
                                System.out.println("对不起，您超出了单日限额");
                            } else {
                                System.out.println("恭喜您，转账成功！");
                                account.setMoney(account.getMoney() - transMoney);
                                aimAccount.setMoney(aimAccount.getMoney() + transMoney);
                                showUser(account); /* 输出一下账户信息 */
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    private static void takeMoney(Account account, Scanner sc) {

        if (account.getMoney() < 100) {
            System.out.println("对不起，您当前账户不足100元，无法进行取款！");
            return;
        }

        while (true) {
            System.out.println("请您输入要取出的金额");
            double money = sc.nextDouble();
            if (money > account.getQuotaMoney()) {
                System.out.println("取款失败,您超出了单次限额，当前限额为" + account.getQuotaMoney() + "元");

            } else if (money > account.getMoney()) {
                System.out.println("取款失败,您的账户目前没有那么多钱,请重新输入，当前余额为" + account.getMoney() + "元");

            } else {
                account.setMoney(account.getMoney() - money);
                System.out.println("取款成功！这次取了" + money + "元。");
                showUser(account);
                return;

            }
        }
    }

    /**
     * 存钱功能
     *
     * @param account 当前账户对象
     * @param sc      扫描器
     */
    private static void addMoney(Account account, Scanner sc) {
        System.out.println("请您输入要存入的金额");
        double money = sc.nextDouble();
        account.setMoney(account.getMoney() + money);
        System.out.println("存入成功！这次存了" + money + "元。");
        showUser(account);
    }

    /* 显示当前账户的信息 */
    private static void showUser(Account account) {
        System.out.println("---------------------当前的账户信息如下---------------------");
        System.out.println("卡号：" + account.getCardId());
        System.out.println("户主：" + account.getUserName());
        System.out.println("密码：" + account.getPassWord());
        System.out.println("余额：" + account.getMoney());
        System.out.println("限额：" + account.getQuotaMoney());
    }

    /**
     * 用于显示当前集合所有账户对象
     *
     * @param accounts 目前账户集合
     */
    private static void showAllUser(ArrayList<Account> accounts) {
        System.out.println("-------------------当前用户列表-------------------");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("[" + accounts.get(i).getCardId() + ", " +
                    accounts.get(i).getUserName() + ", " + accounts.get(i).getQuotaMoney() + "]");
        }
    }

    /**
     * 用户开户功能的实现
     *
     * @param accounts 接收的账户集合
     * @param sc       扫描器对象
     */
    private static void register(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("------------------系统开户操作-----------------");
        /* 1.创建一个账户对象，用于后期封装信息 */
        Account account = new Account();
        /* 2.录入当前账户对象的信息 */
        System.out.println("请您输入账户用户名：");
        String userName = sc.next();
        account.setUserName(userName);
        while (true) {
            System.out.println("请您输入账户登录密码：");
            String passWord = sc.next();
            System.out.println("请您确认密码：");
            String rePassWord = sc.next();
            if (passWord.equals(rePassWord)) {
                account.setPassWord(passWord);
                break;
            } else {
                System.out.println("两次密码不一致，请您重新输入!!!!");
            }
        }
        System.out.println("请输入账户单次交易限额：");
        account.setQuotaMoney(sc.nextDouble());

        String cardId = getCardId(accounts);
        account.setCardId(cardId);

        /* 3.将账户对象添加到账户集合中 */
        accounts.add(account);

    }

    /**
     * 获取一个与其他人不重复的卡号
     *
     * @param accounts 账户对象的集合
     * @return 返回的是一个全新的卡号
     */
    private static String getCardId(ArrayList<Account> accounts) {

        Random rd = new Random();
        while (true) {
            String cardId = "";
            do {
                int number = rd.nextInt(10);
                if (!cardId.contains("" + number)) {
                    cardId += number;
                }

            } while (cardId.length() != 8);
            Account account = getAccountByCardId(accounts, cardId);
            if (account == null) {
                return cardId;
            }
        }

    }

    /**
     * 根据卡号查找账户对象
     *
     * @param accounts 账户对象集合
     * @param cardId   要查找的卡号
     * @return null或者账户对象acc
     */
    private static Account getAccountByCardId(ArrayList<Account> accounts, String cardId) {
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        return null;
    }

}

