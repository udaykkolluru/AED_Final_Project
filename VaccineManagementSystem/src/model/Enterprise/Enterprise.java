/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;
import model.Organization.Organization;
import model.Organization.OrganizationDirectory;
import model.WorkQueue.Order;
import model.WorkQueue.Product;

/**
 *
 * @author pawan
 */
public abstract class Enterprise extends Organization{
    
   
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private ArrayList<Product> productList;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        FDA("FDA"),
        Manufacturer("Manufacturer"),
        Patient("Patient");        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organizationDirectory=new OrganizationDirectory();
        productList = new ArrayList<>();
    }
    
    public void restoreProducts(Order order){
        for(Product prod:order.getProductList()){
            for(Product product:this.getProductList()){
                if(product.getName().equals(prod.getName())){
                    product.setQuantity(product.getQuantity()+prod.getQuantity());
                }
            }
        }
    }
    
}
