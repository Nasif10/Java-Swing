package javacollections;

import java.util.*;

/**
 *
 * @author Nasif
 */
public class JavaCollections {

    public void myArrayList(){
        
        ArrayList<String> list=new ArrayList<String>();   //Creating arraylist  
        list.add("Ravi");                             //Adding object in arraylist  
        list.add("Vijay");  
        list.add("Teja");  
        list.add("Ajay"); 
        list.add("Jadeja"); 
                
        list.remove(4);   // Remove element at index 4
 
        Iterator itr=list.iterator();   //Traversing list through Iterator   
        while(itr.hasNext()){  
              System.out.println(itr.next());  
        }
    }
    
    
    public void myLinkedList(){
        
        LinkedList<String> al=new LinkedList<String>();  
        al.add("N");  
        al.add("a");  
        al.add("c");  
        al.add("f");
        
        for(String name:al)         //Traversing list through for-each loop     
          System.out.println(name);
    }
    
    
     public void myVector(){
         
         Vector<String> v=new Vector<String>();  
         v.add("Ayush");  
         v.add("Amit");  
         v.add("Ashish");  
         v.add("Garima");  
         Iterator<String> itr=v.iterator();  
         while(itr.hasNext()){  
              System.out.println(itr.next());  
         }    
     }
     
     
     public void myStack(){
         
         Stack<String> stack = new Stack<String>();  
         stack.push("Na");  
         stack.push("As");  
         stack.push("Si");  
         stack.push("If");  
         
         Iterator<String> itr=stack.iterator();  
         while(itr.hasNext()){  
             System.out.println(itr.next());  
         }
         
         System.out.println(stack);
         System.out.println("Stack size : "+stack.size());
         stack.pop();
         System.out.println(stack);                            
     }
     
     
     public void myHashSet(){
         
          HashSet<String> set=new HashSet<String>();  
          set.add("Ravi");  
          set.add("Vijay");  
          set.add("Ravi");     //HashSet doesn't allow duplicate elements.
          set.add("Ajay");  
  
          Iterator<String> itr=set.iterator();  
          while(itr.hasNext()){  
                  System.out.println(itr.next());  
          }      
     }
     
     
     
     public void myMap(){
         
         Map map=new HashMap();          
         map.put(1,"Amit");       //Adding elements to map 
         map.put(5,"Rahul");  
         map.put(7,"Jai");  
 
         Set set=map.entrySet();         //Traversing Map; Converting to Set so that we can traverse  
         Iterator itr=set.iterator();  
         while(itr.hasNext()){               
             Map.Entry entry=(Map.Entry)itr.next();      //Converting to Map.Entry so that we can get key and value separately
             System.out.println(entry.getKey()+" "+entry.getValue());  
         } 
     }
    
            
    
    public static void main(String[] args) {
        
        JavaCollections obj = new JavaCollections();
        obj.myArrayList();
        //obj.myLinkedList();
        //obj.myVector();
        //obj.myStack();
        //obj.myHashSet();
        //obj.myMap();
    } 
    
}
