package com.codegym.task.task04.task0407;

/* 
Cats in the Universe

*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count++;//write your code here

        Cat cat2 = new Cat();
        Cat.count++;//write your code here

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;


    }
}