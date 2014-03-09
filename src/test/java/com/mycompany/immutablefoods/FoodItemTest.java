/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;


import com.mycompany.immutablefoods.model.FoodItem;
import junit.framework.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sibakhulu
 */
public class FoodItemTest {
    
    public FoodItemTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
   public void Testcreation() {
    FoodItem item= new FoodItem.Builder().id("item22").name("Jungle Oats").build();
    
    Assert.assertEquals(item.getId(), "item22");
    Assert.assertEquals(item.getName(), "Jungle Oats");
    
    }
    @Test
    public void  TestUpdate(){
      FoodItem item= new FoodItem.Builder().id("item22").name("Muesuli").build();
        Assert.assertEquals(item.getId(), "item22");
        Assert.assertEquals(item.getName(),"Muesuli");
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