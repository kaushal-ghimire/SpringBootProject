package com.rimesh.student.entities;

import com.rimesh.student.abstractEntity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="addstudent")
@Getter
@Setter
public class AddStudent extends AbstractEntity {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String schoolFees;

    @Column(nullable = false)
    private int number;

    @Column(nullable = false)
    private String parentName;

    @Column(nullable = false)
    private String admission;
}
