


                                  //9.1


/*class Rectangle
{
    double width;
    double height;
    Rectangle()
    {
        width=0.0;
        height=0.0;

    }
    Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    double getArea()
    {
        return width*height;
    }
     double getPeri()
    {
        return 2*(height*width);
    }
  public   String toString()
    {
        return " width = "+width+" \n height = "+height+"\n Area = "+getArea()+" \nperimeter ="+getPeri();
    }
}

public class ex9 
{
    public static void main(String [] args)
    {
        Rectangle r=new Rectangle(5.0,2.0);
        Rectangle r1=new Rectangle();
        System.out.print(r);
    }
}*/
            


                         //9.2
 /*class Stock
 {
    String symbol;
    String name;
    double prev_price;
    double curr_price;
    Stock()
    {
        symbol="#$%";
        name="sushma";
        prev_price=1000.0;
        curr_price=7000.0;
    }
    Stock(String symbol,String name,double prev_price,double curr_price)
    {
        this.symbol=symbol;
        this.name=name;
        this.prev_price=prev_price;
        this.curr_price=curr_price;
    }
    double Change()
    {
         return (prev_price>curr_price)? (prev_price-curr_price)/100.0 : (curr_price-prev_price)/100.0;

    }
   public  String toString()
    {
        return " symbol="+symbol+"\n name="+name+" \n previosu ="+prev_price+" \n current = "+curr_price+ "\n change = "+Change();
    }
 }                        
 public class ex9
 {
    public static void main(String [] args)
    {
        Stock s=new Stock("*&^","lucky",34.5,35.35);
        System.out.println(s);
    }
 }*/




                                       //9.4




/*import java.util.Random;
public class ex9
{
    public static void main(String[] args)
    {
        Random rd=new Random(1000);
        for(int i=0;i<50;i++)
        {
            int min=1000,max=5000;
            int a=rd.nextInt(max-min)+min;
            System.out.println(a);
        }
    }
}*/


   /*      ********IMP***********                         //9.7
                    
/*class Account
{
    private int id;
    private double bal;
    private double intrest;
    Account()
    {
        id=1234;
        bal=100.0;
        intrest=0;
    }
    Account(int id,double bal,double intrest)
    {
        this.id=id;
        this.bal=bal;
        this.intrest=intrest;
    }
    int getId()
    {
        return id;
    }
    double getBal()
    {
        return bal;
    }
    double getInt()
    {
        return intrest;
    }
    double withdraw(double w)
    {
        bal-=w;
        return bal;
    }
    double deposit(double d)
    {
        bal+=d;
        return bal;
    }
  public  String toString()
    {
        return " id = "+getId()+"\n balence="+getBal()+" deposit 500="+deposit(500);
    }
}
public class ex9
{
    public static void main(String[] args)
    {
        Account a=new Account(9876,1000.0,7);
        System.out.println(a);;
    }
}*/

                                                   //9.8

/*class Fan
{
    
    private int speed;
    private boolean on;
    private double radius;
    private String colour;
    Fan()
    {
        speed=1;
        on=false;
        radius=5.0;
        colour="blue";
    }
    Fan(int speed,boolean on,double radius,String colour)
    {
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.colour=colour;
    }
    int getSpeed()
    {
        return speed;
    }
    boolean getOn()
    {
        return on;
    }
    double getRadius()
    {
        return radius;
    }
    String getColour()
    {
        return colour;
    }

  public  String toString()
    {
        return " speed="+getSpeed()+"\n on = "+getOn()+" \n radius="+getRadius();
    }


}
public class ex9
{
    public static void main(String [] args)
    {
        Fan f=new Fan(3,true,4.0,"black");
        System.out.print(f);
    }
}*/



                                       //9.9

/*class RegularPolygon
{
    private int n;
    private double side;
    private double x;
    private double y;
    RegularPolygon()
    {
        n=3;
        side=1;
        x=0;
        y=0;
    }
    RegularPolygon(int n,double side,double x,double y)
    {
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    RegularPolygon(int n,double side)
    {
        this.n=n;
        this.side=side;
    }
    int getN()
    {
        return n;
    }
    double getSide()
    {
        return side;
    }
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }
    double getArea()                  || *************** ||
    {         
        double b=Math.PI;
        double c=side*2;
        double a=(n*(c)/(4*(Math.tan(b/n))));
        
        return a;
    }
    double getPeri()
    {
        return n*side;
    }
   public  String toString()
    {
        return " area ="+getArea()+"\n perimeter="+getPeri();
    }
}

public class ex9
{
    public static void main(String [] args)
    {
        RegularPolygon p=new RegularPolygon(10, 4.5, 6, 8);
        System.out.println(p);
        RegularPolygon q=new RegularPolygon(6,4);
        System.out.println(q);
    }
}*/




                                          //9.10

/*class Quadratic
{
    private int a;
    private int b;
    private int c;
    Quadratic()
    {
        a=1;
        b=1;
        c=1;
    }
    Quadratic(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double getDiscriminant()
    {
        return (b*b)-(4*a*c);
    }
    double getRoot1()
    {
        return (-b+(Math.sqrt(getDiscriminant())))/(2*a);
    }
    double getRoot2()
    {
        return (-b-(Math.sqrt(getDiscriminant())))/(2*a);
    }
    int getA()
    {
        return a;
    }
    int getB()
    {
        return b;
    }
    int getC()
    {
        return c;
    }
    public String toString()
    {
        return "a="+getA()+"\nb="+getB()+"\nc="+getC()+"\nDiscriminant"+getDiscriminant()+"\n Root 1="+getRoot1()+"\n Root 2="+getRoot2();
    }

    
}
public class ex9
    {
        public static void main(String[] args)
        {
            Quadratic q=new Quadratic(1,4,4);
            System.out.println(q);
        }
    }*/



    
