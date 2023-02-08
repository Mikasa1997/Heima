package com.enze.d11_genericity_limit;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

    }
    public void go(ArrayList<? extends Car> cars){

    }
}

class Car{

}
class BENZ extends Car{

}

class BMW extends Car{

}