package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code
        int[] myArray = { 1,2,3,4,5};
        String[] stringArray = {"Hi","How","What"};
        short[] shortArray = {1,234,56,};
        float[] floatArray = {3.4f,5.67f,6.98f};
        double[] doubleArray = {23.44,56.78,89.67};

        for (int i = 0; i < doubleArray.length ; i++) {

            System.out.println("Item "+ doubleArray[i]);

        }
    }
}
