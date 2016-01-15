package com.course;

import java.util.Arrays;

/**
 * Created by Eigenaar on 15-1-2016.
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] input = {5, 20, 40, 15, 1, 30, 100, 6, 300, 23, 48};

        Arrays.sort(input);

        for(int number : input){
            System.out.println(number);
        }
        int[] input2 = Arrays.copyOfRange(input, 3, 8);
        System.out.println("Values 3 to 8 are:");

        for(int number : input2){
            System.out.println(number);
        }
    }
}
