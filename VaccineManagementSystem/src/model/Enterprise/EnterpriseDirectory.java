/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author pawan
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        
        if(null!=type)switch (type) {
            case Hospital:
                enterprise=new HospitalEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case FDA:
                enterprise=new FDAEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Manufacturer:
                enterprise=new ManufacturerEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Patient:
                enterprise=new PatientEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
        return enterprise;
    }
}
