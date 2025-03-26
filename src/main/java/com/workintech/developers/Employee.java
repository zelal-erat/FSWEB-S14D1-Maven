package com.workintech.developers;

public class Employee {
    public long id;
    public double salary;
    public String name;

    public Employee(long id, double salary, String name) {
        this.id = id;
        this.name=name;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    public String work() {
        return name + " is working on general tasks.";
    }
}
