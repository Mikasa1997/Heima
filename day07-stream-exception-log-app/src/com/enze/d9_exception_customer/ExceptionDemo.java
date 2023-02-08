package com.enze.d9_exception_customer;
/* 年龄小于0岁，大于200岁就是一个异常 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            checkAge2(230);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void checkAge(int age) throws EnzeAgeIlleagalException {
        if(age < 0 || age >200){
            //抛出一个异常
            throw new EnzeAgeIlleagalException(age + " is illegeal");
        }else {
            System.out.println("年龄合法：推荐商品给其购买");
        }
    }
    public static void checkAge2(int age){
        if(age < 0 || age >200){
            //抛出一个异常
            throw new EnzeAgeIlleagalRunTimeException(age + " is illegeal");
        }else {
            System.out.println("年龄合法：推荐商品给其购买");
        }
    }
}
