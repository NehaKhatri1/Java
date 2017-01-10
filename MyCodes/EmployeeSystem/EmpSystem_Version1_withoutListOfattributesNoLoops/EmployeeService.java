//For loop Implementation for setting attributes.


package com.thb.ClassesRelationService;

import com.thb.ClassesRelation.Account;
import com.thb.ClassesRelation.Employee;
import com.thb.ClassesRelation.Organization;

public class EmployeeService {

        public static void main(String[] args){
                Organization organization = new Organization();
                organization.setTradeVolume(98723.987234);
                organization.setOrganizationName("comp.org");

                Account account = new Account();
                account.setAccountType("loan");
                account.setOrganization(organization);

                Employee employee = new Employee();
                employee.setEmployeeId("001");
                employee.setSalary(1000);
                employee.setAccount(account);

                // printing employee salary
                System.out.println(employee.getSalary());

                // printing employee's account loan type
                System.out.println(employee.getAccount().getAccountType());
                System.out.println("getaccount.getorgainzation "+employee.getAccount().getOrganization().getOrganizationName());

                System.out.println("employee.getAccount().getOrganization().getTradeVolume()");

                // printint employee's organization's trade volume
                System.out.println(employee.getAccount().getOrganization().getTradeVolume());

                // printint employee's organization's name
                System.out.println(employee.getAccount().getOrganization().getOrganizationName());

                organization.setOrganizationName("HDFC");
                System.out.println(employee.getAccount().getOrganization().getOrganizationName());
        }

}

/*Output
1000
loan
getaccount.getorgainzation comp.org
employee.getAccount().getOrganization().getTradeVolume()
98723.987234
comp.org
HDFC