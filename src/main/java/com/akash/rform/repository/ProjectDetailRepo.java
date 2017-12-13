package com.akash.rform.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.akash.rform.entity.ProjectDetail;

public interface ProjectDetailRepo extends CrudRepository<ProjectDetail, Serializable> {

}
