package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main2 {
    public static void main(String[] args){
        HashMap users = new HashMap();

        HashMap<String, Integer> newUsers = new HashMap<>();
        newUsers.put("Adam",21);
        newUsers.put("Kevin",25);
        newUsers.put("Lewis",31);

        System.out.println("New users are; " + newUsers.get("Adam"));

        //HashMap input for hashmap users
        users.put("Sandra",23);
        users.put("Adam",31);
        users.put("Sameer",34);

        Iterator iterator = users.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry pair = (Map.Entry) iterator.next();

            //System.out.println("Key : " + pair.getKey() + " ,"+ " Value :" + pair.getValue());
        }

        //System.out.println(users.entrySet());
    }
}
