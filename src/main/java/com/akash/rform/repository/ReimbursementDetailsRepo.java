package com.akash.rform.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import com.akash.rform.entity.ReimbursementDetails;

public interface ReimbursementDetailsRepo extends CrudRepository<ReimbursementDetails, Serializable> {

}
