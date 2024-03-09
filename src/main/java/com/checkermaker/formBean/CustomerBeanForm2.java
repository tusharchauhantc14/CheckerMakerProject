package com.checkermaker.formBean;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

public class CustomerBeanForm2 {
    private int customerId;
    @NotEmpty(message="customer Code can't left blank")
    @Size(max = 6,message = "customerCode Maximum lenth is 6")
    private String customerCode;
    @NotEmpty(message="customer Name can't left blank")
    @Size(max = 30,message = "customerName Maximum lenth is 30")
    private String customerName;
    @NotEmpty(message="customer Address 1 can't left blank")
    @Size(max = 40,message = "customerAddress 1 Maximum lenth is 40")
    private String customerAddress1;
    @NotEmpty(message="customer Address 2 can't left blank")
    @Size(max = 40,message = "customerAddress 2 Maximum lenth is 40")
    private String customerAddress2;
    @NotNull(message="customer Pincode can't left blank")
    private int customerPinCode;
    @NotEmpty(message="customer Email Address cant left blank")
    @Email(message = "Invalid Email Address")
    @Size(max = 30,message = "customerEmailAddress Maximum lenth is 30")
    private String emailAddress;
    @NotEmpty(message="customer Contact Number can't left blank")
    @Size(max = 10,min = 10,message = "customerContact Number Maximum lenth is 10")
    private String contactNumber;
    @NotEmpty(message="customer Primary Contact Person can't left blank")
    @Size(max = 30,message = "customer Primary Contact Person Maximum lenth is 30")
    private String primaryContactPerson;
    private String recordStatus;
    private String activeInactive;
    private String createdBy;
    private String createdDate;
    private String modifiedBy;
    private String modifiedDate;
    private String authorizedBy;
    private String authorizedDate;

    public CustomerBeanForm2() {
    }

    public CustomerBeanForm2(String customerCode, String customerName, String customerAddress1,
                             String customerAddress2, int customerPinCode, String emailAddress,
                             String contactNumber, String primaryContactPerson, String recordStatus,
                             String activeInactive, String createdBy, String createdDate, String modifiedBy,
                             String modifiedDate, String authorizedBy, String authorizedDate) {
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

    public CustomerBeanForm2(int customerId, String customerCode, String customerName,
                             String customerAddress1, String customerAddress2, int customerPinCode,
                             String emailAddress, String contactNumber, String primaryContactPerson,
                             String recordStatus, String activeInactive, String createdBy, String createdDate, String modifiedBy,
                             String modifiedDate, String authorizedBy, String authorizedDate) {
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
    public CustomerBeanForm2(String customerCode, String customerName, String customerAddress1,
                            String customerAddress2, int pinCode, String emailAddress, String contactNumber,
                            String primaryContactPerson) {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerAddress1 = customerAddress1;
        this.customerAddress2 = customerAddress2;
        this.customerPinCode = pinCode;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.primaryContactPerson = primaryContactPerson;
    }
    public CustomerBeanForm2(int customerId, String customerCode, String customerName, String customerAddress1,
                            String customerAddress2, int pinCode, String emailAddress, String contactNumber,
                            String primaryContactPerson) {
        this.customerId = customerId;
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.customerAddress1 = customerAddress1;
        this.customerAddress2 = customerAddress2;
        this.customerPinCode = pinCode;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.primaryContactPerson = primaryContactPerson;
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
        CustomerBeanForm2 that = (CustomerBeanForm2) o;
        return customerId == that.customerId && customerPinCode == that.customerPinCode && customerCode.equals(that.customerCode) && customerName.equals(that.customerName) && customerAddress1.equals(that.customerAddress1) && customerAddress2.equals(that.customerAddress2) && emailAddress.equals(that.emailAddress) && contactNumber.equals(that.contactNumber) && primaryContactPerson.equals(that.primaryContactPerson) && recordStatus.equals(that.recordStatus) && activeInactive.equals(that.activeInactive) && createdBy.equals(that.createdBy) && createdDate.equals(that.createdDate) && modifiedBy.equals(that.modifiedBy) && modifiedDate.equals(that.modifiedDate) && authorizedBy.equals(that.authorizedBy) && authorizedDate.equals(that.authorizedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerCode, customerName, customerAddress1, customerAddress2, customerPinCode, emailAddress, contactNumber, primaryContactPerson, recordStatus, activeInactive, createdBy, createdDate, modifiedBy, modifiedDate, authorizedBy, authorizedDate);
    }

    @Override
    public String toString() {
        return "CustomerBeanForm2{" +
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
