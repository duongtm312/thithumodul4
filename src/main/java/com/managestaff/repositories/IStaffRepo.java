package com.managestaff.repositories;

import com.managestaff.model.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface IStaffRepo extends PagingAndSortingRepository<Staff, Long> {
    List<Staff> findByStaffNameContaining(String name);

    Optional<Staff> findByStaffName(String name);
    Optional<Staff> findByStaffCode(String name);

}
