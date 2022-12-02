/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

/**
 *
 * @author udaykk
 */
public class Product {
 
    
    private String name;
    private int distributorPrice;
    private int superMarketPrice;
    private int quantity;
    private static int idCount = 1;
    private int id;
    private String description;

    public Product(String name, String description) {
        this.name = name;
        this.quantity = 1;
        this.id = idCount;
        this.description = description;
        idCount += 1;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
