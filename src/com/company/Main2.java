package com.company;

import java.util.HashMap;

public class Main2 {
    public static void main(String[] args){
        HashMap users = new HashMap();
        users.put("Sandra",23);
        users.put("Adam",31);
        users.put("Sameer",34);

        System.out.println(users.entrySet());
    }
}
