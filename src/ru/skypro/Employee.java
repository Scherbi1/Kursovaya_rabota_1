package ru.skypro;

public class Employee {
    private String staff;
    private double salaryStaff;
    private int departmentNumber;
    private int id;
    private static int counter = 1;

    public Employee(String staff, double salaryStaff, int departmentNumber) {
        this.staff = staff;
        this.salaryStaff = salaryStaff;
        this.departmentNumber = departmentNumber;
        this.id = getCounter();

    }

    public static int getCounter() {
        return counter;
    }
    public void setCounter() {
         this.counter=counter;
    }

    public void setStaff(String staff) {
        this.staff = staff;

    }

    public String getStaff() {
        return staff;
    }

    public void setSalaryStaff(double salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    public double getSalaryStaff() {
        return salaryStaff;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    @Override
    public String toString() {
        this.id = getCounter();
        counter++;
        return "ФИО - " + staff + '\'' +
                ", зарплата - " + salaryStaff +
                ", отдел - " + departmentNumber;
    }
}
