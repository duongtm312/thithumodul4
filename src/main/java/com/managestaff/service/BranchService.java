package com.managestaff.service;

import com.managestaff.model.Branch;
import com.managestaff.repositories.IBranch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BranchService {
    @Autowired
    IBranch iBranch;

    public List<Branch> getAll() {
        return (List<Branch>) iBranch.findAll();
    }

    public Branch findById(int id) {
        Optional<Branch> optional = iBranch.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        }
        return new Branch();
    }
}
