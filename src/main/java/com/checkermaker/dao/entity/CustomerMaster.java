package com.checkermaker.dao.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer_master_16845")
public class CustomerMaster {
    @Id
    private int customerId;
    @Column(name = "customerCode", unique = true)
    private String customerCode;
    private String customerName;
    private String customerAddress1;
    private String customerAddress2;
    private int customerPinCode;
    private String emailAddress;
    private String contactNumber;
    private String primaryContactPerson;
    private String recordStatus;
    private String activeInactive;
    private String createdBy;
    private String createdDate;
    private String modifiedBy;
    private String modifiedDate;
    private String authorizedBy;
    private String authorizedDate;


    public CustomerMaster() {
    }

    public CustomerMaster(int customerId, String customerCode, String customerName, String customerAddress1,
                          String customerAddress2, int customerPinCode, String emailAddress, String contactNumber,
                          String primaryContactPerson, String recordStatus, String activeInactive, String createdBy,
                          String createdDate, String modifiedBy, String modifiedDate, String authorizedBy,
                          String authorizedDate) {
        this.customerId = customerId;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerAddress1 = customerAddress1;
        this.customerAddress2 = customerAddress2;
        this.customerPinCode = customerPinCode;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.primaryContactPerson = primaryContactPerson;
        this.recordStatus = recordStatus;
        this.activeInactive = activeInactive;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.authorizedBy = authorizedBy;
        this.authorizedDate = authorizedDate;
    }

    public CustomerMaster(String customerCode, String customerName, String customerAddress1, String customerAddress2,
                          int customerPinCode, String emailAddress, String contactNumber, String primaryContactPerson,
                          String recordStatus, String activeInactive, String createdBy, String createdDate,
                          String modifiedBy, String modifiedDate, String authorizedBy, String authorizedDate) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerAddress1 = customerAddress1;
        this.customerAddress2 = customerAddress2;
        this.customerPinCode = customerPinCode;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.primaryContactPerson = primaryContactPerson;
        this.recordStatus = recordStatus;
        this.activeInactive = activeInactive;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.modifiedBy = modifiedBy;
        this.modifiedDate = modifiedDate;
        this.authorizedBy = authorizedBy;
        this.authorizedDate = authorizedDate;
    }

    public CustomerMaster(String customerCode, String customerName, String customerAddress1,
                          int customerPinCode, String emailAddress, String primaryContactPerson, String recordStatus,
                          String activeInactive, String createdBy, String createdDate) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerAddress1 = customerAddress1;
        this.customerPinCode = customerPinCode;
        this.emailAddress = emailAddress;
        this.primaryContactPerson = primaryContactPerson;
        this.recordStatus = recordStatus;
        this.activeInactive = activeInactive;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress1() {
        return customerAddress1;
    }

    public void setCustomerAddress1(String customerAddress1) {
        this.customerAddress1 = customerAddress1;
    }

    public String getCustomerAddress2() {
        return customerAddress2;
    }

    public void setCustomerAddress2(String customerAddress2) {
        this.customerAddress2 = customerAddress2;
    }

    public int getCustomerPinCode() {
        return customerPinCode;
    }

    public void setCustomerPinCode(int customerPinCode) {
        this.customerPinCode = customerPinCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getPrimaryContactPerson() {
        return primaryContactPerson;
    }

    public void setPrimaryContactPerson(String primaryContactPerson) {
        this.primaryContactPerson = primaryContactPerson;
    }

    public String getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(String recordStatus) {
        this.recordStatus = recordStatus;
    }

    public String getActiveInactive() {
        return activeInactive;
    }

    public void setActiveInactive(String activeInactive) {
        this.activeInactive = activeInactive;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getAuthorizedBy() {
        return authorizedBy;
    }

    public void setAuthorizedBy(String authorizedBy) {
        this.authorizedBy = authorizedBy;
    }

    public String getAuthorizedDate() {
        return authorizedDate;
    }

    public void setAuthorizedDate(String authorizedDate) {
        this.authorizedDate = authorizedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerMaster that = (CustomerMaster) o;
        return customerId == that.customerId && customerPinCode == that.customerPinCode && customerCode.equals(that.customerCode) && customerName.equals(that.customerName) && customerAddress1.equals(that.customerAddress1) && customerAddress2.equals(that.customerAddress2) && emailAddress.equals(that.emailAddress) && contactNumber.equals(that.contactNumber) && primaryContactPerson.equals(that.primaryContactPerson) && recordStatus.equals(that.recordStatus) && activeInactive.equals(that.activeInactive) && createdBy.equals(that.createdBy) && createdDate.equals(that.createdDate) && modifiedBy.equals(that.modifiedBy) && modifiedDate.equals(that.modifiedDate) && authorizedBy.equals(that.authorizedBy) && authorizedDate.equals(that.authorizedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerCode, customerName, customerAddress1, customerAddress2, customerPinCode, emailAddress, contactNumber, primaryContactPerson, recordStatus, activeInactive, createdBy, createdDate, modifiedBy, modifiedDate, authorizedBy, authorizedDate);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerAddress1='" + customerAddress1 + '\'' +
                ", customerAddress2='" + customerAddress2 + '\'' +
                ", customerPinCode=" + customerPinCode +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", primaryContactPerson='" + primaryContactPerson + '\'' +
                ", recordStatus='" + recordStatus + '\'' +
                ", activeInactive='" + activeInactive + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", modifiedBy='" + modifiedBy + '\'' +
                ", modifiedDate='" + modifiedDate + '\'' +
                ", authorizedBy='" + authorizedBy + '\'' +
                ", authorizedDate='" + authorizedDate + '\'' +
                '}';
    }


}
