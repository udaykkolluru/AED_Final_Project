/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Organization.Organization.Type;

/**
 *
 * @author charanpatnaik
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }

   public Organization createOrganization(Organization.Type type) {
        Organization organization = null;
        
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.AirTransportation.getValue())){
            organization = new AirTransportationOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new PatientOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.RoadTransportation.getValue())){
            organization = new RoadTransportation();
            organizationList.add(organization);
        }
        return organization;
    }

    
}
