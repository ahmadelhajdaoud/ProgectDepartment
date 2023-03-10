package org.generation.italy.progectDepartment.model.entities;

import java.util.Set;

public class Department {
    private long id;
    private String name;
    private Address address;
    private int maxCapacity;
    private Set<Employee> employeesSet;

    public Department(long id, String name, Address address, int maxCapacity){
        this(id, name, address,maxCapacity,null);
    }

    public Department(long id, String name, Address address, int maxCapacity,Set<Employee> employeesSet) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.maxCapacity = maxCapacity;
        this.employeesSet = employeesSet;
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

    public Address getAddress() {
        return address;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
