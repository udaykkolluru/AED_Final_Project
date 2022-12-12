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

/**
 *
 * @author udaykk
 */
public abstract class Role {

    public enum RoleType{
        Admin("Admin"),
        DoctorSupervisor("Doctor Supervisor"),
        Doctor("Doctor"),
        PatientAdmin("Patient Admin"),
        Patient("Patient"),
        ManufacturingManager("Manufacturing Manager"),
        Pilot("Pilot"),
        TruckDriver("Driver"),
        FDAAdmin("FDA Admin");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    
}
