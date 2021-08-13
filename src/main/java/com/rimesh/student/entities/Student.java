package com.rimesh.student.entities;

import com.rimesh.student.abstractEntity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student extends AbstractEntity {
    @Column(nullable = false,unique = true)
    private  Integer roll_no;
}
