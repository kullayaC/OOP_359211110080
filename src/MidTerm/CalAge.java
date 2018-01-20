package MidTerm;

import java.util.Scanner;

public class CalAge {
    public static void main(String[] args) {
        int year = 2561;
        int yeardate;
        Scanner scanner = new Scanner(System.in);

        for (int i = 1;i<=3;i++) {
            System.out.print("Enter Year:");
            yeardate = scanner.nextInt();
            System.out.println("Age " +i +":" +" " +(year-yeardate));
            if (i==3)
                System.out.println("Thank you");
        }

    }//main
}//class
