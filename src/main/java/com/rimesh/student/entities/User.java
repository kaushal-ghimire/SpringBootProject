package com.rimesh.student.entities;

import com.rimesh.student.abstractEntity.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="users")
@Getter
@Setter
@ToString
public class User extends AbstractEntity  {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private long id;


    @Column(unique = true,nullable = false )
    private String email;

    @Column(nullable = false)
    private String firstName;

    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private  String password;


}
