/*import java.io.*;
public class Files  
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File f=new File("TheInfluenceofCultureonEnglishLanguageLearningAtUniversityStudies.pdf");
        
        if(f.isFile())                                                                                               // ccreate a file and check it is available or not
        {
            System.out.println("file is available");                 
        }
        else
        {
            System.out.println("file is  not available");

        }
        f.getPath();
        pw.close();
    }
}*/


                               //corrected code
/*import java.io.*;

public class Files 
{
    public static void main(String[] args)
     {
        File f = new File("abc.java");

        try
         {
            
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            pw.print("Hello world ");
            pw.println("sushma");
            pw.close();
            fw.close();
            System.out.println("File path: " + f.getAbsolutePath());
        }
         catch (IOException e)
          {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}*/
 
                                     // PRINT WRITER AND SCANNER 

/*import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Files
{
    public static void main(String[] args)  throws FileNotFoundException,NoSuchElementException
    {
        File f=new File("App.java");                                                
        PrintWriter pw=new PrintWriter(f);
        pw.println("hello world");
        pw.println("sushma");
        pw.print(456);
        
        pw.close();

                                                                             //write data in file  and read data from file using Print Writer and Scanner class  
                                    
        Scanner sc=new Scanner(f);

       System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextInt());  

                                                 //   { OR }
        while(sc.hasNext())                                             //  hasNext() method
        {
            System.out.println(sc.nextLine());
        }
        sc.close();




    
    }
}*/



                                          // FILE WRITER AND FILE READER

/*import java.io.*;
public class Files
{
    public static void main(String[] args) throws IOException                                   // File Writer and File Reader  class
    {
        File f=new File("abc.txt");
        FileWriter fw= new FileWriter(f);
        fw.write("lucky\n");
        fw.write("45678");
        fw.close();
        
        FileReader fr=new FileReader(f);
        int ch;
        while((ch=fr.read())!=-1)
        {
            System.out.print((char)ch);
            
        }
        fr.close();
    }
}*/

                                                        // FILEINPUTSTREAM AND FILE OUTPUTSTREAM 

/*import java.io.*;
public class Files
{
    public static void main(String [] arrgs)  throws FileNotFoundException,IOException
    {
                                                                                         //to give input s bytes we use fileInputStream and FileOutputStream
        File f=new File("abc.txt");
        FileOutputStream fo=new FileOutputStream(f);                                      //BYTE IO 
        String msg="lucky\n";
        String msg2="7i90";
        fo.write(msg.getBytes());
        fo.write(msg2.getBytes());
        fo.close();
        
        
        FileInputStream fi=new FileInputStream(f);
        int ch;
        while((ch=fi.read())!=-1)
        {
            System.out.print((char)ch);
            
        }
        fi.close();
    }
}*/
                                                    //BUFFERINPUTSTREAM AND BUFFEROUTPUTSTREAM
                                                    //(should use along with Fileinput and fileoutput stream)


/*import java.io.*;
public class Files
{
    public static void main (String[] args) throws FileNotFoundException,IOException
    {
        File f=new File("abc.txt");
        FileOutputStream fo=new FileOutputStream(f);  
        BufferedOutputStream bo= new BufferedOutputStream(fo);
        String msg="welcome to filess";
        bo.write(msg.getBytes());
        bo.close();

         FileInputStream fi=new FileInputStream(f);  
         BufferedInputStream bi= new BufferedInputStream(fi);
         int ch;
         while((ch=bi.read())!=-1)
         {
            System.out.print((char)ch);
         }
         bi.close();





    }
}*/


                                                         // OBJECTINPUTSTREAM AND OBJECTOUTPUTSTREAM

import java.io.*;

class Student implements Serializable
{
    int regno;
    String name;
    Student()
    {
        regno=98876;
        name="sushma";
    }
    Student(int regno,String name)
    {
        this.regno=regno;
        this.name=name;
    }
}
public class Files
{
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        Student s1=new Student(421725,"lucky");
          Student s2=new Student(7289,"sushma");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("abc.txt")));
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.close();
        
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("abc.txt")));

         try
         {
            while (true) 
            {
                Student temp = (Student) ois.readObject();
                System.out.println("name is " + temp.name + " gpa is " + temp.gpa);
            }
        } 
        catch (EOFException e)
         {
            // End of file reached
            System.out.println("End of file reached");
        } 
        finally
         {
            ois.close();
        }

        
        
        
    }
}


    
                                       //FILE IO QUESTIONS
   
                  // QUESTION 1  Write a Java program to copy the contents of one file into another




/*import java.io.*;
import java.util.Scanner;
public class Files
{
    public static void main(String[] args) throws FileNotFoundException,IOException
    {
        File source_file=new File("source.txt");
               

        File dest_file=new File("dest.txt");
        
        
            PrintWriter pw1=new PrintWriter(source_file);
             pw1.print("lucky is gud boi");
             pw1.close();
            Scanner sc=new Scanner(source_file);
            PrintWriter pw2=new PrintWriter(dest_file);
            while(sc.hasNext())
            {
                String line=sc.nextLine();
                pw2.println(line);
            }
            sc.close();
            
            Scanner sc2=new Scanner(dest_file);
            while(sc2.hasNext())
            {
                System.out.println(sc2.nextLine());
            }
            sc2.close();
            pw2.close();
      }
}   */       


            //QUESTION 2   Write a Java program that removes all the occurrences of a specified string from a text file.     not giving cirrect output

