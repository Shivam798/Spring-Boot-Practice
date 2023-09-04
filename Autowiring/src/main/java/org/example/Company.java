package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {
    @Autowired
    @Qualifier("dept1")
    Dept dept;
//    public Company(){}
//    @Autowired
//    public Company(@Qualifier("dept2") HrDept dept){
//        this.dept=dept;
//        System.out.println("Company constructor is called");
//    }
//
//    public void setter(HrDept dept){
//        this.dept=dept;
//        System.out.println("Company setter is called");
//    }
    public void companyWork(){
        if(dept==null){
            System.err.println("No client no work");
        }
        else
            dept.work();
    }
}
