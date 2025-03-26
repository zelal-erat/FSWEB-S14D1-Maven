package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, double salary, String name) {
        super(id, salary, name);
    }

    @Override
    public String work() {
        return getName() + " is a Mid Developer working on complex tasks.";
    }

    @Override
    public void setSalary(double salary) {
        this.salary=40.000;
    }
}
