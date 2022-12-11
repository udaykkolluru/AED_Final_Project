/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Role;
import model.Role.TruckDriver;

/**
 *
 * @author charanpatnaik
 */
public class RoadTransportation extends Organization {
    public RoadTransportation() {
        super(Organization.Type.RoadTransportation.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new TruckDriver());
        return roles;
    }  
}
