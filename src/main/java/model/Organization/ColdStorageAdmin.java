/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Role;
import model.Role.ColdStorageAdminRole;

/**
 *
 * @author charanpatnaik
 */
public class ColdStorageAdmin extends Organization{
    public ColdStorageAdmin() {
        super(Organization.Type.ColdStorageAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ColdStorageAdminRole());
        return roles;
    }
}
