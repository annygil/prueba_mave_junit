/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcartapp2;

/**
 *
 * @author ubitica-01
 */
public class DiscountOnNextItemOffer implements IOffer {
    
    	private double discountPercentage;
 
	public DiscountOnNextItemOffer(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
 
	@Override
	public void applyOffer(Product product) {
                int totalQuantity = product.getQuantity();
                double unitPrice= product.getTotalPrice()/product.getQuantity();
	       while (totalQuantity>1){
                   double price = product.getTotalPrice();
                   product.setTotalPrice(price -(unitPrice / (100/discountPercentage)));
                   totalQuantity= totalQuantity -2;
                   
               }
                   
                   
        }
    //get/set
}
