/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.FDAAdminRole;
import model.Role.Role;

/**
 *
 * @author charanpatnaik
 */
public class PatientAdmin extends Organization{
    public PatientAdmin() {
        super(Organization.Type.PatientAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FDAAdminRole());
        return roles;
    }
}
