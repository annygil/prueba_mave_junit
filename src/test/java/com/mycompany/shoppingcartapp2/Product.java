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
public class Product {
    
    private String productName;
    private int quantity;
    private double totalPrice;
    
    public Product(String productName, int quantity, double totalPrice){
        this.productName= productName;
        this.quantity = quantity;
        this.totalPrice=totalPrice;
    }
        
    public String getProductName(){
        return productName ;
    }
    public void setProductName(String productName){
        this.productName=productName;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getTotalPrice(){
        return totalPrice;
        
    }
    
    public void setTotalPrice(double totalPrice){
        this.totalPrice=totalPrice;
    }
    
}
