package com.epam.addressbook.appmanager;

import com.epam.addressbook.model.ContactData;
import com.epam.addressbook.model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class ContactHelper extends HelperBase {
   // FirefoxDriver driver;

    public ContactHelper(WebDriver driver) {
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

//      if (isElementPresent(By.name("new_group"))) {
 //         new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
//      }
    }

    public void submitContactCreation() {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]"));

    }

    public void returntoHomePage() {
        click(By.linkText("home page"));
    }

    public void selectContact() {
        //click(By.id("10"));
       click(By.xpath("(.//input[@type='checkbox'])"));
      //  click(By.cssSelector("img[alt='Edit']"));  //ContactModification
    }


    public void deleteSelectedContacts() {

       click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Select all'])[1]/following::input[2]"));
        driver.switchTo().alert().accept();

    }


    public void initContactModification() {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='dsdsdk@khfjd.fjf'])[1]/following::img[2]"));
    }

    public void submitContactModification() {
        click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]"));
    }

    public void createContact(ContactData contact) {
        initContactCreation();
       fillContactDetails(contact);
        submitContactCreation();
       returntoHomePage();

    }

    public boolean isThereAContact() {
        return isElementPresent(By.name("selected[]"));//(By.xpath("(.//input[@type='checkbox'])"));
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<ContactData>();
        List<WebElement> elements = driver.findElements(By.name("selected[]"));
        for (WebElement element : elements) {
            String lastname = element.getText();
            String firstname = element.getText();
            ContactData contact = new ContactData(firstname, null, lastname, null, null, null, null, null, null, null, null, null );
            contacts.add(contact);
        }

        return contacts;
    }
}
