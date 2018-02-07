package ooplap8;

public abstract class pet {
    String msg="Hello";
    private  String name;
    private  int age;
    //constructor
    public pet (String name, int age){
        this.name=name;
        this.age=age;
    }
    //abstract method
    protected abstract void makeNoise();
    //toString()

    @Override
    public String toString() {
        return "pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}//class
