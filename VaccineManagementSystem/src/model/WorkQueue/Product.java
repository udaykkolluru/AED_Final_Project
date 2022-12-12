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
    private int fDAPrice;
    private int hospitalPrice;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFDAPrice() {
        return fDAPrice;
    }

    public void setFDAPrice(int fDAPrice) {
        this.fDAPrice = fDAPrice;
    }

    public int getHospitalPrice() {
        return hospitalPrice;
    }

    public void setHospitalPrice(int hospitalPrice) {
        this.hospitalPrice = hospitalPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Product.idCount = idCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   public void addQuantity() {
        quantity = quantity+1;
    }

    public void reduceQuantity() {
        quantity -= 1;
    }


    
}
