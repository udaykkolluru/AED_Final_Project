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
public class Order extends WorkRequest{
    ArrayList<Product> productList;
    
    public Order() {
        productList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public Object totalHospital() {
        int sum = 0;
        for(Product product: productList){
            sum += product.getHospitalPrice()*product.getQuantity();
        }
        return sum;
    }

    public Object totalFDA() {
        int sum = 0;
        for(Product product: productList){
            sum += product.getFDAPrice()*product.getQuantity();
        }
        return sum;
    }


    
}
