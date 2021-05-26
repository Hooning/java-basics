package package2;

public class Address {
    private String street;
    private int houseNumber;
    private String city;
    private String state;
    private String country;

    public Address(String street, int houseNumber, String city, String state, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String getFullAddress() {
        return street +  " " + houseNumber + ", " + city + ", " + state + ", " + country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
