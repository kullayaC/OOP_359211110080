package ooplap8;

public class dog extends pet{
    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Box Box !!!");
    }
}
