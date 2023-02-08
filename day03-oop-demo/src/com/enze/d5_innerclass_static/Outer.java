package com.enze.d5_innerclass_static;

public class Outer {
    private String outerName;
    public static int a = 100;
    public static class inner {
        private String name;
        private int age;
        private String schoolName;

        public inner() {
        }

        public inner(String name, int age, String schoolName) {
            this.name = name;
            this.age = age;
            this.schoolName = schoolName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        public void show(){
            System.out.println("名称：" + name);
        }
    }
}
