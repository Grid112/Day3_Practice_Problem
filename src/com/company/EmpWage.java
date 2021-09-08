package com.company;
import java.util.Random;
public class EmpWage {

    public static void main(String[] args) {
        System.out.println("Employee Attendance Check:");
        int IS_FULL_TIME = 1;
        Random random = new Random();
        int empCheck = random.nextInt(2);
        if (empCheck == IS_FULL_TIME){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
