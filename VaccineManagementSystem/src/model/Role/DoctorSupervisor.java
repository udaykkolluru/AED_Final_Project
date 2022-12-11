/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;
import javax.swing.JPanel;
import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import ui.Hospital.DoctorSupervisorWorkAreaJPanel;
/**
 *
 * @author udaykk
 */
public class DoctorSupervisor extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorSupervisorWorkAreaJPanel(userProcessContainer, enterprise, business, account);
    }
}
