/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.FoodStore;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Sibakhulu
 */
public class FoodstoreTest {
    
    public FoodstoreTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //

    @Test
    public void FoodstoreCreation() {
        
     FoodStore store= new FoodStore.Builder().storeid("str345").name("Pick and Pay").build();
     
     Assert.assertEquals(store.getStoreid(), store.getStoreid());
     Assert.assertEquals(store.getName(), store.getName());
}
    @Test
    public void FoodstoreUpdate(){
    FoodStore store= new FoodStore.Builder().storeid("str345").name("Pick and Pay").build();
     store= new FoodStore.Builder().storeid("str400").name("Shoprite").build();
     
     Assert.assertEquals(store.getStoreid(), store.getStoreid());
     Assert.assertEquals(store.getName(),store.getName());
    
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