package com.example.screamitus_android;


public class Infection {
    private int numberOfInfectedInstructors = 5;
    private int numberOfInfectedInstructorsEight = 8;
    // creating empty constructor
    public  Infection()
    {

    }
    public String ZeroDays(int days) {
        if (days <= 0) {
            return "-1";
        }
        else if (days <=7){

            for (int i = 1; i <= 7; i++) {
                numberOfInfectedInstructors = numberOfInfectedInstructors * 2;
                System.out.println(numberOfInfectedInstructors);

            }

        }
else  {
                numberOfInfectedInstructorsEight = numberOfInfectedInstructorsEight * 2;
                System.out.println(numberOfInfectedInstructorsEight);

            }
        return String.valueOf(numberOfInfectedInstructors);
        }



    }
