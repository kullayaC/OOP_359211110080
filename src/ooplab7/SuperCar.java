package ooplab7;

public class SuperCar {
    private String brand;
    private String color;
    private String enginesize;
    private String maxspeed;
    private String origin;
    public SuperCar(){}
    public SuperCar(String b,String c, String e, String m,String o){
        this.brand=b;
        this.color=c;
        this.enginesize=e;
        this.maxspeed=m;
        this.origin=o;
    }

    @Override
    public String toString() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", enginesize='" + enginesize + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEnginesize() {
        return enginesize;
    }

    public void setEnginesize(String enginesize) {
        this.enginesize = enginesize;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}//class