/*import java.io.*;
import java.util.Scanner;
public class Files
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File f1=new File("abc.txt");
         PrintWriter pw1=new PrintWriter(f1);

        File f2=new File("modified.txt");
         PrintWriter pw2=new PrintWriter(f2);
        pw1.print("sushma is a sushma girl");
        String targetString="sushma";
        Scanner sc1=new Scanner(f1);
        while(sc1.hasNext())
        {
            String line=sc1.nextLine();
            String modifiedLine=line.replaceAll(targetString," ");
            pw2.println(modifiedLine);

        }
                
pw1.close();
         Scanner sc2=new Scanner(f2);

        while(sc2.hasNext())
        {
            System.out.println(sc2.nextLine());
        }
        
        sc1.close();
      
        sc2.close();


    }
}    */                             


// QUESTION 3        Write a Java program that will count the number of characters, words, and lines in a file. 
 /* 
import java.io.*;
import java.util.Scanner;

public class Files
 {
    public static void main(String[] args) throws FileNotFoundException
     {
        
        File f = new File("input.txt");
       

    
        PrintWriter p=new PrintWriter(f);
        p.write("happy birthday luckyy 20");
        p.close();

       int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;
         Scanner sc = new Scanner(f);
       

        while (sc.hasNextLine())
         {
            String line = sc.nextLine();
            lineCount++;
            characterCount += line.length();
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        sc.close();
       


        System.out.println("Character Count: " + characterCount);
        System.out.println("Word Count: " + wordCount);
        System.out.println("Line Count: " + lineCount);
    }
}
*/



 // QUESTION 4    Suppose that a text file contains an unspecified number of scores separated by blanks. Write a
//program that prompts the user to enter the file, reads the scores from the file, and displays their
//total and average. 


/*import java.io.*;
import java.util.Scanner;

public class Files
 {
    public static void main(String[] args) throws FileNotFoundException
     {
      
        File f=new File("asd.txt");
        PrintWriter pw=new PrintWriter(f);
        pw.write("55,77,99");
        pw.close();

         int total = 0;
        int count = 0;

        Scanner sc= new Scanner(f);
        
        while (sc.hasNext())
         {
            if (sc.hasNextInt()) 
            {
                int score = sc.nextInt();
                total += score;
                count++;
            } else 
            {
            
                sc.next();
            }
        }
        
        sc.close();
        
        if (count == 0)
         {
            System.out.println("No valid scores found in the file.");
        } 
        else
         {
            double average = (double) total / count;
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
        }
    }
}*/


//QUESTION 5    Write a program to create a file named abc.txt if it does not exist. Write 100 integers created
//randomly into the file using text I/O. Integers are separated by spaces in the file. Read the data back
//from the file and display the total no. of even numbers and odd numbers. 

/* 
import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Files
 {
    public static void main(String[] args) throws FileNotFoundException 
    {

        File f=new File("abc.txt");
        PrintWriter pw = new PrintWriter(f);

        Random rd=new Random(9988);
        for(int i=0;i<100;i++)
        {
           int  randomNumber=rd.nextInt(100);
            pw.println(randomNumber);
        }
     
        pw.close();

        Scanner sc = new Scanner(f);
         int evenCount = 0;
        int oddCount = 0;


        while (sc.hasNextInt())
         {
            int number = sc.nextInt();
            if (number % 2 == 0)
             {
                evenCount++;
            } 
            else
             {
                oddCount++;
            }
         }
        sc.close();

        System.out.println("Total number of even numbers: " + evenCount);
        System.out.println("Total number of odd numbers: " + oddCount);
    }
}
*/

//QUESTION 6


/*  Create a data file with 10 lines. Each line in the file consists of a faculty member’s first name, last
name, rank (designation), and salary. The faculty member’s first name and last name for the ith line
are FirstNamei and LastNamei. The rank is randomly generated as assistant, associate, and full. The
salary is randomly generated as a number. The salary for an assistant professor should be in the
range from 50,000 to 80,000, for associate professor from 60,000 to 110,000, and for full professor
from 75,000 to 130,000. Save the file in Salary.txt. Here are some sample data:
FirstName1 LastName1 assistant 60055
FirstName2 LastName2 associate 81112
. . .
FirstName10 LastName10 full 92255
Write a program to display the total salary for assistant professors, associate professors, full
professors, and all faculties, respectively, and display the average salary for assistant professors,
associate professors, full professors, and all faculties, respectively. Also, display the name of the
professors who takes highest salary and lowest salary  */


