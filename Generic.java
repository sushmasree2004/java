

/* class Generic 
 {


    public static void main(String arg[])
     {
    
         display(10, "naga");
        display(23.45, 23);
        display("naga raja", "naga ramesh");
        
        System.out.println("max of int is: "+findMax(10,20));
        System.out.println("max of double is: "+findMax(34.56,23.67));
        System.out.println("max of string is: "+findMax("na","ra"));
    }
       private static<T, U> void display( T i, U j)
        {
     
              System.out.println(i+" "+j);
         } 
     
    
    
    static <T extends Comparable<T>> T findMax(T a, T b)                        //generic function
     {

        if( a.compareTo(b) >0)
            return a;
        else
            return b;
    }

   

}*/



/*class Example<T>                                        //generic class
{
    
    void display(T a)
    {
        System.out.println(a);
    }
    
    
}
class Generic
 {

    public static void main(String arg[])
     {
        

        Example<Integer> obj1 =new Example<Integer>();
        obj1.display(10);
        
        Example<Double> obj2 =new Example<Double>();
        obj2.display(23.45);
        
        Example<String> obj3 =new Example<String>();
        obj3.display("naga raja");

    }

}*/



 class Student implements Comparable<Student>
{
    String name;
    double cgpa;
    Student(String name, double cgpa)
    {
        this.name=name;
        this.cgpa=cgpa;
    }

    
      public int compareTo(Student o)
     {
        
        if(this.cgpa>o.cgpa)
            return 1;
        else
            return -1;
        
        }

    
    public String toString() 
    {
        return this.name + " "+this.cgpa;
    }
    
}

class Generic
 {

   static <T extends Comparable<T>> T findMax(T a, T b)                        
     {

        if( a.compareTo(b) >0)
            return a;
        else
            return b;
    }

    public static void main(String arg[])
     {
           
        Student s1 = new Student("naga", 8.97);
        Student s2 = new Student("raja", 9.55);
        System.out.println("find highest cgpa student is: "+findMax(s1,s2));
    }
}



/*class Student implements Comparable<Student>
{
    String name;
    double cgpa;
    Student(String name, double cgpa)
    {
        this.name=name;
        this.cgpa=cgpa;
    }

    
    public int compareTo(Student o) 
    {
        
        if(this.cgpa>o.cgpa)
            return 1;
        else
            return -1;
        
        }

    public String toString()
     {
        return String.valueOf(this.cgpa);
    }
    
}

class Generic 
{

    static <T extends Comparable<T> > T[] sortData(T[] a) 
    {
          
       int i,j;
       int n=a.length;
       for(i=0;i<n-1;i++)
       {
           for(j=0;j<n-i-1;j++)                                                      //sorting 
           {
               if(a[j].compareTo(a[j+1])>0)
               {
                   T c;
                   c=a[j];
                   a[j]=a[j+1];
                   a[j+1]=c;
               }
           }
       }
       return a;
    }

    public static void main(String arg[])
     {
        
        
        
        Student s1 = new Student("naga", 8.97);
        Student s2 = new Student("raja", 9.55);
        Student s3 = new Student("abc", 7.97);
        Student s4 = new Student("def", 9.25);
        
        Integer[] a = {3,2,5,4,6,1};
        Double[] b = {3.5,1.5,6.7,2.4,8.9,6.4};
        String[] c = {"naga","raja","vit","abc","xyz"};
        Student[] s = {s1,s2,s3,s4};
        
        sortData(a);
         sortData(b);
          sortData(c);
           sortData(s);
           
           for(Integer i:a)
           {
               System.out.print(i+" ");
              
           }
            System.out.println("");
            for(Double i:b)
            {
               System.out.print(i+" ");
              
           }
            System.out.println("");
            for(String i:c)
            {
               System.out.print(i+" ");
              
           }
            System.out.println("");
            for(Student i:s){
               System.out.print(i+" ");
              
           }
            System.out.println("");
    }
}*/

// Homework:

//1. add display() generic method
//2. implement above using generic class instead of generic method.



/* class Student implements Comparable<Student>
 {
    String name;
    double cgpa;

    Student(String name, double cgpa) 
    {
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student o) 
    {
        return Double.compare(this.cgpa, o.cgpa);
    }

    @Override
    public String toString() 
    {
        return name + " " + cgpa;
    }
}

class Sort<T extends Comparable<T>> 
{
    private T[] data;

    Sort(T[] data) 
    {
        this.data = data;
    }

    T[] sortData()
     {
        int i, j;
        int n = data.length;
        for (i = 0; i < n - 1; i++) 
        {
            for (j = 0; j < n - i - 1; j++)
             {
                if (data[j].compareTo(data[j + 1]) > 0) 
                {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        return data;
    }

    void display()
     {
        for (T item : data)
         {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class Generic
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("naga", 8.97);
        Student s2 = new Student("raja", 9.55);
        Student s3 = new Student("abc", 7.97);
        Student s4 = new Student("def", 9.25);

        Integer[] a = {3, 2, 5, 4, 6, 1};
        Double[] b = {3.5, 1.5, 6.7, 2.4, 8.9, 6.4};
        String[] c = {"naga", "raja", "vit", "abc", "xyz"};
        Student[] s = {s1, s2, s3, s4};

        Sort<Integer> A = new Sort<>(a);
        A.sortData();
        A.display();

        Sort<Double> B = new Sort<>(b);
        B.sortData();
        B.display();

        Sort<String> C =new  Sort<>(c);
        C.sortData();
        C.display();

        Sort<Student> S = new Sort<>(s);
        S.sortData();
        S.display();
    }
}

*/





/*import java.util.Arrays;

class Student implements Comparable<Student>
{
    String name;
    double cgpa;
    Student(String name, double cgpa)
    {
        this.name=name;
        this.cgpa=cgpa;
    }

    
    public int compareTo(Student o) 
    {
        
        if(this.cgpa>o.cgpa)
            return 1;
        else
            return -1;
        
        }

  
    public String toString() 
    {
        return String.valueOf(this.cgpa);                 
    }
    
}

class Generic                                       // sorting using library
 {

    static <T extends Comparable<T> > T[] sortData(T[] a) 
    {
          
       Arrays.sort(a);
       return a;
    }

    public static void main(String arg[]) 
    {
        
        
        
        Student s1 = new Student("naga", 8.97);
        Student s2 = new Student("raja", 9.55);
        Student s3 = new Student("abc", 7.97);
        Student s4 = new Student("def", 9.25);
        
        Integer[] a = {3,2,5,4,6,1};
        Double[] b = {3.5,1.5,6.7,2.4,8.9,6.4};
        String[] c = {"naga","raja","vit","abc","xyz"};
        Student[] s = {s1,s2,s3,s4};
        
        sortData(a);
         sortData(b);
          sortData(c);
           sortData(s);
           
           for(Integer i:a){
               System.out.print(i+" ");
              
           }
            System.out.println("");
            for(Double i:b){
               System.out.print(i+" ");
              
           }
            System.out.println("");
            for(String i:c){
               System.out.print(i+" ");
              
           }
            System.out.println("");
            for(Student i:s){
               System.out.print(i+" ");
              
           }
            System.out.println("");
    }
}*/
// Homework:

//1. add display() generic method
//2. implement above using generic class instead of generic method.