// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.sixvu.domain;

import com.sixvu.domain.Person;
import java.lang.String;
import java.util.Date;

privileged aspect Video_Roo_JavaBean {
    
    public String Video.getTitle() {
        return this.title;
    }
    
    public void Video.setTitle(String title) {
        this.title = title;
    }
    
    public Date Video.getDateAdd() {
        return this.dateAdd;
    }
    
    public void Video.setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }
    
    public Person Video.getPerson() {
        return this.Person;
    }
    
    public void Video.setPerson(Person Person) {
        this.Person = Person;
    }
    
}
