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
}
