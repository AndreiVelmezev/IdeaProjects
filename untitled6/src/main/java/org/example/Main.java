package org.example;

public class Main {
    public static void main(String[] args) {

        {
            int c = 10;
            {
                int c = 12;
                System.out.println("c=" + c);
            }
        }
    }
}