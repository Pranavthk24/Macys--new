/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.com.company;

/**
 *
 * @author pranav
 */
public class ContactUS {
    private String firstname;
    private String lastname;
    private String address1;
    private String zip;
    private String state;
    private String city;
    private String phone;

    public ContactUS(String firstname, String lastname, String address1, String zip, String state, String city, String phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address1 = address1;
        this.zip = zip;
        this.state = state;
        this.city = city;
        this.phone = phone;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ContactUS{" + "firstname=" + firstname + ", lastname=" + lastname + ", address1=" + address1 + ", zip=" + zip + ", state=" + state + ", city=" + city + ", phone=" + phone + '}';
    }

    
}
