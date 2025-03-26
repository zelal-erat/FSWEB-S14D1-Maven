package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, double salary, String name) {
        super(id, salary, name);
    }
    @Override
    public String work() {
        return getName() + " is a Junior Developer working on basic tasks.";
    }

    @Override
    public void setSalary(double salary) {
        this.salary=20.000;
    }
}
