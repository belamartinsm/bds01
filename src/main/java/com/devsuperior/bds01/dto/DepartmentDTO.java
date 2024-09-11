package com.devsuperior.bds01.dto;

import com.devsuperior.bds01.entities.Department;

import java.io.Serial;
import java.io.Serializable;

public class DepartmentDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Long id;
    public String name;

    public DepartmentDTO() {
    }

    public DepartmentDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DepartmentDTO(Department entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
