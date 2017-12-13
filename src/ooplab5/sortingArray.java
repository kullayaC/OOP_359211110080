package ooplab5;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sortingArray {
    private static  final int MAX = 10;
    private static int number []= new  int[MAX];
    public static void main(String[] args) {
        inputData (number,number.length);

        showData (number,number.length);
        findMaxData (number);
        findMinData (number);
        System.out.println("Before sortiong: ");
        sortingData (number);

        //ascending order
        sortingDataAscending(number);
        //descending order
        sortingDataDescending(number);

    }//main

    private static void sortingDataDescending(int[] number) {
        System.out.println("Descending order: ");
       // Arrays.sort(number, Collections.reverseOrder());
        showData(number,number.length);
    }//sortingDataDescending

    private static void sortingDataAscending(int[] number) {
        System.out.println("Ascending order: ");
        Arrays.sort(number);
        showData(number,number.length);
    }//sortingDataAscending


    private static void sortingData(int[] number) {
    }//sortingData

    private static void findMinData(int[] number) {
        int min = number[0];
        for (int i=0;i<number.length;i++) {
            if (min >= number[i])
                min = number[i];
        }//for
        System.out.println("The maximun data: "+min);
    }//findMindata

    private static void findMaxData(int[] number) {
        int max = number[0];
        for (int i=0;i<number.length;i++) {
            if (max <= number[i])
                max = number[i];
        }//for
        System.out.println("The maximun data: "+max);
    }//findmax


    private static void showData(int[] number, int length) {
        System.out.print("Data in array: ");
        for (int i=0;i<length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }//showdata

    private static void inputData(int[] number, int length) {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<length;i++)
        {
            System.out.println("Enter an integer["+i+"]: ");
            number[i]=scanner.nextInt();
    }
}//inputdata
}//class
