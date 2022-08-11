package com.managestaff.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idStaff;

    private String staffCode;
    @Size(max = 15, message = "Tên quá dài")
    @Size(min = 5, message = "Tên quá ngắn")
    private String staffName;
    @Min(value = 18,message = "Tuổi phải trên 18")
    @Max(value = 60,message = "Tuổi phải nhỏ hơn 60")
    private int staffAge;
    private int salary;
    @ManyToOne
    private Branch branch;

    public Staff() {
    }

    public Staff(long idStaff, String staffCode, String staffName, int staffAge, int salary, Branch branch) {
        this.idStaff = idStaff;
        this.staffCode = staffCode;
        this.staffName = staffName;
        this.staffAge = staffAge;
        this.salary = salary;
        this.branch = branch;
    }

    public long getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(long idStaff) {
        this.idStaff = idStaff;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
