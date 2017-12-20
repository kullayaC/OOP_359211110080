package ooplap6;

import java.lang.management.BufferPoolMXBean;

public class myStringBuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        System.out.println(buffer);
        buffer.append(20);
        System.out.println(buffer);
        buffer.insert(5, " ");
        System.out.println(buffer);
//        System.out.println(buffer.reverse());
        buffer.append(" RMUTSV");
        System.out.println(buffer);
        buffer.delete(6, 8);
        System.out.println(buffer);
        printBuffer(buffer);
    }//main

    private static void printBuffer(StringBuffer buffer) {
        printBuffer(buffer);
    }


}//class
