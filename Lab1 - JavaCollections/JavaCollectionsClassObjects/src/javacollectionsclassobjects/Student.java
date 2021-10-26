package javacollectionsclassobjects;

/**
 *
 * @author Nasif
 */
public class Student implements Comparable <Student> {
    
    String name;
    int ID;
    
    public Student(String name, int ID)
    {    
        this.name = name;
        this.ID = ID;
    }

    @Override
    public int compareTo(Student st) {
            if(ID==st.ID)
                return 0;
            else if (ID>st.ID)
                return 1;
            else 
                return -1;

     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
