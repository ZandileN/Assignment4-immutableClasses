/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;
import com.mycompany.immutablefoods.model.PlaceOrders;
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
public class PlaceOrderTest {
    
    public PlaceOrderTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void PlaceOrderCreation(){
     PlaceOrders pl= new PlaceOrders.Builder().ordernum(6).name("Main Meal").qaunt(4).build();
     
     Assert.assertEquals(pl.getOrdernum(),pl.getOrdernum());
     Assert.assertEquals(pl.getName(), pl.getName());
     Assert.assertEquals(pl.getQaunt(), pl.getQaunt());
  }
     @Test
     public void PlaceOrderUpdate(){
     PlaceOrders pl= new PlaceOrders.Builder().ordernum(90).name("Drinks").qaunt(3).build();
     
     pl=new PlaceOrders.Builder().ordernum(90).name("Vegetable").qaunt(2).build();
     
     Assert.assertEquals(pl.getOrdernum(),pl.getOrdernum());
     Assert.assertEquals(pl.getName(), pl.getName());
     Assert.assertEquals(pl.getQaunt(),pl.getQaunt());
     
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