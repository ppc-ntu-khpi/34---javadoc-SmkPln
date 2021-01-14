package domain;
/**
 * Class for artist
 * @author alexa
 */
public class Artist extends Employee {
/**
 * Data
 * @param skiils - skiils of person 
 * @param name - name of person
 * @param jobTitle - jobtitle of person
 * @param level - level of person
 * @param dept dept of person
 */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
/**
 * skill
 * @param skiils - skiils of person
 */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * this skills is equal to new string
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    @Override
    /**
     * method that does: String to strind
     */
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
/**
 * string get skiils
 * @return string of skiil
 */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
/**
 * Changes skills
 * @param skills - skiils of person
 */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
/**
 * Skills list
 * @return string of skiils list
 */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
