package com.emotes.springbootdbemotessaved.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@SuperBuilder
public abstract class UserAudit implements Serializable {


    @CreatedDate
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    @Column(name = "first")
    Date createdAt;

    @LastModifiedDate
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss")
    @Column(name = "now")
    Date updatedAt;

    public UserAudit(Date createdAt) {
        this.createdAt = createdAt;
    }

    public UserAudit() {
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}