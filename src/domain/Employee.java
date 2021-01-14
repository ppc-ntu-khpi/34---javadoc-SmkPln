package domain;
/**
 * Class for employee
 * @author alexa
 */
public class Employee {
/**
 * Method for connecting strings
 * @return connecting
 */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
/**
 * Method for employee
 * @param name - name of employee
 * @param jobTitle - jobtitle of employee 
 * @param level - level of employee
 * @param dept - dept of employee
 */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
/**
 * randomizer
 */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
/**
 * Changes jobtitle
 * @param job - job of employee
 */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
/**
 * Method for String get jobtitle
 * @return string jobtitle
 */
    public String getJobTitle() {
        return jobTitle;
    }
/**
 * Method for String get name
 * @return 
 */
    public String getName() {
        return name;
    }
/**
 * method for installing level
 * @param level - level of employee
 */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
/**
 * String get level
 * @return string level
 */
    public int getLevel() {
        return level;
    }
/**
 * String get dept
 * @return string dept
 */
    public String getDept() {
        return dept;
    }
/**
 * method for installing dept
 * @param dept - dept of employee
 */
    public void setDept(String dept) {
        this.dept = dept;
    }
/**
 * method for installing name
 * @param name - name of employee
 */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
