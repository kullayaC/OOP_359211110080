package ooplap8;

public class Triangle implements shape {
    private double width;
    private double lenght;

    public Triangle(double width, double lenght){
        this.width=width;
        this.lenght=lenght;
    }
    //to String()

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", lenght=" + lenght +
                '}';
    }

    //getter and setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return 0.5*width*lenght;
    }
}//class
