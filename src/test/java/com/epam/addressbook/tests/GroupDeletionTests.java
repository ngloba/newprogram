package com.epam.addressbook.tests;


import com.epam.addressbook.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion()  {

        app.getNavigationHelper().gotoGroupPage();

        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }
//        int before = app.getGroupHelper().getGroupCount();
        List<GroupData> before = app.getGroupHelper().getGroupList();

        app.getGroupHelper().selectGroups(0);
        app.getGroupHelper().deleteSelectedGroups();
        app.getGroupHelper().returntoGroupPage();
//        int after = app.getGroupHelper().getGroupCount();
        List<GroupData> after = app.getGroupHelper().getGroupList();

        Assert.assertEquals(after.size(), before.size()-1);

//        before.remove(0);
//        for (int i = 0; i < after.size(); i++) {
//            Assert.assertEquals(after.get(i), before.get(i));
//        Assert.assertEquals(after, before);

    }

}