/*import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Files
 {
    public static void main(String[] args) throws IOException 
    {
        File f=new File("Salary.txt");
        PrintWriter pw = new PrintWriter(f);
        Random rd= new Random();

        for (int i = 1; i <= 10; i++)
         {
            String firstName = "FirstName" + i;
            String lastName = "LastName" + i;

            String rank="";
            int salary=0;

            int rankNumber = rd.nextInt(3);
            switch (rankNumber)
             {
                case 0:
                    rank = "assistant";
                    salary = 50000 + rd.nextInt(30001); 
                    break;
                case 1:
                    rank = "associate";
                    salary = 60000 + rd.nextInt(50001); 
                    break;
                case 2:
                    rank = "full";
                    salary = 75000 + rd.nextInt(55001); 
                    break;
              
            }

            pw.println(firstName + " " + lastName + " " + rank + " " + salary);
        }
        pw.close();

        Scanner sc = new Scanner(f);
        int assistantCount = 0, associateCount = 0, fullCount = 0;
        int assistantTotal = 0, associateTotal = 0, fullTotal = 0;
        int totalCount = 0, totalSalary = 0;
        int maxSalary = 0, minSalary = Integer.MAX_VALUE;
        String highestSalaryFaculty = "", lowestSalaryFaculty = "";

        while (sc.hasNext()) 
        {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String rank = parts[2];
            int salary = Integer.parseInt(parts[3]);

            switch (rank) 
            {
                case "assistant":
                    assistantCount++;
                    assistantTotal += salary;
                    break;
                case "associate":
                    associateCount++;
                    associateTotal += salary;
                    break;
                case "full":
                    fullCount++;
                    fullTotal += salary;
                    break;
            
            }

            totalCount++;
            totalSalary += salary;

            if (salary > maxSalary )
             {
                maxSalary = salary;
                highestSalaryFaculty = parts[0] + " " + parts[1];
            }

            if (salary < minSalary)
             {
                minSalary = salary;
                lowestSalaryFaculty = parts[0] + " " + parts[1];
            }
        }

        sc.close();

        System.out.println("Total salary for assistant professors: " + assistantTotal);
        System.out.println("Total salary for associate professors: " + associateTotal);
        System.out.println("Total salary for full professors: " + fullTotal);
        System.out.println("Total salary for all faculty: " + totalSalary);

        System.out.println("Average salary for assistant professors: " + (assistantTotal / (double) assistantCount));
        System.out.println("Average salary for associate professors: " + (associateTotal / (double) associateCount));
        System.out.println("Average salary for full professors: " + (fullTotal / (double) fullCount));
        System.out.println("Average salary for all faculty: " + (totalSalary / (double) totalCount));

        System.out.println("Faculty with the highest salary: " + highestSalaryFaculty);
        System.out.println("Faculty with the lowest salary: " + lowestSalaryFaculty);
    }
}*/


//QUESTION 7

/* Consider an Employee contains the data such as EMPID, NAME, SALARY and DESIGNATION
(RANK). Consider there are 10 employees. Create and write the 10 employee object’s into a file,
employee_info.txt. Read the same data back from file and display on monitor. Also, find the average
salary of all the employees; find the employee details of who is getting highest salary and lowest
salary. */
/*import java.io.*;



import java.util.Random;
class Employee  implements Serializable
{
    String name;
    String id;
    int salary;
    int rank;
    Employee()
    {
        name="sushma";
        id="22bce2292";
        salary=20000;
        rank=32;

    }
    Employee(String name,String id,int salary,int rank)
    {
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.rank=rank;
    }

}
public class Files
{
    public static void main(String [] args) throws FileNotFoundException,IOException,ClassNotFoundException
    {
        Employee [] e=new Employee[10];
       ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("emp.txt")));
       Random rd = new Random();

        for (int i = 0; i < 10; i++) 
        {
            String name = "Employee" + (i + 1);
            String id = "ID" + (i + 1);
            int salary = 20000 + rd.nextInt(50000); // Random salary between 20000 and 70000
            int rank = 20 + rd.nextInt(30); // Random rank between 20 and 50

            Employee employee = new Employee(name, id, salary, rank);
            e[i] = employee; // Storing employee object in the array

            oos.writeObject(employee);
        }
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("emp.txt")));
        Employee[] readEmployees = new Employee[10];
        int sumSalary = 0;
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        Employee highestSalaryEmployee = null;
        Employee lowestSalaryEmployee = null;

        for (int i = 0; i < 10; i++)
         {
            Employee employee = (Employee) ois.readObject();
            readEmployees[i] = employee;

            sumSalary += employee.salary;

            if (employee.salary > maxSalary)
             {
                maxSalary = employee.salary;
                highestSalaryEmployee = employee;
            }

            if (employee.salary < minSalary)
             {
                minSalary = employee.salary;
                lowestSalaryEmployee = employee;
            }
        }

        ois.close();

        
        System.out.println("Data read from the file:");
        for (Employee employee : readEmployees)
         {
            System.out.println(employee.name + " " + employee.id + " " + employee.salary + " " + employee.rank);
        }

        double averageSalary = sumSalary / 10.0;
        System.out.println("Average salary of all employees: " + averageSalary);
        System.out.println("Employee with the highest salary: " + highestSalaryEmployee.name);
        System.out.println("Employee with the lowest salary: " + lowestSalaryEmployee.name);
    }
}
*/


