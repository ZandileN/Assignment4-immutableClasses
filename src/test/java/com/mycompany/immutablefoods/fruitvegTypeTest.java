/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.immutablefoods;

import com.mycompany.immutablefoods.model.fruitvegType;
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
public class fruitvegTypeTest {
    
    public fruitvegTypeTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
     public void fruitvegtypeCreation() {
    fruitvegType fvtype= new fruitvegType.Builder().idtype("fv890").tye("Fruit").build();
    
    Assert.assertEquals(fvtype.getIdtype(), "fv890");
    Assert.assertEquals(fvtype.getType(), "Fruit");
    }
    @Test
    public void fruitvegtypeUpdate(){
    fruitvegType fvtype= new fruitvegType.Builder().idtype("fv890").tye("Fruit").build();
    fvtype= new fruitvegType.Builder().idtype("veg567").tye("Vegetable").build();
    
    Assert.assertEquals(fvtype.getIdtype(), "veg567");
    Assert.assertEquals(fvtype.getType(), "Vegetable");
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