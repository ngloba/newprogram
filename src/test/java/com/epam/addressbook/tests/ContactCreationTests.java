package com.epam.addressbook.tests;

import com.epam.addressbook.model.ContactData;
import org.testng.annotations.*;

public class ContactCreationTests extends TestBase{



  @Test
  public void contactCreationTests() throws Exception {

    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactDetails(new ContactData("Nataliia", "Nat", "Globa", "nglo", "miss", "Epam", "wisniows atreet", "56447889", "25467487", "212114", "1214254", "dsdsdk@khfjd.fjf"));
    app.getContactHelper().submitContactCreation();
    app.getContactHelper().returntoHomePage();

  }
}
