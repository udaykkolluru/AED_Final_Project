/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Doctor;
import model.Role.ManufacturingManager;
import model.Role.Role;

/**
 *
 * @author charanpatnaik
 */
public class ManufacturerAdminOrganization extends Organization{
    public ManufacturerAdminOrganization() {
        super(Organization.Type.ManufacturerAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManufacturingManager());
        return roles;
    }
}
