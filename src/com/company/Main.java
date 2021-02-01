package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code

        ArrayList arrayList = new ArrayList();
         arrayList.add("Mazda");
         arrayList.add("Honda");
         arrayList.add("Rush");
         arrayList.add("Nissan");

        //For each
         for (Object ar:arrayList) {
            System.out.println("Item " + ar);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Object is " + arrayList.get(i));
        }



























//        int[] myArray = { 1,2,3,4,5};
//        String[] stringArray = {"Hi","How","What"};
//        short[] shortArray = {1,234,56,};
//        float[] floatArray = {3.4f,5.67f,6.98f};
//        double[] doubleArray = {23.44,56.78,89.67};
//
//        int[] myNums = new int[5];
//        String[] myStrings = new String[3];
//
//        myNums[0] = 34;
//        myNums[1] = 43;
//        myNums[2] = 45;
//        myNums[3] = 65;
//        myNums[4] = 76;
//
//        myStrings[0] = "Hello";
//        myStrings[1] = "I'm";
//        myStrings[2] = "Adam";
//
//        for (int i = 0; i < myStrings.length ; i++) {
//
//            System.out.println("Item "+ myStrings[i]);
//
//        }
    }
}
