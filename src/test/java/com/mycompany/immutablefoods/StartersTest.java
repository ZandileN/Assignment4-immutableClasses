/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.Starters;
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
public class StartersTest {
    
    public StartersTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void StartersCreation() {
     Starters starter= new Starters.Builder().Starterid("St1234")
                                             .Name("Vanilla Ice creams")
                                              .qauntity(4).build();
     
     Assert.assertEquals(starter.getStarterid(), "St1234");
     Assert.assertEquals(starter.getName(), "Vanilla Ice creams");
     Assert.assertEquals(starter.getQaunt(), 4);
    }
    @Test
    public void StarterUpdate(){
    Starters starter= new Starters.Builder().Starterid("St1234")
                                             .Name("Vanilla Ice creams")
                                              .qauntity(4).build();
    starter= new Starters.Builder().Starterid("St0201")
                                   .Name("yoghurt")
                                    .qauntity(5).build();
     
     Assert.assertEquals(starter.getStarterid(), "St0201");
     Assert.assertEquals(starter.getName(), "yoghurt");
     Assert.assertEquals(starter.getQaunt(), 5);
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