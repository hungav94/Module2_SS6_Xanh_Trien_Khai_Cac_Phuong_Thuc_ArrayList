package com.company;

public class Main {

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add(0,"America");
        System.out.println("1: " + list);
        list.add(1,"Vietnam");
        System.out.println("1: " + list);
        list.add(2,"Japan");
        System.out.println("1: " + list);
        list.add(3,"China");
        System.out.println("1: " + list);
        list.add(4,"Nga");
        System.out.println("1: " + list);
        list.remote(1);
        System.out.println("5: " + list);
    }
}
