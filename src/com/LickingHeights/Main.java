package com.LickingHeights;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int size = 10;
        int lowestNumber = 80;
        int highestNumber = 90;

        int[] array = createNumberArray(size, lowestNumber, highestNumber);
        //String[] adjectives= {"ugly ", "tall ", "big ", "tiny "};
        //String[] places= {"McDonalds", "home", "bathroom", "store"};
        //String[] people= {"Alex", "Bella", "Sarah", "Amber"};
        //String[] verbs= {"running", "walking" ,"breathing" ,"talking"};
        //String[] times= {"4:00", "7:15" ,"2:40" ,"3:33"};
        //String[] things= {" Hot Cheetos", " cheetah" ," dog" ," toothbrush"};
        //System.out.println("I was "+ sentenceGenerator(verbs)+ " down the "+ sentenceGenerator(places));
        //System.out.println(" around "+sentenceGenerator(times)+ " with my best friend "+ sentenceGenerator(people));
        //System.out.println(" and we "+sentenceGenerator(verbs)+ " a  "+ sentenceGenerator(adjectives)+ sentenceGenerator(things));
        //System.out.println("that was "+sentenceGenerator(verbs)+sentenceGenerator(things)+"s");
        //System.out.println("The sum of the array is "+ sum(array));
        //System.out.println("The minimum of the array is "+ min(array));
        //System.out.println("The maximum of the array is "+ max(array));
        //printArray(array);
//        Pattern1();
//        Pattern2();
//        Pattern3();
//        Pattern4();
//        Pattern5();
          //bubbleSort();
        String[] sizes= {"Big", "lil", "Tiny"};
        String[] color= {" red"," blue", " purple"};
        String[] item= {" fish ", " clock", " time"};
        System.out.println(print80sRapperName(sizes)+print80sRapperName(color)+print80sRapperName(item));

    }
        public static String sentenceGenerator(String[] array){
        Random random = new Random();
            return array [random.nextInt(array.length)];
        }
        public static String print80sRapperName(String[] array){
        Random random = new Random();
            return array [random.nextInt(array.length)];
        }


    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];
        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static int createRandomNumber(int lowestNumber, int highestNumber) {
        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }
    public static int sum(int[] array){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return sum;
    }
    public static int min(int[] array) {
        int min =array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min= array[i];
            }
        }
        return min;
    }
    public static int max(int[] array) {
        int max =array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max= array[i];
            }
        }
        return max;
    }
    public static void Pattern1() {
        for (int rows = 0; rows < 6; rows++) {
            for (int columns = 0; columns < 6; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern2() {
        for (int rows = 1; rows < 7; rows++) {
            for (int columns = 0; columns < 7; columns++) {
                System.out.print(rows);
            }
            System.out.println();
        }
    }
    public static void Pattern3() {
        for (int rows= 1; rows < 7; rows++) {
            for (int columns = 1; columns < 7; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }
    public static void Pattern4(){
        for (int rows = 1; rows < 7; rows++) {
            for (int columns = 0; columns < rows; columns++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void Pattern5(){
        for (int rows = 2; rows < 8; rows++) {
            for (int columns = 1; columns < rows; columns++) {
                System.out.print(columns);
            }
            System.out.println();
        }
    }




}

