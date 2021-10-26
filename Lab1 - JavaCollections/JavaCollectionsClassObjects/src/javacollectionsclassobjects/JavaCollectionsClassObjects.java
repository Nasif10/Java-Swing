package javacollectionsclassobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Nasif
 */
public class JavaCollectionsClassObjects {


    public static void main(String[] args) {
        
        Student s1 = new Student ("Kamal", 24);
        Student s2 = new Student ("Jamal", 20);
        Student s3 = new Student ("Abul", 24);
        
        ArrayList <Student> al = new ArrayList <Student>();
        
        al.add(s1);
        al.add(s2);
        al.add(s3);
        
        Collections.sort(al);    //Sorting the list  
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            Student st = (Student) itr.next();
            System.out.println(st.name + "  " + st.ID);
        }
    }
    
}
