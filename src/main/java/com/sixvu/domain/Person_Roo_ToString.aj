// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.sixvu.domain;

import java.lang.String;

privileged aspect Person_Roo_ToString {
    
    public String Person.toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append(", ");
        sb.append("Version: ").append(getVersion()).append(", ");
        sb.append("UserName: ").append(getUserName()).append(", ");
        sb.append("Email: ").append(getEmail()).append(", ");
        sb.append("PassWord: ").append(getPassWord()).append(", ");
        sb.append("BirthDate: ").append(getBirthDate()).append(", ");
        sb.append("Gender: ").append(getGender()).append(", ");
        sb.append("Country: ").append(getCountry()).append(", ");
        sb.append("PaypalEmail: ").append(getPaypalEmail()).append(", ");
        sb.append("Authority: ").append(getAuthority());
        return sb.toString();
    }
    
}
