package com.managestaff.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {
    @Id
    private int idBranch;
    private String nameBranch;

    public Branch() {

    }

    public Branch(int idBranch, String nameBranch) {
        this.idBranch = idBranch;
        this.nameBranch = nameBranch;
    }

    public int getIdBranch() {
        return idBranch;
    }

    public void setIdBranch(int idBranch) {
        this.idBranch = idBranch;
    }

    public String getNameBranch() {
        return nameBranch;
    }

    public void setNameBranch(String nameBranch) {
        this.nameBranch = nameBranch;
    }
}
