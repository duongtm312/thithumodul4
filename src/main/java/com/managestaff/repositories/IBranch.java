package com.managestaff.repositories;

import com.managestaff.model.Branch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranch extends CrudRepository<Branch,Integer> {
}
