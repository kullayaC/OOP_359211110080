package ooplap2;

import com.sun.javaws.jnl.ShortcutDesc;

public class TestVariable {
    public static void main(String[] args) {
//    Integer
        int i;
         i = 10;
        System.out.println("i= "+10);
        int j = 20;
        System.out.println("j ="+j);
        System.out.println("j ="+(i*j));
        System.out.println("j ="+(i/j));

//        double
        double v = 50.5;
        System.out.println("v="+v);

        i = (int) v;
        System.out.println(i);
        System.out.println(v);
//        charector
        char c= 'x';
        System.out.println(c);
//        string
        String s = "Hello, world";
        System.out.println(s);
        String name ="I'm Bow";
        System.out.println(s+ " "+name);
        String msg = s.concat (" "+name);
        System.out.println(msg);
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.length());
        System.out.println(msg.replace( 'o', 'g'));
//        Boolean
        boolean b = true;
        boolean b1 =false;
        System.out.println(b+" "+b1);

        //        Shortcut Operator
        int number =10;
        System.out.println(number);
        number+=1;//number = number+1;
        number-=5;//number = number-5;
        int x = number++;

        String n = "20.20";
        //int age = Integer.parseInt(n);
        double age = Double.parseDouble(n);
        System.out.println(age);







    }//main

}//class
