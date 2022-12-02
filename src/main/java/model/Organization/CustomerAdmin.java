/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

/**
 *
 * @author charanpatnaik
 */
public class CustomerAdmin extends Organization{
    public CustomerAdmin() {
        super(Organization.Type.CustomerAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributorAdminRole());
        return roles;
    }
}
