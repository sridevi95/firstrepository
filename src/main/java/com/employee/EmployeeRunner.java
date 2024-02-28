package com.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {

        List<EmployeeDetails> data = new ArrayList<>();

        data.add(new EmployeeDetails(100, "Anitha", "Kolkata", 150000));
        data.add(new EmployeeDetails(102, "Savitha", "Delhi", 250000));
        data.add(new EmployeeDetails(103, "Kaitha", "Bengaluru", 150000));
        data.add(new EmployeeDetails(105, "Sarala", "Chennai", 450000));
        data.add(new EmployeeDetails(104, "Vinitha", "Mumbai", 450000));

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getEname().startsWith("S") && data.get(i).getSalary() > 350000) {
                System.out.println("Employee " + i + " " + data.get(i));
            }

        }
    }
}
