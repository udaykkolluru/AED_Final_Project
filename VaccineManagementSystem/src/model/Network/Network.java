/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Network;

import model.Enterprise.EnterpriseDirectory;

/**
 *
 * @author charanpatnaik
 */
public class Network {
    
    private int id;
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
