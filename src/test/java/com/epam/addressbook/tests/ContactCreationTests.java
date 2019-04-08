package com.epam.addressbook.tests;

import com.epam.addressbook.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class ContactCreationTests extends TestBase{



  @Test
  public void contactCreationTests() throws Exception {
    List<ContactData> before = app.getContactHelper().getContactList();
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactDetails(new ContactData("Nataliia", "NN", "Globa", null, null, null, null, null, null, null, null, null));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returntoHomePage();

    List<ContactData> after = app.getContactHelper().getContactList();

    Assert.assertEquals(after.size(), before.size()+1);
  }
}
