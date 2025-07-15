package com.example.BaseClasses;

public class Client {
    private Integer clientId;
     private String firstName;
     private String lastName;
     private String email;
     private  String phoneNumber;
     private String password;
    public Client(Integer clientId, String firstName, String lastName, String email, String phoneNumber,
            String password) {
        this.clientId = clientId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }
    public Integer getClientId() {
        return clientId;
    }
    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Override
    public String toString() {
        String result="clientId: "+clientId;
        result+="\nfirstname: "+firstName;
        result+="\nlastname: "+lastName;
        result+="\nemail: "+email;
        result+="\nphoneNumber: "+phoneNumber;
        result+="\npassword: "+password;
        return result;
    }

    
}

