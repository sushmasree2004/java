/*public class ExceptionHandling
{
    public static void main(String [] args)
{
    int [] a={1,2,3,4,5};
    System.out.println(a[0]);                     // displays 1
    System.out.println(a[10]);                   //  displays ArrayIndexOutOfBoundsException   and terminates
    System.out.println("Helloo  ");             // Hello not executed because of terminationn
}

}*/



                                           //Fixing code            //ARRAYOUTOFINDEX AND ARITHEMATIC
/*public class ExceptionHandling
 {
    public static void main(String [] args)
{
    try
    {
            int [] a={1,2,3,4,5};
            System.out.println(a[0]);                     
           System.out.println(a[10]);   

                      //here if error occurs catch block exceutes remaing doesnt excecutes 
                      //for any try block only one catch block executes
            System.out.println(a[5/0]);                 
            System.out.println("Helloo  ");  
            
    }
    catch(ArrayIndexOutOfBoundsException obj)
    {
      
      System.out.println("Error occurs check index ");
    }
    catch(ArithmeticException obj)
    {
        System.out.println("Error occurs division by  0");
    }
    
    finally
    {
        System.out.println("Must execute this block");
    }


              
}
} */
                                             //NULL POINTER EXCEPTION 

/*public class ExceptionHandling
{

   public static void main ( String args[])
   {
     try
    {
            String x=null;
            int y=x.length();
            System.out.println("length = "+y);
    }
    catch(NullPointerException obj)
    {
        System.out.println(" intialise the variable");
    }
   }
}*/





                                    //CHECKED VS UNCHECKED EXCEPTION


                                    //checked means compiler forces developer to handle the exception

import java.io.*;

public class ExceptionHandling
{
    public static void main(String[] args)
    {
         
        try 
         {
                
              FileInputStream file = new FileInputStream(new File ("abc.txt"));       //checked
         }
         catch ( FileNotFoundException obj) 
         {
            System.out.println("File not found ");
        }
       
       
        
    }
}
                               //THREE SENARIOS

        
// FIRST ONE (predefined context and predefined exception)

/*public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
            int [] a={22,33,44,55};
            System.out.println(a[7]);                //here a[7] is contex
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println(" error occurs check index ");
        }
    }
}*/






//SECOND ONE(user defined context and predefined exception)             IMP


/*import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling
{
    public static void main(String[] args)
    {
        try
        {
           int mark;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter number between 0 to 50");
           mark=sc.nextInt();
           if(mark<0 || mark>50)
           {
            throw new ArithmeticException(" mark out of range ");
           }
           System.out.println("the marks is "+mark);
        }
        catch(InputMismatchException obj)
        {
            
            System.out.println(obj.getMessage());
        }
        catch(ArithmeticException obj)
        {
            System.out.println(" input error ");
        }
    }
}*


//   THIRD ONE (user defined context and user defined exception)
/*import java.util.InputMismatchException;
import java.util.Scanner;
class VITcatMarks extends Exception
{
    VITcatMarks(String msg)
    {
        super(msg);
    }

        
}
public class ExceptionHandling
{
    public static void main(String[] args)
    {
         try
        {
           int mark;
           Scanner sc=new Scanner(System.in);
           System.out.println("enter number between 0 to 50");
           mark=sc.nextInt();
           if(mark<0 || mark>50)
           {
            throw new InputMismatchException(" mark out of range ");
           }
           System.out.println("the marks is "+mark);
        }
        catch(InputMismatchException obj)
        {
            
            System.out.println(obj.getMessage());
        }
        catch(ArithmeticException obj)
        {
            System.out.println(" input error ");
        }
        catch(VITcatMarks obj)
        {
            System.out.println(obj.getMessage());
        }
    }
}*/                                 


                                                    //TEXT BOOK PROGRAMS

                                                    //12.1

/*import java.util.Scanner;

public class ExceptionHandling
 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an expression (e.g., 1 + 2): ");
        int operand1 = input.next();
        String operator = input.next();
        String operand2Str = input.next();

        if (isNumeric(operand1Str) && isNumeric(operand2Str))
         {
            double operand1 = Double.parseDouble(operand1Str);
            double operand2 = Double.parseDouble(operand2Str);
            double result = calculate(operand1, operator, operand2);
            System.out.println("Result: " + result);
        } 
        else 
        {
            System.out.println("Error: Non-numeric operand detected.");
        }
    }

    public static boolean isNumeric(String str)
     {
        try
         {
            Double.parseDouble(str);
            return true;
        } 
        catch (NumberFormatException e)
         {
            return false;
        }
    }

    public static double calculate(double operand1, String operator, double operand2)
     {
        switch (operator)
         {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0)
                 {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.exit(1);
                }
                return operand1 / operand2;
            default:
                System.out.println("Error: Invalid operator: " + operator);
                System.exit(1);
                return 0; // This is unreachable, just to satisfy the compiler
        }
    }
}*/

                          
                                                    //12.2
