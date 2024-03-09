package com.checkermaker.dao.impl;

import com.checkermaker.dao.entity.CustomerMaster;
import com.checkermaker.dao.entity.CustomerTemp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDaoImplhibernate implements CustomerDao {
    @Autowired
    private final SessionFactory sessionFactory;

//    @Autowired
//    CustomerRepository customerRepository;

//    @Autowired
    public CustomerDaoImplhibernate(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession() {

        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<CustomerTemp> getAllCustomersTemp() {
        return getSession().createQuery("select c from CustomerTemp c", CustomerTemp.class).list();
    }

    @Override
    public void addCustomerTempTable(CustomerTemp customer) {
            getSession().save(customer);
    }

    public  void addCustomerListTempTable(List<CustomerTemp> customers) {
        for(CustomerTemp c:customers)
        {
            getSession().save(c);
        }
    }

    @Override
    public void deleteCustomerTempTable(int customerId) {
        CustomerTemp customerTemp = getByCustomerId(customerId);
        getSession().remove(customerTemp);
    }

    @Override
    public void updateCustomerTempTable(CustomerTemp customer) {
        getSession().merge(customer);
    }

    @Override
    public CustomerTemp getByCustomerId(int customerId) {
        return getSession().get(CustomerTemp.class, customerId);
    }

    @Override
    public CustomerTemp getByCustomerCode(String customerCode) {
        List customerTemp;
        customerTemp = getSession().createQuery("select c from CustomerTemp c where c.customerCode=:customerCode").setParameter("customerCode", customerCode).getResultList();
        return (CustomerTemp) customerTemp.get(0);
    }

    @Override
    public List<CustomerTemp> getAllNewRegisterdCustomerChecker() {

        return getSession().createQuery("select c from CustomerTemp c where c.recordStatus=:status OR c.recordStatus=:statu OR c.recordStatus=:stat", CustomerTemp.class)
                .setParameter("status", "N").setParameter("statu", "M").setParameter("stat", "D").list();
    }

    @Override
    public void addCustomerMasterTable(CustomerMaster customerMaster) {
        getSession().persist(customerMaster);
    }

    @Override
    public List<CustomerMaster> getAllCustomerMaster() {
        List<CustomerMaster> customerMasters = new ArrayList<>();
        List<CustomerTemp> customerTempList = getAllCustomersTemp();
        List<CustomerMaster> customerMasterList = getSession().createQuery("select c from CustomerMaster c", CustomerMaster.class).list();

        for (CustomerMaster cm : customerMasterList) {
            boolean isFound = false;

            for (CustomerTemp ct : customerTempList) {
                if (cm.getCustomerCode().equals(ct.getCustomerCode())) {

                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                customerMasters.add(cm);
            }
        }

        return customerMasters;
    }

    @Override
    public CustomerMaster getByIdMasterTable(int customerId) {
        return getSession().get(CustomerMaster.class, customerId);
    }

    @Override
    public void deleteCustomerFromMasterTable(String customerCode) {
        String query = "delete from CustomerMaster c where c.customerCode=:customerCode";
        Query query1 = getSession().createQuery(query).setParameter("customerCode", customerCode);
        query1.executeUpdate();
    }

    @Override
    public void updateCustomerMasterTable(CustomerMaster customerMaster) {
        getSession().update(customerMaster);
    }

    @Override
    public CustomerMaster getByCustomerCodeFromMaster(String customerCode) {
        List customerMaster = getSession().createQuery("select c from CustomerMaster c where c.customerCode=:customerCode").setParameter("customerCode", customerCode).getResultList();
        return (CustomerMaster) customerMaster.get(0);
    }
}
