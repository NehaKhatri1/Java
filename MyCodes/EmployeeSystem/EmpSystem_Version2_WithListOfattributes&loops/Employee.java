import java.util.List;


public class Employee {

        Integer empId;
        Integer salary;
        String empName;
        String Department; 
        
        
        List<Account> listOfAccountOfAnEmployee;
        public Integer getEmpId() {
                return empId;
        }
        public void setEmpId(Integer empId) {
                this.empId = empId;
        }
        public Integer getSalary() {
                return salary;
        }
        public void setSalary(Integer salary) {
                this.salary = salary;
        }
        public String getEmpName() {
                return empName;
        }
        public void setEmpName(String empName) {
                this.empName = empName;
        }
        public String getDepartment() {
                return Department;
        }
        public void setDepartment(String department) {
                Department = department;
        }
        public List<Account> getListOfAccountOfAnEmployee() {
                return listOfAccountOfAnEmployee;
        }
        public void setListOfAccountOfAnEmployee(List<Account> listOfAccountOfAnEmployee) {
                this.listOfAccountOfAnEmployee = listOfAccountOfAnEmployee;
        }
        
        
        
}
