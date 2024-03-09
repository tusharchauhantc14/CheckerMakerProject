package com.checkermaker.service;

import com.checkermaker.dao.entity.CustomerMaster;
import com.checkermaker.dao.entity.CustomerTemp;
import com.checkermaker.formBean.CustomerBeanForm2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    public List<CustomerTemp> getAllCustomersTemp();
    public void  addCustomer(CustomerTemp customer);

    public void addCustomerList(List<CustomerTemp> customers);
    public void deleteCustomer(int id);
    public void updateCustomer(CustomerTemp customer);
    public CustomerTemp getById(int customerId);
    public CustomerTemp getByCustomerCode(String customerCode);

    public List<CustomerTemp>getAllNewRegisterdCustomerChecker();
    public void addCustomerMasterTable(CustomerMaster customerMaster);
    public List<CustomerMaster>getAllCustomerMaster();
    public CustomerMaster getByIdMasterTable(int customerId);
    public void moveCustomerFromMasterTableToTempTable(CustomerTemp customerTemp);
    public void deleteCustomerFromMasterTable(String customerCode);
    public void updateCustomerMasterTable(CustomerMaster customerMaster);
    public CustomerMaster getByCustomerCodeFromMaster(String customerCode);
}
