package ooplap8;

public class Rectangle implements shape{
    private double width;
    private double length;

    public Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    //to string()

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    //getter and setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }
}
