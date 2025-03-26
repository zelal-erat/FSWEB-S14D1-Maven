package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, double salary, String name) {
        super(id, salary, name);
    }

    @Override
    public String work() {
        return getName() + " is a Senior Developer leading the team.";
    }

    @Override
    public void setSalary(double salary) {
        this.salary=60.000;
    }
}
