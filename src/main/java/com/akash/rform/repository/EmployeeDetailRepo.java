package com.akash.rform.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.akash.rform.entity.EmployeeDetail;

public interface EmployeeDetailRepo extends CrudRepository<EmployeeDetail, Serializable> {

}
