//condition
//        score 0-49 grade F
//        score 50-59 grade D
//        score 60-69 grade c
//        score 70-79 grade B
//        score 80-100 grade A
package ooplab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        int count;
        System.out.print("Enter your score 0-100: ");
        score = scanner.nextInt();
//        test condition score
        for (int i=1;i<=100)
        if (score<49) System.out.println("Your grade is F");
        else if (score<59) System.out.println("Your grade is D");
        else if (score<69) System.out.println("Your grade is C");
        else if (score<79) System.out.println("Your grade is B");
        else System.out.println("Your grade is A");
        for (int score=0;score<=100;score++){
            if (score<=3)
                System.out.print("Your grade is ");


        }//for









    }//main
}//class
