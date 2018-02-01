package ooplap8;

public class shapeApp {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(20,30);
        System.out.println(rectangle.toString());
        System.out.println("Object area :"+rectangle.getArea());

        Triangle triangle=new Triangle(15,30);
        System.out.println(triangle.toString());
        System.out.println("Object area::"+triangle.getArea());

    }
}
