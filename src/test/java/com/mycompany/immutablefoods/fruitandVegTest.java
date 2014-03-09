/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;
import com.mycompany.immutablefoods.model.fruitandVeg;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 *
 * @author Sibakhulu
 */
public class fruitandVegTest {
    
    public fruitandVegTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void fruitVegCreation(){
    fruitandVeg fr= new fruitandVeg.Builder().fvegid("Fr234").name("Water lemon").price(16.40).build();
    
    Assert.assertEquals(fr.getId(), "Fr234");
    Assert.assertEquals(fr.getName(), "Water lemon");
    Assert.assertEquals(fr.getPrice(),16.40);
     }
     @Test
     public void fruitandVegUpdate(){
      fruitandVeg fr= new fruitandVeg.Builder().fvegid("But456")
              .name("Butternut").build();
      
      fr= new fruitandVeg.Builder().fvegid("Spin234").name("Spinach").price(8.80).build();
      
      Assert.assertEquals(fr.getId(), "Spin234");
      Assert.assertEquals(fr.getName(), "Spinach");
      Assert.assertEquals(fr.getPrice(), 8.80);
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