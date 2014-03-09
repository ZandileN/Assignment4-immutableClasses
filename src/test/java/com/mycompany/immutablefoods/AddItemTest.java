/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.AddItem;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sibakhulu
 */
public class AddItemTest {
    
    public AddItemTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void AddItemCreation() {
         
     AddItem additem= new AddItem.Builder().itemid("ch385").name("Cheese").build();
     Assert.assertEquals(additem.getItemId(),additem.getItemId());
     Assert.assertEquals(additem.getName(),additem.getName());
   }
 @Test
     public void AddItemUpdate() {
     AddItem additem= new AddItem.Builder().itemid("ch385").name("Cheese").build();
     
     additem= new AddItem.Builder().itemid("ydh098").name("yoghurt").build();
     
     Assert.assertEquals(additem.getItemId(), additem.getItemId());
     Assert.assertEquals(additem.getName(),additem.getItemId());
}
    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}