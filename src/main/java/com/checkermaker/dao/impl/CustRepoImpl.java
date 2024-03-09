package com.checkermaker.dao.impl;

import com.checkermaker.dao.entity.CustomerTemp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustRepoImpl implements CustomerRepository{

    @Autowired
    private final SessionFactory sessionFactory;

    public CustRepoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession() {

        return sessionFactory.getCurrentSession();
    }

    public void saveAll(List<CustomerTemp> customers){
        for(CustomerTemp c:customers)
        {
            getSession().save(c);
        }
    }
}
