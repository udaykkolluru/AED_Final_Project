/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;
import java.util.ArrayList;
import model.Role.Doctor;
import model.Role.Role;
/**
 *
 * @author charanpatnaik
 */
public class DoctorOrganization extends Organization{
    public DoctorOrganization() {
        super(Organization.Type.Doctor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Doctor());
        return roles;
    }
}
