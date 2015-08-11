/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcartapp2;

import org.junit.Assert;
import org.junit.Test;


public class ShoppingCartAppTest {
    
    @Test
    public void testCreateEmptyShoppingCart(){
        ShoppingCart cart= new ShoppingCart();
        Assert.assertEquals(0,cart.getProductCount());
        
  
    
    }
    
   
    @Test
	public void testAddSingleProductToShoppingCart() {
		ShoppingCart cart = new ShoppingCart();
		Product product = new Product("Gatsby hair cream", 1, 30.0);
		cart.addProduct(product);
		Assert.assertEquals(1, cart.getProductCount());
                Assert.assertEquals(30.0,cart.getTotalCartValue(),0.0);
	}
        

}


