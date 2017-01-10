
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;


public class Service {

        public static void main(String[] agrs){
                // accounts of employee 1.
                Account account1=new Account();
                account1.setAccountType("Deposit");
                account1.setBranceName("Rajouri Garden");
                account1.setAmount(20000);

                Account account2=new Account();
                account2.setAccountType("Saving");
                account2.setBranceName(" Tilak Nager");
                account2.setAmount(5000);

                Account account3=new Account();
                account3.setAccountType("Current");
                account3.setBranceName("Rajouri Garden");
                account3.setAmount(10000);

                // accounts of employee 2.
                Account account11=new Account();
                account11.setAccountType("Fixed Deposit");
                account11.setBranceName("Thane");
                account11.setAmount(115000);

                Account account12=new Account();
                account12.setAccountType("Recuring Deposit");
                account12.setBranceName("M.g .Road Branch");
                account12.setAmount(657000);

                //setting 1st employee's details.
                Employee employee1=new Employee();
                employee1.setDepartment("HR");
                employee1.setEmpId(101);
                employee1.setEmpName("Neha");
                employee1.setSalary(25000);
                List<Account>listOfAccountOfAnEmployee1=new ArrayList<Account>();
                listOfAccountOfAnEmployee1.add(account1);
                listOfAccountOfAnEmployee1.add(account2);
                listOfAccountOfAnEmployee1.add(account3);
                employee1.setListOfAccountOfAnEmployee(listOfAccountOfAnEmployee1);

                //setting 2nd employee's details
                Employee employee2=new Employee();
                employee2.setDepartment("Technical");
                employee2.setEmpId(101);
                employee2.setEmpName("Ravina");
                employee2.setSalary(25000);
                List<Account>listOfAccountOfAnEmployee2=new ArrayList<Account>();
                listOfAccountOfAnEmployee2.add(account11);
                listOfAccountOfAnEmployee2.add(account12);
                employee2.setListOfAccountOfAnEmployee(listOfAccountOfAnEmployee2);

                Organisation organisation =new Organisation();
                organisation.setEmployeeCounts(8000);
                organisation.setNameOfOrgainsation("TCS");
                List<Employee>listOfEmployeeInAnOrganisation=new ArrayList<Employee>();
                listOfEmployeeInAnOrganisation.add(employee1);
                listOfEmployeeInAnOrganisation.add(employee2);
                organisation.setListOfemployeesInOrganisation(listOfEmployeeInAnOrganisation);


                //getting attributes .
                for (int i = 0; i < listOfEmployeeInAnOrganisation.size(); i++) {


                        System.out.println(organisation.getListOfemployeesInOrganisation().get(i).getListOfAccountOfAnEmployee().get(i).getAmount());
                }

                


                for (int i = 0; i < listOfEmployeeInAnOrganisation.size(); i++) {

                        for (int j = 0; j < listOfAccountOfAnEmployee1.size(); j++) {


                                System.out.println("listOfAccountOfAnEmployee1  "+organisation.getListOfemployeesInOrganisation().get(i).getListOfAccountOfAnEmployee().get(j).getAmount());
                        } i++;
                        //break;} 
                        for (int j = 1; j < listOfAccountOfAnEmployee2.size(); j++) {
                                System.out.println("listOfAccountOfAnEmployee2  "+organisation.getListOfemployeesInOrganisation().get(i).getListOfAccountOfAnEmployee().get(j).getAmount());
                
                        }


                }

        }

}




/*Output
20000
657000
listOfAccountOfAnEmployee1  20000
listOfAccountOfAnEmployee1  5000
listOfAccountOfAnEmployee1  10000
listOfAccountOfAnEmployee2  657000
*/
