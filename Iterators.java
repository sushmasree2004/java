
                                                          // collections would be good name for this file
/*import java.util.ArrayList;
import java.util.Iterator;

class Iterators
 {

    public static void main(String arg[]) 
    {
        
        // Process collection of Integers ArrayList
        
        ArrayList<Integer> is = new ArrayList<Integer>();
        
        System.out.println("The size is: "+is.size());
        
        is.add(10);
        is.add(20);
        is.add(15);
        is.add(-23);
        is.add(0);
        
        System.out.println("The size is: "+is.size());
        
        // Access each element using for-each or enhanced for loop
        
        for(Integer item:is)
        {
            System.out.println("The items are: "+item);
        }

        
        
        // Access using Iterator Interface
        
        Iterator<Integer> iterator =  is.iterator();
        
        // hasNext() , next()
        
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
                
                
    }
}*/



/*import java.util.ArrayList;
import java.util.Iterator;
class Student
{
    String name;
    int regno;

    public Student(String name, int regno) 
    {
        this.name = name;
        this.regno = regno;
    }

   
    public String toString()
     {
        return "Student{" + "name=" + name + ", regno=" + regno + '}';
    }
    
    
}
class Iterators 
{

    public static void main(String arg[])
     {
        
        // Process collection of Student  ArrayList
        
        ArrayList<Student> is = new ArrayList<Student>();
        
        System.out.println("The size is: "+is.size());
        
        is.add(new Student("naga raja",101));
        is.add(new Student("ramesh ",102));
        is.add(new Student("vellore",103));
       
        
        System.out.println("The size is: "+is.size());
        
        // Access each element using for-each or enhanced for loop
        
        for(Student item:is)
        {
            System.out.println("The items are: "+item);
        }
        
        // Access using Iterator Interface
        
        Iterator<Student> iterator =  is.iterator();
        
        // hasNext() , next()
        
       
        
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
                
                
    }
}*/





/* import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Student implements Comparable<Student>
{
    String name;
    int regno;

    public Student(String name, int regno)
     {
        this.name = name;
        this.regno = regno;
    }

    
    public String toString()
     {
        return "Student{" + "name=" + name + ", regno=" + regno + '}';
    }

    
    public int compareTo(Student o)
     {
        
      return  this.name.compareTo(o.name);
    }
    
    
}
class Iterators
 {

    public static void main(String arg[]) 
    {
        
        // Process collection of Integers ArrayList
        
        ArrayList<Student> is = new ArrayList<Student>();
        
        System.out.println("The size is: "+is.size());
        
        is.add(new Student(" zaraa",101));
        is.add(new Student("ramesh ",1089));
        is.add(new Student("vellore",103));
       
        
        System.out.println("The size is: "+is.size());
        
        // Access each element using for-each or enhanced for loop
        
        for(Student item:is)
        {
            System.out.println("The items are: "+item);
        }
        
        Collections.sort(is);
        // Access using Iterator Interface
        
        Iterator<Student> iterator =  is.iterator();
        
        // hasNext() , next()
        
       
        
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}*/





import java.util.ArrayList;

class Iterators
{

    public static void main(String arg[]) 
    {
               ArrayList<ArrayList<Integer>> outerlist = new ArrayList<ArrayList<Integer>>();
         
         
        ArrayList<Integer> il1 = new ArrayList<Integer>();
        il1.add(10);
        il1.add(20);
        
         ArrayList<Integer> il2 = new ArrayList<Integer>();
        il2.add(2);
        il2.add(5);
        il2.add(4);
        
       
        
        outerlist.add(il1);
         outerlist.add(il2);
         
         System.out.println(outerlist);
         
         for(ArrayList<Integer> item:outerlist)
         {
             for(Integer item2:item)
             {
                 System.out.println(item2);
             }
         }
         
         
     
    }
}




/* import java.util.ArrayList;
import java.util.HashMap;


class Iterators 
{

    public static void main(String arg[])
     {
        
       // HashMap = (Key, value) pair
                
       HashMap<String, ArrayList<String>> stdata = new HashMap<String, ArrayList<String>>();
       
       ArrayList<String> st1 = new ArrayList<String>();
       st1.add("c");
       st1.add("c++");
       st1.add("java");
       st1.add("python");
       
       ArrayList<String> st2 = new ArrayList<String>();
       st2.add("ds");
       st2.add("cn");
       st2.add("os");
       
       
       stdata.put("21BCE0100", st1);
        stdata.put("21BCB0120", st2);
       
        
        
        System.out.println(stdata);
        
    }
}*/

