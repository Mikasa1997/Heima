package com.enze.d6_timer;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip1 = InetAddress.getLocalHost();
        System.out.println(ip1);
    }
}
