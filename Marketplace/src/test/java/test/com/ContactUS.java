package test.com;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author pranav
 */
public class ContactUS {

    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String branch;
    private String inquiryType;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String message;

    public ContactUS(String firstname, String lastname, String email, String phone, String branch, String inquiryType, String address, String city, String state, String zip, String message) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.branch = branch;
        this.inquiryType = inquiryType;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.message = message;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getInquiryType() {
        return inquiryType;
    }

    public void setInquiryType(String inquiryType) {
        this.inquiryType = inquiryType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ContactUS{" + "firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", phone=" + phone + ", branch=" + branch + ", inquiryType=" + inquiryType + ", address=" + address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", message=" + message + '}';
    }

        
  
}
