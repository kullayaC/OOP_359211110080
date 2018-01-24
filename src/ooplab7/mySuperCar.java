package ooplab7;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {

        SuperCar c1 = new SuperCar();
        c1 = inputData(c1);
        System.out.println(c1.toString());

    }//main
    private static SuperCar inputData (SuperCar c){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a SuperCar info: ");
        System.out.print("Car brand: ");
        c.setBrand(scanner.nextLine());
        System.out.print("Car color: ");
        c.setColor(scanner.nextLine());
        System.out.print("Car Enginesize: ");
        c.setEnginesize(scanner.nextLine());
        System.out.print("Car Maxspeed: ");
        c.setMaxspeed(scanner.nextLine());
        System.out.print("country of origin: ");
        c.setOrigin(scanner.nextLine());
        return c;
    }
}//class
