package domain;
/**
 * Class for manager
 * @author alexa
 */
public class Manager extends Employee {
/**
 * constructor
 * Data
 * @param employees - person
 * @param name - name 
 * @param jobTitle
 * @param level
 * @param dept 
 */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
/**
 * Method for string get employees
 * @return string employee
 */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
/**
 * Method for changes employees
 */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
 /**
  * A method for dividing employees into employees in an array
  */   
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
/**
 * Method for strinf get employees
 * @return string 
 */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * method for installing employees
 * @param employees - persons
 */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
/**
 * Get EmployeesList
 * @return employees
 */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
