package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @Column(name = "bronco_id")
    private String broncoId;

    private String name;
    private String address;
    private String degree;

    public Student() {}

    public Student(String broncoId, String name, String address, String degree) {
        this.broncoId = broncoId;
        this.name = name;
        this.address = address;
        this.degree = degree;
    }

    // Getters and setters
    public String getBroncoId() { return broncoId; }
    public void setBroncoId(String broncoId) { this.broncoId = broncoId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getDegree() { return degree; }
    public void setDegree(String degree) { this.degree = degree; }
}
