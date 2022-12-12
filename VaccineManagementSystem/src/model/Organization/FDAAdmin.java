/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Role;
import model.Role.FDAAdminRole;

/**
 *
 * @author charanpatnaik
 */
public class FDAAdmin extends Organization{
    public FDAAdmin() {
        super(Organization.Type.FDAAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FDAAdminRole());
        return roles;
    }
}
