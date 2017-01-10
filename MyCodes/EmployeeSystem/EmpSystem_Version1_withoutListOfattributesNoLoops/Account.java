package com.thb.ClassesRelation;

public class Account {
        public String accountType;
        public Organization Organization;
        
        
        public String getAccountType() {
                return accountType;
        }
        public void setAccountType(String accountType) {
                this.accountType = accountType;
        }
        public Organization getOrganization() {
                return Organization;
        }
        public void setOrganization(Organization organization) {
                Organization = organization;
        } 

}