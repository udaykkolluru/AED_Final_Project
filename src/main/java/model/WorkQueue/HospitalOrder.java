/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author udaykk
 */
public class HospitalOrder extends WorkRequest{
    ArrayList<Product> productList;

    public HospitalOrder() {
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
}
