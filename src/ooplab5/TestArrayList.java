package ooplab5;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        //Array
        ArrayList list = new ArrayList();
        list.add("Bank");
        list.add("Bow");
        list.add("Beam");
        System.out.println(list);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        list.add(1,"kullaya");
        System.out.println(list);
//        print with for loop
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.indexOf("kullaya"));
        list.set(1,"Sand");
        System.out.println(list);



    }//main
}//class
