package com.epam.addressbook.tests;

import com.epam.addressbook.appmanager.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import sun.plugin2.util.BrowserType;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws Exception {

        app.init();
    }


    @AfterMethod
    public void tearDown() {
        app.stop();
    }



}
