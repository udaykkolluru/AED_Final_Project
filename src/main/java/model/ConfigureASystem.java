/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Employee.Employee;
import model.UserAccount.UserAccount;

/**
 *
 * @author charanpatnaik
 */
public class ConfigureASystem {
    
   public static EcoSystem configure(){
        EcoSystem system = EcoSystem.getInstance();
        return system;
    }
   
}
