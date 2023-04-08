package com.example.demo.Entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courses")
@Data
public class Courses {

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String name;
    private String instructor;

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", instructors='" + instructor + '\'' +
                '}';
    }
}
