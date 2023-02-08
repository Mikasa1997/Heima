package com.enze.d1_package;


import com.enze.d1_package.subpackage.Student;

public class Test {
    public static void main(String[] args) {
        /*1.同一个包下的类可以互相访问。 */
        int onlineNumber = User.onlineNumber;
        System.out.println(onlineNumber);
        /*2.不同包下的类，需要先导包才能使用。 */
        Student student = new Student();
        /*2.如果这个类中使用不同包下的相同类名，此时默认只能导入一个类的包，另一个类要是用全名访问 */
        com.enze.d1_package.subpackage2.Student student2 = new com.enze.d1_package.subpackage2.Student();

    }
}
