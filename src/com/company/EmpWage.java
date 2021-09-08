package com.company;
import java.util.Random;
public class EmpWage {
    public static final int IS_FULL_TIME = 2;
    public static final int IS_PART_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 2;
    public static final int MAX_HOURS_IN_MONTH = 10;

    public static void main(String[] args) {
        int empHours = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays < NO_OF_WORKING_DAYS) {
            totalWorkingDays++;
            Random random = new Random();
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }
            totalEmpHrs += empHours;
            System.out.println("Day#:" + totalWorkingDays + " Emp Hr:" + empHours);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wag:" + totalEmpWage);
    }
}
