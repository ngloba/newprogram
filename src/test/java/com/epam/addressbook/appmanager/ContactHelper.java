package com.epam.addressbook.appmanager;

import com.epam.addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {
    FirefoxDriver driver;

    public ContactHelper(FirefoxDriver driver) {
        super(driver);

    }

    public void initContactCreation() {
        click(By.linkText("add new"));
    }

    public void fillContactDetails(ContactData contactData) {
      type(By.name("firstname"),contactData.getFirstname())  ;
      type(By.name("middlename"), contactData.getMiddlename());
      type(By.name("lastname"), contactData.getLastname());
      type(By.name("nickname"), contactData.getNickname());
      type(By.name("title"), contactData.getTitle());
      type(By.name("company"), contactData.getCompany());
      type(By.name("address"), contactData.getAddress());
      type(By.name("home"), contactData.getHomenumber());
      type(By.name("mobile"), contactData.getMobilenumber());
      type(By.name("work"), contactData.getWorknumber());
      type(By.name("fax"), contactData.getFax());
      type(By.name("email"), contactData.getEmail());
    }

    public void submitContactCreation() {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]"));

    }

    public void returntoHomePage() {
        click(By.linkText("home page"));
    }
}
