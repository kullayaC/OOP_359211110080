package ooplab9;

import jdk.nashorn.internal.scripts.JO;

public class myPersonApp {
    public static void main(String[] args) {
        Address address =new Address("80","Suratthani","84150");
        Job job = new Job("Admistration",15000);
        Person person= new Person("080","Kullaya Chandet",address,job);
        System.out.println(person.toString());
        person.getJob().setSalary(20000);
        System.out.println("Name"+person.getName()+
                "Salary:"+person.getJob().getSalary());

    }//main
}//class
