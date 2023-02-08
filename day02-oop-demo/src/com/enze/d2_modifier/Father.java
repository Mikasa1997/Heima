package com.enze.d2_modifier;

public class Father {
    // 1.定义私有的成员  private:只能本类中访问
    private void privateMethod(){
        System.out.println("=========private==========");
    }
    // 2.缺省修饰的成员: 只能本类访问
    void method(){
        System.out.println("===========缺省============");
    }
    // 3.protected修饰的方法： 本类、同包、其他包的子类
    protected void protectedMethod(){
        System.out.println("===========protected============");
    }
    // 3.public修饰的方法： 本类、同包、其他包的子类
    public void publicMethod(){
        System.out.println("===========public============");
    }

    public static void main(String[] args) {
        Father f = new Father();
        f.method();
        f.publicMethod();
        f.privateMethod();
        f.protectedMethod();
    }
}
