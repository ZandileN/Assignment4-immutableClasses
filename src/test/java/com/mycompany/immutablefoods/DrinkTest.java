/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.Drink;
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
public class DrinkTest {
    
    public DrinkTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void DrinkCreation(){
      Drink drink= new Drink.Builder().drinkid("cc1211").name("Spare leta").price(12.99).build();
      
      Assert.assertEquals(drink.getDrinkid(),"cc1211");
      Assert.assertEquals(drink.getName(), "Spare leta");
      Assert.assertEquals(drink.getPrice(), 12.99);
     }
     @Test
     public void DrinkUpdate(){
      Drink drink =new Drink.Builder().drinkid("jive1322").name("Jive").price(10.99).build();
      drink= new Drink.Builder().drinkid("jive1322").name("Jive cola").price(10.99).build();
      
      Assert.assertEquals(drink.getDrinkid(), "jive1322");
      Assert.assertEquals(drink.getName(), "Jive cola");
      Assert.assertEquals(drink.getPrice(), 10.99);
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