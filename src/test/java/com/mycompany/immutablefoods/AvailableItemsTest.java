/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.AvailableItems;
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
public class AvailableItemsTest {
    
    public AvailableItemsTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void AvailableItemsCreation() {
         AvailableItems availitem= new AvailableItems.Builder().availItemno("chkn685")
                                                               .name("Chicken and Chips")
                                                                .type("Main Meal").build();
         Assert.assertEquals(availitem.getAvailItemno(), availitem.getAvailItemno());
         Assert.assertEquals(availitem.getName(), availitem.getName());
         Assert.assertEquals(availitem.getType(), availitem.getType());
     }
     @Test
     public void AvailableItemsUpdate(){
      AvailableItems availitem= new AvailableItems.Builder().availItemno("Appj090")
                                                               .name("Chicken and Chips")
                                                                .type("Main Meal").build();
      availitem= new AvailableItems.Builder().availItemno("Appj090").name("Apple Juice").type("Soft drink").build();
      
      Assert.assertEquals(availitem.getAvailItemno(),availitem.getAvailItemno());
      Assert.assertEquals(availitem.getName(),availitem.getName());
      Assert.assertEquals(availitem.getType(),availitem.getType());
 }

    @BeforeClass
    public static void setUpClass() throws Exception {
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