/*import java.util.*;
public class ExceptionHandling
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
            int num1=0;
            int num2=0;
            boolean valid=false;
    do
    {
        try
        {
            System.out.println("enter an integer");
            num1=sc.nextInt();
            valid=true;
            System.out.println("num 1="+num1);

        }
        catch(InputMismatchException obj)
        {
            System.out.println("invalid input please enter only integer");
            sc.nextLine();                                                     //TO CLEAR BUFFER
        }
    }while(!valid);
        
    valid=false;

     do
    {
        try
        {
            System.out.println("enter an integer");
            num2=sc.nextInt();
            valid=true;
            System.out.println("num 2="+num2);

        }
        catch(InputMismatchException obj)
        {
            System.out.println("invalid input please enter only integer");
            sc.nextLine();            //TO CLEAR BUFFER
        }
    }while(!valid);

    int sum=num1+num2;
    System.out.println("sum="+sum);
    }
}*/

                                                               //12.3

/*import java.util.Random;
import java.util.Scanner;
public class ExceptionHandling
{
    public static void main(String[] args)
    {
              Scanner sc=new Scanner(System.in);
              int num;
            int []arry=createarray(100);
            try
            {
                System.out.println("enter an index range 0 to 99");
                num=sc.nextInt();
                int element=arry[num];
                System.out.println("element at index "+num+"is "+element);
               
            }
            catch(ArrayIndexOutOfBoundsException  obj)
            {
                System.out.println("enter valid range");
            }
    }
    public static int[] createarray(int size)
    {
        int [] a=new int[size];
        Random rd=new Random();
        for(int i=0;i<size;i++)
        {
            a[i]=rd.nextInt(1000);
        }
        return a;
    }
}*/
 



                                                  //12.4
/*import java.util.*;

public class ExceptionHandling 

{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public ExceptionHandling()
    {
             annualInterestRate=9.1;
             numberOfYears=7;
             loanAmount=10000;




    }
    
    

    
    public ExceptionHandling(double annualInterestRate, int numberOfYears, double loanAmount)
     {
        if (annualInterestRate <= 0 || numberOfYears <= 0 || loanAmount <= 0)
         {
            throw new IllegalArgumentException("Interest rate, number of years, and loan amount must be greater than zero.");
        }

        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    
    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }

    
    public void setAnnualInterestRate(double annualInterestRate)
     {
        if (annualInterestRate <= 0) 
        {
            throw new IllegalArgumentException("Interest rate must be greater than zero.");
        }
        this.annualInterestRate = annualInterestRate;
    }

    
    public int getNumberOfYears()
     {
        return numberOfYears;
    }

    
    public void setNumberOfYears(int numberOfYears)
     {
        if (numberOfYears <= 0)
         {
            throw new IllegalArgumentException("Number of years must be greater than zero.");
        }
        this.numberOfYears = numberOfYears;
    }


    public double getLoanAmount() 
    {
        return loanAmount;
    }

    
    public void setLoanAmount(double loanAmount)
     {
        if (loanAmount <= 0)
         {
            throw new IllegalArgumentException("Loan amount must be greater than zero.");
        }
        this.loanAmount = loanAmount;
    }


    public double getMonthlyPayment()
     {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment()
     {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    
    public java.util.Date getLoanDate()
     {
        return loanDate;
    }



      public void setLoanDate(java.util.Date loanDate)
    {
    this.loanDate = loanDate;
    }


public String toString()
 {
    return "Loan{" +
            "annualInterestRate=" + annualInterestRate +
            ", numberOfYears=" + numberOfYears +
            ", loanAmount=" + loanAmount +
            ", loanDate=" + loanDate +
            '}';
}




public static void main(String[] args) 
{
    // Example usage of the Loan class
    try 
    {
        ExceptionHandling loan1 = new ExceptionHandling(-2.0, 5, 5000);
        System.out.println(loan1.toString());
    }
     catch (IllegalArgumentException e)
      {
        System.out.println("Error: " + e.getMessage());
    }
}
}
*/


                                                   //12.5
