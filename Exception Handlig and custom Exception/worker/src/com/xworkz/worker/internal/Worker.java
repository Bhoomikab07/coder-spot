package com.xworkz.worker.internal;

import com.xworkz.worker.event.*;

public class Worker {

        public double salary(double salary){
            if (salary>45.999){
                try {
                    throw new LessSalaryException();
                }catch (LessSalaryException lessSalaryException){
                    lessSalaryException.printStackTrace();
                    System.out.println("good salary");
                }
            }else {
                System.out.println("not a good salary");
            }
            return salary;
        }

        public int colleagues(int number){
            if (number>0){
                try {
                    throw new NoColleaguesException();
                }catch (NoColleaguesException noColleaguesException){
                    noColleaguesException.printStackTrace();
                    System.out.println("he/she has collegues..");
                }
            }else {
                System.out.println("he/she does't have collegues");
            }
            return number;
        }

        public String work(String work){
            if (work=="good"){
                try {
                    throw new BadWorkException();
                }catch (BadWorkException badWorkException){
                    badWorkException.printStackTrace();
                    System.out.println("good worker...");
                }
            }else {
                System.out.println("not a good worker...");
            }
            return work;
        }

        public float experience(float experience){
            if (experience>1.5f){
                try {
                    throw new NoExperienceException();
                }catch (NoExperienceException noExperienceException){
                    noExperienceException.printStackTrace();
                    System.out.println("he has work experience..");
                }
            }else {
                System.out.println("does't have work experience..");
            }
            return experience;
        }

        public boolean salary(boolean haveSalary){
            if (haveSalary==true){
                try {
                    throw new NoSalaryException();
                }catch (NoSalaryException noSalaryException){
                    noSalaryException.printStackTrace();
                    System.out.println("yes he have GF...");
                }
            }else {
                System.out.println("he don't have GF");
            }
            return haveSalary;
        }
    }


