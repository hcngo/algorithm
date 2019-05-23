package com.hcngo.example;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Scanner in = new Scanner(System.in);
        System.out.println("Enter test number: ");
        int num = in.nextInt();

        List<Integer> testCases = HelperUtil.getIntegers(in, num);
        System.out.println("testCases: " + testCases.toString());
    }
}
