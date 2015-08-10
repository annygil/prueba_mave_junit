package com.mycompany.shoppingcartapp2;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

    //asdfghjklñ

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class ShoppingCart{
  
    private final List<Product> productList = new ArrayList();
    
        private double totalCartValue;
        private IOffer offer;

 
        

    
    	public int getProductCount() {
		return productList.size();
	}
        
        public void addProduct(Product product){
            	if(offer != null){
			offer.applyOffer(product);//apply offer
		}
            productList.add(product);
             
        }
        
        public double getTotalCartValue(){
            if (productList.size()>0){
                for(Product product : productList){
                    totalCartValue= totalCartValue + product.getTotalPrice();
                }
            }
            return totalCartValue;
        }
        
        public void setOffer(IOffer offer) {
		this.offer = offer;
	}
        
	
        public Product getProductByName(String name) {
                if (productList.size() > 0) {
                        for (Product product : productList) {
                               
                                if (product.getProductName().equals(name)) {
                                        return product;
                                }
                        }
                }
                return null;
                }
}
