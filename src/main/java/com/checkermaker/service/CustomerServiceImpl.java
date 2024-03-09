package com.checkermaker.service;

import com.checkermaker.dao.impl.CustomerDao;
import com.checkermaker.dao.entity.CustomerMaster;
import com.checkermaker.dao.entity.CustomerTemp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@EnableTransactionManagement
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerDao customerDao;

//    @Autowired
//    public CustomerServiceImpl(CustomerDao customerDao) {
//        this.customerDao = customerDao;
//    }



    @Override
    public List<CustomerTemp> getAllCustomersTemp() {
        return customerDao.getAllCustomersTemp();
    }

    @Override
    public void addCustomer(CustomerTemp customer) {
        customerDao.addCustomerTempTable(customer);
    }

    public void addCustomerList(List<CustomerTemp> customers) {
        customerDao.addCustomerListTempTable(customers);
    }

    @Override
    public void deleteCustomer(int customerId) {
       customerDao.deleteCustomerTempTable(customerId);
    }

    @Override
    public void updateCustomer(CustomerTemp customer) {
          customerDao.updateCustomerTempTable(customer);
    }

    @Override
    public CustomerTemp getById(int customerId) {
        return customerDao.getByCustomerId(customerId);
    }

    @Override
    public CustomerTemp getByCustomerCode(String customerCode) {
        return customerDao.getByCustomerCode(customerCode);
    }

    @Override
    public List<CustomerTemp> getAllNewRegisterdCustomerChecker() {
        return customerDao.getAllNewRegisterdCustomerChecker();
    }

    @Override
    public void addCustomerMasterTable(CustomerMaster customerMaster) {
        customerDao.addCustomerMasterTable(customerMaster);
    }

    @Override
    public List<CustomerMaster> getAllCustomerMaster() {
        return customerDao.getAllCustomerMaster();
    }

    @Override
    public CustomerMaster getByIdMasterTable(int customerId) {
        return customerDao.getByIdMasterTable(customerId);
    }

    @Override
    public void moveCustomerFromMasterTableToTempTable(CustomerTemp customerTemp) {
        customerDao.addCustomerTempTable(customerTemp);
    }

    @Override
    public void deleteCustomerFromMasterTable(String customerCode) {
        customerDao.deleteCustomerFromMasterTable(customerCode);
    }

    @Override
    public void updateCustomerMasterTable(CustomerMaster customerMaster) {
        customerDao.updateCustomerMasterTable(customerMaster);
    }

    @Override
    public CustomerMaster getByCustomerCodeFromMaster(String customerCode) {
        return customerDao.getByCustomerCodeFromMaster(customerCode);
    }
}
