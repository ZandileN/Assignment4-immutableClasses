/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.FoodCategory;
import junit.framework.Assert;
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
public class FoodCatergoryTest {
    
    public FoodCatergoryTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void FoodCatergoryCreation() {
        FoodCategory foodcat= new FoodCategory.Builder().id("catDrnk90").name("Drink").type("Soft drink ").build();
        
        Assert.assertEquals(foodcat.getCatid(),"catDrnk90");
        Assert.assertEquals(foodcat.getName(),"Drink");
        Assert.assertEquals(foodcat.getType(),"Soft drink");
        
    }
    @Test
    public void FoodCatergoryUpdate(){
    FoodCategory foodcat= new FoodCategory.Builder().id("catDrnk90").name("Drink").type("Soft drink ").build();
     foodcat= new FoodCategory.Builder().id("catDrnk80").name("Drink").type("Cooldrink").build();
    
        
        Assert.assertEquals(foodcat.getCatid(), "catDrnk80");
        Assert.assertEquals(foodcat.getName(), "Drink");
        Assert.assertEquals(foodcat.getType(), "Cooldrink");
    
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