package MidTerm;

import java.util.Scanner;

public class CalOT {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String ID = getID();
        String Name = getName();
        float Salary = getSalary();
        float OverTime = getOverTime();
        calculateTax(Salary,OverTime);
        ShowDataInfo(ID,Name,Salary,OverTime);
    }//main

    private static void ShowDataInfo(String ID, String Name, float Salary, float OverTime) {
        CalOT x = new CalOT();
        System.out.println("ID: "+ID);
        System.out.println("Name: "+Name);
        System.out.println("Salary: "+Salary);
        System.out.println("OverTime: "+OverTime);
        System.out.println("Tax is: "+x.calculateTax(Salary,OverTime));
    }//ShowDataInfo

    private static float calculateTax(float x, float y) {
        float sum = x+y;
        System.out.println("Salary Total: = "+sum);
        if (sum>=100000) {return (sum*10)/100;}
        else if (sum>=70000){return (sum*7)/100;}
        else if (sum>=50000) {return (sum*5)/100;}
        else if (sum>=30000) {return (sum*3)/100;}
        else{return (sum*1)/100;}
    }//calculateTax

    private static Float getOverTime() {
        System.out.print("Enter your OverTime : ");
        Float OverTime = sc.nextFloat();
        return OverTime;
    }//getOverTime

    private static int getSalary() {
        System.out.print("Enter your Salary : ");
        int Salary = sc.nextInt();
        return Salary;
    }//getSalary

    private static String getName() {
        System.out.print("Enter your Name : ");
        String Name = sc.nextLine();
        return Name;
    }//getName

    private static String getID() {
        System.out.print("Enter your ID : ");
        String ID = sc.nextLine();
        return ID;
    }//getID

}//class
