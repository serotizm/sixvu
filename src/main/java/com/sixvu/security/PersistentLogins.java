package com.sixvu.security;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.roo.addon.entity.RooEntity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@RooJavaBean
@RooToString
@RooEntity
@Table(name = "persistent_logins")
public class PersistentLogins {

    @NotNull
    @Size(max = 64)
    private String username;

    @NotNull
    @Size(max = 64)
    @PrimaryKeyJoinColumn
    private String series;

    @NotNull
    @Size(max = 64)
    private String token;

    @NotNull
    private Long last_used;
}
