package com.WZC;

public class Looping_Excersice {
    public static void main(String[] args) {
        int[] arandom = new int[20];
        for (int i = 0; i < arandom.length; i++)
            arandom[i] = (int) (Math.random());

        for (int s : arandom)
            System.out.println(s);
    }
}
