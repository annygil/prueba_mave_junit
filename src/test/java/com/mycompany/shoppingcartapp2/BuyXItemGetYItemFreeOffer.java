/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shoppingcartapp2;

/**
 *
 * @author Anny Gil -ubitica-01
 */
public class BuyXItemGetYItemFreeOffer implements IOffer {
 
	private int XItem;
	private int YItem;
	
	public BuyXItemGetYItemFreeOffer(int xItem, int yItem) {
		XItem = xItem;
		YItem = yItem;
	}
 
	@Override
	public void applyOffer(Product product) {
            if(product.getQuantity()>=XItem){
                int freeProductQty = product.getQuantity() / (XItem + YItem);
                double unitPrice = product.getTotalPrice() / product.getQuantity();
                double discount = unitPrice * freeProductQty;
                product.setTotalPrice(product.getTotalPrice() - discount);
            }
            
	}
	//get/set
}
