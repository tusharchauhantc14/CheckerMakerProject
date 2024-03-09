package com.checkermaker.dao.impl;

import com.checkermaker.dao.entity.CustomerTemp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository{

    public void saveAll(List<CustomerTemp> customers);
}
