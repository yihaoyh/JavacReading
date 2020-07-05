package com.yihao.demo;

public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (a < 2 * b + b * c) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}
