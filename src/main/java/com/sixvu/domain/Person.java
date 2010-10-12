package com.sixvu.domain;

import javax.persistence.Entity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.entity.RooEntity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import com.sixvu.types.Gender;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import com.sixvu.types.Authority;
import com.sixvu.types.Enabled;

@Entity
@RooJavaBean
@RooToString
@RooEntity(identifierColumn = "personID")
public class Person {

    @NotNull
    @Size(min = 3, max = 32)
    private String userName;

    @NotNull
    @Size(min = 5, max = 255)
    private String email;

    @NotNull
    @Size(min = 3, max = 32)
    private String passWord;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date birthDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @NotNull
    @Size(min = 2, max = 2)
    private String country;

    @NotNull
    @Size(min = 5, max = 255)
    private String paypalEmail;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Authority authority;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Enabled status;
}
