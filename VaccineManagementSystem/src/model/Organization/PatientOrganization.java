/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Patient;
import model.Role.Role;
/**
 *
 * @author charanpatnaik
 */
public class PatientOrganization extends Organization{

    public PatientOrganization() {
        super(Organization.Type.Patient.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Patient());
        return roles;
    }
}
