package com.enze.d9_api_object;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student("周雄",'男',19);
        String rs = s1.toString();
        System.out.println(rs);

        Student s2 = new Student("周雄",'男',19);

        System.out.println(s1.equals(s2));

    }
}
