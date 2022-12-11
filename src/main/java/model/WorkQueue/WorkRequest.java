/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.WorkQueue;

import java.util.Date;
import model.Employee.Employee;
import model.Enterprise.Enterprise;
import model.UserAccount.UserAccount;

/**
 *
 * @author udaykk
 */
public class WorkRequest {
    private String networkName;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Enterprise senderEnterprise;
    private Enterprise receiverEnterprise;
    private Enterprise supplierEnterprise;
    private Employee customer;
    private UserAccount delivery;
    private UserAccount supplierAdmin;
    private Date requestDate;
    private Date resolveDate;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
   
    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public Enterprise getReceiverEnterprise() {
        return receiverEnterprise;
    }

    public void setReceiverEnterprise(Enterprise receiverEnterprise) {
        this.receiverEnterprise = receiverEnterprise;
    }

    public Enterprise getSupplierEnterprise() {
        return supplierEnterprise;
    }

    public void setSupplierEnterprise(Enterprise supplierEnterprise) {
        this.supplierEnterprise = supplierEnterprise;
    }

    public Employee getCustomer() {
        return customer;
    }

    public void setCustomer(Employee customer) {
        this.customer = customer;
    }

    public UserAccount getDelivery() {
        return delivery;
    }

    public void setDelivery(UserAccount delivery) {
        this.delivery = delivery;
    }

    public UserAccount getSupplierAdmin() {
        return supplierAdmin;
    }

    public void setSupplierAdmin(UserAccount supplierAdmin) {
        this.supplierAdmin = supplierAdmin;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
     @Override
    public String toString(){
        return sender.getUsername();
    }
    
}
