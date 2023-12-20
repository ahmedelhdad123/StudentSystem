package org.spring.student.studentsystem.entity;

import org.spring.student.studentsystem.entity.enums.Gender;

import javax.xml.crypto.Data;

public class Student {
    private int id;
    private String fullName;
    private String age;
    private Gender gender;
    private String phone;
    private String address;
    private Data dataCreate;
    private Data dataUpdated;

}
