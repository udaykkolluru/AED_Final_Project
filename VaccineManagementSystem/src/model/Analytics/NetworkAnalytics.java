/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this temporarylate file, choose Tools | Templates
 * and open the temporarylate in the editor.
 */
package model.Analytics;

import model.EcoSystem;
import model.Enterprise.Enterprise;
import model.Enterprise.HospitalEnterprise;
import model.Enterprise.FDAEnterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.WorkQueue.Product;
import model.WorkQueue.WorkRequest;
import java.util.HashMap;

/**
 *
 * @author pawan
 */
public class NetworkAnalytics {
    
        private EcoSystem system;
        
        public NetworkAnalytics(EcoSystem system){
            this.system = system;
        }
    
        public HashMap<String,HashMap<String,Integer>> getAllUsersInNetWorkByOrganization(String networkSelected){
            String temporary;
            HashMap<String,HashMap<String,Integer>> ent = null;
            for(Network network:system.getNetworkList()){
                ent= new HashMap<String,HashMap<String,Integer>>();
                if(networkSelected==null)
                    temporary=system.getNetworkList().get(0).getName();
                else
                    temporary=networkSelected;
                
                for(Enterprise entp:network.getEnterpriseDirectory().getEnterpriseList()){
                    HashMap<String,Integer> org =new HashMap<String,Integer>();
                    org.put("Manager",entp.getEmployeeDirectory().getEmployeeList().size());
                    for(Organization organization: entp.getOrganizationDirectory().getOrganizationList()){
                       org.put(organization.getName(),organization.getUserAccountDirectory().getUserAccountList().size()) ;
                    }
                    ent.put(entp.getEnterpriseType().getValue(),org);
                }

                if(temporary==network.getName())
                    return ent;
            }
            return ent;
        }
}
