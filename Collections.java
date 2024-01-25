
                                         // Question: Generic Stack Implementation
/* class Vitstack<T>
{

    int n,top=-1;
    Object stack[ ];
    Vitstack(int size)
    {
        n=size;
        top=-1;
        stack=(T [])new Object[n];
    }
    void push(T e)
    {
       if(top==n-1)
       {
        System.out.println("stack is full");
       }
       else
       {
        top++;
        stack[top]=e;
       }
    }

    void pop()
    {
        if(top==-1)
        {
            System.out.println(" stack is empty ");
        }
        else
        {
            top--;
        }
    }
    void peek()
    {
        if(top==-1)
        {
            System.out.println(" stack is empty");
        }
        else
        {
            System.out.println(" peek element is "+stack[top]);
        }
    }
   boolean isEmpty()
   {
    if(top==-1)
    {
        return true;
    }
    else
    {
        return false;
    }
   }

   void size()
   {
    System.out.println("size is "+(top+1));
   }
}

class Collections
{
    public static void main(String [] args)
    {
                Vitstack<Integer> a=new Vitstack<Integer>(100);

                a.push(2);
                a.push(20);
                a.push(45);


                a.size();

                while(!a.isEmpty())
                {
                    a.peek();
                    a.pop();
                }


                a.pop();
    }
} */


                                    //   Question: Generic Sorting Method

/* class Student implements Comparable<Student>
{
    String name;
    double cgpa;
    Student()
    {
        name="  ";
        cgpa=0.0;
    }
    Student(String name,double cgpa)
    {
        this.name=name;
        this.cgpa=cgpa;
    }
   public  int compareTo (Student s)
    {
        if(this.cgpa>s.cgpa)
            return 1;
        else
            return -1;
    }
    public String toString()
    {
        return " name="+this.name+"  cgpa="+this.cgpa;
    }

}
class Collections
{
    static <T extends Comparable<T>> T[] sortdata(T [] a)
    {
        int i,j;
        int n=a.length;
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    T temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
    public static void main(String [] args)
    {
        Student s1=new Student(" suhsma",9.4);
        Student s2=new Student("lucky",9.2);
        Student s3=new Student("harh",8.7);


        Student[] s={s1,s2,s3};
        Integer[] a={22,33,51,1,23};
        Double[] b={12.21,61.12,4.33,3.09};
        String[] c={"abc","xyz","ghi","pqr"};


      sortdata(a);
     sortdata(b);
     sortdata(c);
     sortdata(s);

     for(Integer i:a)
     {
        System.out.println(i);
     }
     for(Double i:b)
     {
        System.out.println(i);
     }
     for(Student i:s)
     {
         System.out.println(i);
     }
     for(String i:c)
     {
         System.out.println(i);
     }


    }
} */

                  // Question: ArrayList Manipulation


/* import java.util.ArrayList;
 import java.util.Collections;             // here file name is collections ,so run in other ide
class Collections
{
    public static void main(String [] args)
    {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(45);
        a.add(22);
        a.add(31);
        a.add(78);
        a.add(81);


        
        for(Integer i:a)
        {
            System.out.println(i);
        }
               
        ArrayList<Integer> oddno=new ArrayList<Integer>();

        for(Integer i:a)
        {
            if((i%2)!=0)
            oddno.add(i);
            
        }
        System.out.println(" odd list ");
        for(Integer i:oddno)
        {
            System.out.println(i);
        }
        

        int sum=0;
        for(Integer i:oddno)
        {
            sum+=i;
        }
        System.out.println("sum of add list is "+sum);


        System.out.println("max value in arraylist is "+Collections.max(a));

        Collections.sort(a);
        System.out.println("after sorted list :");
        for(Integer i: a)
        {
            System.out.println(i);
        }

      

    }
} */





import java.util.ArrayList;
class Collections
{
  public static void main(String [] args)
  {
      ArrayList< ArrayList<String>> student=new ArrayList< ArrayList<String>>();
       ArrayList<String > s1=new ArrayList<String>();
       s1.add("Alice(Math,History)");

        ArrayList<String > s2=new ArrayList<String>();
       s2.add(" Bob (Science, English)");

        ArrayList<String > s3=new ArrayList<String>();
       s3.add(" Charlie (Art, Music)");

       student.add(s1);
       student.add(s2);
       student.add(s3);

    





  } 
}

