package com.xworkz.office.internal;

public class HR {


        public String hrName;
        public int salary;
        public Office office;
        public HR(String hrName,int salary,Office office){

            this.hrName=hrName;
            this.salary=salary;

            this.office=office;
        }
        public void displayHRDetails(){
            System.out.println("Hr name="+hrName+","+"Hr salary="+salary);

            System.out.println("number of employees="+office.noOfEmployees+","+"office name="+office.officeName);
        }
    }

