package com.managestaff.repositories;

import com.managestaff.model.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface IStaffRepo extends PagingAndSortingRepository<Staff, Long> {
@Query(nativeQuery = true,value = "SELECT * FROM qlstaff.staff where staffName  like concat ('%',:name,'%') order by staffAge  ;")
    List<Staff> findByStaffNameContaining(@Param("name") String name);

    Optional<Staff> findByStaffName(String name);
    Optional<Staff> findByStaffCode(String name);
}
