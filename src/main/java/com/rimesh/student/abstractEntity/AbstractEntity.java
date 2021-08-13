package com.rimesh.student.abstractEntity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;


import java.util.Date;


@Getter
@Setter
@MappedSuperclass
public class AbstractEntity extends AbstractPersistable<Long> {
    @Column(name = "created_date", updatable = false)
    @CreatedDate
    private Date createDate = new Date();

    @LastModifiedDate
    @Column(name = "last_modified_date")
    private Date lastModifiedDate = new Date();

    @Version
    private int Version;


}
