package A00Basic;

/** @author Stephen */

public class EmployeeTest {

   public static void main(String[] args) {
      
      // fill the staff array with three Employee objects
      Employee[] staff = new Employee[3];
      staff[0] = new Employee("Carl Craker", 75000, 1987, 12, 15);
      staff[1] = new Employee("Henry Hacker", 50000, 1989, 10, 1);
      staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15);
      
      // raise everyones salary by 5%
      for (Employee e : staff) {
         e.raiseSalary(5);
      }
      
      // print out infromation about all Employee objects
      for (Employee e : staff) {
         System.out.println("name:" + e.getName() + ", salary=" + e.getSalary() + ", hireDay=" + e.getHireDay());
      }
   }
}
