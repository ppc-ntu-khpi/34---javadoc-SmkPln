package domain;
/**
 * Class for editor
 * @author alexa
 */
public class Editor extends Artist {
/**
 * Data
 * @param electronicEditing - parameter
 * @param skiils - skiils of editor
 * @param name -  name of editor
 * @param jobTitle - jobrirle of editor
 * @param level - level of editor
 * @param dept  - dept of editor
 */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }
/**
 * method for string electronic editing
 * @param electronicEditing - parameter
 * @param skiils - kiils of editor 
 */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }
/**
 * method for electronic editing
 * @param electronicEditing - parameter
 */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
/**
 *  Reliability of electronic editing
 */
    public Editor() {
        super();
        this.electronicEditing = true;
    }
/**
 * string get electronic editing
 * @return srting
 */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;
/**
 * Method for get preferences
 * @return electronic editing
 */
    public boolean getPreferences() {
        return electronicEditing;
    }
/**
 * Preferences type
 * @param electronic - type
 */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
