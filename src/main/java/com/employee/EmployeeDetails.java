package com.employee;

public class EmployeeDetails {
    private int eid;
    private String ename;
    private String location;
    private int salary;

    public EmployeeDetails() {
    }

    public EmployeeDetails(int eid, String ename, String location, int salary) {
        this.eid = eid;
        this.ename = ename;
        this.location = location;
        this.salary = salary;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String getLocation() {
        return location;
    }

    public int getSalary() {
        return salary;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
