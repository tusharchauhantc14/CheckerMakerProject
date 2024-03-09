package com.checkermaker.dao.impl;

import com.checkermaker.dao.entity.CustomerMaster;
import com.checkermaker.dao.entity.CustomerTemp;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerDao {
    public List<CustomerTemp> getAllCustomersTemp();

    public void addCustomerTempTable(CustomerTemp customer);

    public void addCustomerListTempTable(List<CustomerTemp> customers);

    public void deleteCustomerTempTable(int customerId);

    public void updateCustomerTempTable(CustomerTemp customer);

    public CustomerTemp getByCustomerId(int customerId);

    public CustomerTemp getByCustomerCode(String customerCode);


    //checker services

    public List<CustomerTemp> getAllNewRegisterdCustomerChecker();

    public void addCustomerMasterTable(CustomerMaster customerMaster);

    public List<CustomerMaster> getAllCustomerMaster();

    public CustomerMaster getByIdMasterTable(int customerId);

    public void deleteCustomerFromMasterTable(String customerCode);

    public void updateCustomerMasterTable(CustomerMaster customerMaster);

    public CustomerMaster getByCustomerCodeFromMaster(String customerCode);
}