/*class IllegalTriangleException extends Exception
 {
    public IllegalTriangleException(String message) 
    {
        super(message);
    }
}                             
 class Triangle 
{
    private double side1;
    private double side2;
    private double side3;

    public Triangle() throws IllegalTriangleException
     {
        this(1.0, 1.0, 1.0);
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException
     {
        if (isValidTriangle(side1, side2, side3)) 
        {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } 
        else 
        {
            throw new IllegalTriangleException("Invalid triangle sides: " + side1 + ", " + side2 + ", " + side3);
        }
    }

    public double getSide1()
     {
        return side1;
    }

    public double getSide2() 
    {
        return side2;
    }

    public double getSide3()
     {
        return side3;
    }

    public double getArea()
     {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() 
    {
        return side1 + side2 + side3;
    }

    
    public String toString()
     {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

    private boolean isValidTriangle(double side1, double side2, double side3)
     {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}


public class ExceptionHandling
{
    public static void main(String[] args) 
    {
        try
         {
            
            Triangle t= new Triangle(3.0, 4.0, 5.0);

            
            System.out.println(t);
            System.out.println("Area: " + t.getArea());
            System.out.println("Perimeter: " + t.getPerimeter());

            
            Triangle invalidTriangle = new Triangle(1.0, 1.0, 3.0); // This should throw an exception

        } 
        catch (IllegalTriangleException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}*/


                                           //12.6

/*import java.util.Scanner;

public class ExceptionHandling
 {
    
    public static void main(String[] args)
     {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a hex number: ");
        String hex = sc.nextLine();

        try
         {
            System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
        } 
        catch (NumberFormatException e)
         {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int hexToDecimal(String hex)
     {
        int decimalValue = 0;

        // Check if the input string is empty or null
        if (hex == null || hex.isEmpty())
         {
            throw new NumberFormatException("Input string is empty or null");
        }

        // Iterate through the characters of the hex string
        for (int i = 0; i < hex.length(); i++)
         {
            char hexChar = hex.charAt(i);

            // Check if the character is a valid hexadecimal digit (0-9, A-F, a-f)
            if (Character.isDigit(hexChar)) 
            {
                decimalValue = decimalValue * 16 + (hexChar - '0');
            }
             else if ((hexChar >= 'A' && hexChar <= 'F') || (hexChar >= 'a' && hexChar <= 'f')) 
             {
                decimalValue = decimalValue * 16 + (Character.toUpperCase(hexChar) - 'A' + 10);
            } else
             {
                // If the character is not a valid hex digit, throw NumberFormatException
                throw new NumberFormatException("Invalid hex digit: " + hexChar);
            }
        }

        return decimalValue;
    }
}*/




                                          //lucky assesment



/*abstract class Vehicle
{
    abstract void start();
    abstract void accelerate();
    abstract void decelerate();
    abstract void stop();
}

class Car extends Vehicle 
{
    void start()
    {
        System.out.println("start car");
    }
    void accelerate()
    {
        System.out.println("accelerate car");
    }
    void decelerate()
    {
        System.out.println("decelerate car");
    }
    void stop()
    {
        System.out.println("stop car");
    }
}

class Aeroplane extends Vehicle
{
     void start()
    {
        System.out.println("start aeroplane");
    }
    void accelerate()
    {
        System.out.println("accelerate aeroplane");
    }
    void decelerate()
    {
        System.out.println("decelerate aeroplane");
    }
    void stop()
    {
        System.out.println("stop aeroplane");
    }
}

class Upcaster
{
    public Object upcast(Vehicle v)
    {
          return v;
    }
}

public class ExceptionHandling
{
   public static void main(String[] args)
   {
     Car c = new Car();
     Aeroplane a = new Aeroplane();
     Upcaster up = new Upcaster();
     Object upcasterCar = up.upcast(c);
     Object upcasterAeroplane = up.upcast(a);
     System.out.println(upcasterCar.getClass());
     System.out.println(upcasterAeroplane.getClass());


     // Car Class
     c.start();
     c.accelerate();
     c.decelerate();
     c.stop();

     // Aeroplane class
     a.start();
     a.accelerate();
     a.decelerate();
     a.stop();
    



   }
}*/



