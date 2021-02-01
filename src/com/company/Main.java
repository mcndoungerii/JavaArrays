package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code
        int[] myArray = { 1,2,3,4,5};
        String[] stringArray = {"Hi","How","What"};
        short[] shortArray = {1,234,56,};
        float[] floatArray = {3.4f,5.67f,6.98f};
        double[] doubleArray = {23.44,56.78,89.67};

        int[] myNums = new int[5];
        String[] myStrings = new String[3];

        myNums[0] = 34;
        myNums[1] = 43;
        myNums[2] = 45;
        myNums[3] = 65;
        myNums[4] = 76;

        myStrings[0] = "Hello";
        myStrings[1] = "I'm";
        myStrings[2] = "Adam";

        for (int i = 0; i < myStrings.length ; i++) {

            System.out.println("Item "+ myStrings[i]);

        }
    }
}
