package ooplap8;

import ooplab9.Cow;

public class PetApp {
    public static void main(String[] args) {
       dog dog = new dog ("chayen",2);
       System.out.println(dog.toString());
       dog.makeNoise();

       System.out.println(dog.msg);
       Cow cow = new Cow("Namejai",5);
       System.out.println(cow.toString());
       cow.makeNoise();
//       System.out.println(cow.msg);
    }
}
