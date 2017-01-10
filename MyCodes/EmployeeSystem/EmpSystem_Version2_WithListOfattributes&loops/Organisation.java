import java.util.List;


public class Organisation {

        String NameOfOrgainsation;
        Integer EmployeeCounts;
         List<Employee> listOfemployeesInOrganisation;
         
         
         
        public String getNameOfOrgainsation() {
                return NameOfOrgainsation;
        }
        public void setNameOfOrgainsation(String nameOfOrgainsation) {
                NameOfOrgainsation = nameOfOrgainsation;
        }
        public Integer getEmployeeCounts() {
                return EmployeeCounts;
        }
        public void setEmployeeCounts(Integer employeeCounts) {
                EmployeeCounts = employeeCounts;
        }
        public List<Employee> getListOfemployeesInOrganisation() {
                return listOfemployeesInOrganisation;
        }
        public void setListOfemployeesInOrganisation(
                        List<Employee> listOfemployeesInOrganisation) {
                this.listOfemployeesInOrganisation = listOfemployeesInOrganisation;
        }
            
}
