package package1;

import package2.Address;

import java.time.LocalDate;

public class Customer extends Person {
    private String customerId;
    private String nickName;
    private String email;
    private Address address;


    public Customer(String firstName, String lastName, LocalDate birthDate, String customerId, String nickName, String email, Address address) {
        super(firstName, lastName, birthDate);
        this.customerId = customerId;
        this.nickName = nickName;
        this.email = email;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static void main(String[] args) {
        Customer customer = new Customer(
                "David", "Cho", LocalDate.of(1986, 12, 19),
                "1234", "Hoontime", "david.hoontime@gmail.com",
                new Address("Bethoven Str.", 53, "Chemnitz", "Saxony", "Germany"));

        System.out.println(customer.getAddress());
        System.out.println(customer.getFirstName());
        System.out.println(customer.getLastName());
    }


}
