package com.epam.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String title;
    private final String company;
    private final String address;
    private final String homenumber;
    private final String mobilenumber;
    private final String worknumber;
    private final String fax;
    private final String email;

    public ContactData(String firstname, String middlename, String lastname, String nickname, String title, String company, String address, String homenumber, String mobilenumber, String worknumber, String fax, String email) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homenumber = homenumber;
        this.mobilenumber = mobilenumber;
        this.worknumber = worknumber;
        this.fax = fax;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomenumber() {
        return homenumber;
    }

    public String getMobilenumber() {
        return mobilenumber;
    }

    public String getWorknumber() {
        return worknumber;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }
}
