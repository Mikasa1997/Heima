package com.enze.d6_innerclass;

public class Test {
    public static void main(String[] args) {
        People.Heart heart = new People().new Heart();
        heart.show();
    }
}

class People{
    private int heartBeatr = 100;
    public class Heart{
        int heartBeatr = 150;
        public void show(){
            System.out.println(new People().heartBeatr);
        }

    }


}