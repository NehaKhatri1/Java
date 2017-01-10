package com.thb.ClassesRelation;

public class Employee {
        /*  Have Employee class with attributes employeeId ( String ) , salary ( int ) and Account . 
        Account in itself is another class with attributes accountType ( string ) , Organization . 
        Organization is another class having attribute organizationName (String ) , TradeVolume( double ).
        Create one employee object and set values for all related attributes. 
        Now fetch all the values of attributes set in the previous step . 
         */

        public String employeeId;
        public Integer salary;
        public Account account ; 

        public String getEmployeeId() {
                return employeeId;
        }
        public void setEmployeeId(String employeeId) {
                this.employeeId = employeeId;
        }
        public Integer getSalary() {
                return salary;
        }
        public void setSalary(Integer salary) {
                this.salary = salary;
        }
        public Account getAccount() {
                return account;
        }
        public void setAccount(Account account) {
                this.account = account;
        }
      }