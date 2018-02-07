package ooplab9;

public class Address {
    private String homeno;
    private String province;
    private String postCode;

    public Address(String homeno, String province, String postCode) {
        this.homeno = homeno;
        this.province = province;
        this.postCode = postCode;
    }
    //toString()

    @Override
    public String toString() {
        return "Address{" +
                "homeno='" + homeno + '\'' +
                ", province='" + province + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }

    //getter and setter methods
    public String getHomeno() {
        return homeno;
    }

    public void setHomeno(String homeno) {
        this.homeno = homeno;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}//class
