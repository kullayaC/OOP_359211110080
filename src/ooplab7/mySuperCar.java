package ooplab7;

import java.util.ArrayList;
import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        ArrayList<SuperCar> mycarlist = new ArrayList<SuperCar>();
        mycarlist = inputData(mycarlist);
        System.out.println("Show Super Car Info");
        for (int i = 0; i < mycarlist.size(); i++) {
            System.out.println(mycarlist.get(i).getSuperCarInfo());
        }

    }//main

    private static ArrayList inputData(ArrayList mycarlist) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert super car info");
        for (int i = 0; i < 10; i++) {
            System.out.println("Super car:" + (i + 1));
            System.out.print("Car brand: ");
            String b = scanner.nextLine();
            System.out.print("Car color: ");
            String c = scanner.nextLine();
            System.out.print("Car Enginesize: ");
            String e = scanner.nextLine();
            System.out.print("Car Maxspeed: ");
            String m = scanner.nextLine();
            System.out.print("country of origin: ");
            String o = scanner.nextLine();
            SuperCar car = new SuperCar(b, c, e, m, o);
            mycarlist.add(car);
        }
        return mycarlist;
    }
}//class

