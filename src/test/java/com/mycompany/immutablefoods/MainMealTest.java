/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import  com.mycompany.immutablefoods.model.MainMeal;
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
public class MainMealTest {
    
    public MainMealTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
 @Test
  public void mealCreation(){
     
     MainMeal m= new MainMeal.Builder().Mealid("Zngr0001").Name("ZingerWings")
             .price(14.00).build();
     
     Assert.assertEquals(m.getMealid(), "Zngr0001");
     Assert.assertEquals(m.getName(), "ZingerWings");
     Assert.assertEquals(m.getPrice(), 14.00);
 }
 @Test
  public void mealUpdate(){ 
     MainMeal m= new MainMeal.Builder().Mealid("Zngr0001").Name("Zinger Wings ")
             .price(14.00).build();
     
     m= new MainMeal.Builder().Mealid("Zngr0001").Name("Zinger Wings double").build();
     
     Assert.assertEquals(m.getMealid(),"Zngr0001");
     Assert.assertEquals(m.getName(), "Zinger Wings double");
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