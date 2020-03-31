package com.cj.ObjectStream.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private static Long serialVersionUID = -9223372036854775808L;

    private Integer id;
    private String name;
    private String email;

    public Student(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "serialVersionUID=" + serialVersionUID +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
