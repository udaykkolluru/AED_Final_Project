/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

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
        ColdStorageAdmin("ColdStorage Admin");
        
        
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
    
    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}
