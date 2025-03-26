package com.workintech.developers;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(long id, double salary, String name,int juniorSize, int midSize, int seniorSize) {
        super(id, salary, name);
        juniorDevelopers = new JuniorDeveloper[juniorSize];
        midDevelopers = new MidDeveloper[midSize];
        seniorDevelopers = new SeniorDeveloper[seniorSize];
    }
    @Override
    public String work() {
        return getName() + " is managing HR operations.";
    }

    @Override
    public void setSalary(double salary) {
        this.salary=60.000;
    }
    public void addEmployee(JuniorDeveloper junior) {
        addToArray(juniorDevelopers, junior);
    }

    public void addEmployee(MidDeveloper mid) {
        addToArray(midDevelopers, mid);
    }

    public void addEmployee(SeniorDeveloper senior) {
        addToArray(seniorDevelopers, senior);
    }
    private <T> void addToArray(T[] array, T employee) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = employee;
                System.out.println(((Employee) employee).getName() + " has been added to the team.");
                return;
            }
        }
        System.out.println("No space available to add " + ((Employee) employee).getName());
    }
}
