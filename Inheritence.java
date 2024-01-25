                                                   //   INHERITENCE



/*class Student
{
     private String reg;
   private  String name;
   Student()
   {
    reg="22bce2292";
    name="sushma";
   }
   Student(String reg,String name)
   {
    this.reg=reg;
    this.name=name;
   }
   public String getReg()
   {
    return reg;
   }
  public  void setReg(String reg)
   {
    this.reg=reg;
   }
  public  String getName()
   {
    return name;
   }
   public void setName(String name)
   {
    this.name=name;
   }
   public String toString()
   {
    return " reg = "+getReg()+" name= "+getName();
   }
}
class ug extends Student
{
   private float marks;
    ug()
    {
        super();
        marks=50;
    }
    ug(String reg,String name,float marks)
    {
        super(reg,name);
        this.marks=marks;
    }
    public float getMarks()
    {
        return marks;
    }
    public void setMarks(float marks)
    {
        this.marks=marks;
    }
    public String toString()
    {
        return " name="+getName()+"\n  reg="+getReg()+"\nmarks="+getMarks();
    }
   


}
public class Inheritence
{
    public static void main(String [] args)
    {
        ug u1=new ug();
        System.out.println(u1);
        ug u2=new ug("223456","lucky",51);
        System.out.println(u2);

    }
}*/

                                     //MOODLE QUESTIONS

                                

                                        //QUESTION 1

/*class Shape
{
    String s;
    Shape()
    {
        s=" ";
    }
    Shape(String s)
    {
        this.s=s;
    }
    public void setShape(String a)
    {
        s=a;
    }
    public double getArea()
    {
        return 0.00;
    }
    public double getPeri()
    {
        return 0.00;
    }
  public  String toString()
    {
        return " shape : "+s;
    }
}
class Circle extends Shape
{
  private  double radius;
    Circle()
    {
        super();
        radius=2.0;
    }
    Circle(String s,double  radius)
    {
        super(s);
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double r)
    {
        radius=r;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public double getPeri()
    {
        
        return 2*Math.PI*radius;
    }
  public  String toString()
    {
        System.out.println(super.toString());
        return " radius="+ radius+"\nArea="+getArea()+"\nPerimeter="+getPeri();
    }
    
}
class Rectangle extends Shape
{
    private double width;
    private double height;
    Rectangle()
    {
        super();
        width=2.0;
        height=2.0;
    }
    Rectangle(String s,double width,double height)
    {
        super(s);
        this.width=width;
        this.height=height;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public void setWidth(double w)
    {
        width=w;
    }
    public void setHeight(double h)
    {
        height=h;
    }
    public double getArea()
    {
        return width*height;
    }
    public double getPeri()
    {
        return 2*(width+height);
    }
    public String toString()
    {
         System.out.println(super.toString());
        return "width="+width+"\nheight="+height+"\nArea="+getArea()+"\nPerimeter="+getPeri();
    }
}
class Triangle extends Shape
{
    private double s1,s2,s3;
    Triangle()
    {
        s1=1.0;
        s2=1.0;
        s3=1.0;
    }
    Triangle(String s,double s1,double s2,double s3)
    {
        super(s);
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public double getS1()
    {
        return s1;
    }
    public double getS2()
    {
        return s2;
    }
    public double geS3()
    {
        return s3;
    }
    public void setS1(double s1)
    {
        this.s1=s1;
    }
    public void setS2(double s2)
    {
        this.s2=s2;
    }
    public void setS3(double s3)
    {
        this.s3=s3;
    }
    public double getArea()
    {
        double s=(s1+s2+s3)/2.0;
        
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    public double getPeri()
    {
        return s1+s2+s3;
    }
    public String toString()
    {
         System.out.println(super.toString());
        return " s1="+s1+"\ns2="+s2+"\ns3="+s3+"\nArea="+getArea()+"\nPerimeter="+getPeri();
    }
}
 public class Inheritence
{
public static void main (String[] args)
    {
        Circle c=new Circle("circle",6.0);
        System.out.println(c);
        Rectangle r=new Rectangle("rectangle",4.0,5.0);
        System.out.println(r);
        Triangle t=new Triangle("triangle",2.0,3.0,4.0);
        System.out.println(t);
    }
}*/




/*class LibraryItem
{
    private String title;
    private int item_no;
    LibraryItem()
    {
        title="power star";
        item_no=1;
    }
    LibraryItem(String title,int item_no)
    {
        this.title=title;
        this.item_no=item_no;
    }
    public String getTitle()
    {
        return title;
    }
    public int getItemNo()
    {
        return item_no;
    }
    public void setTitle(String t)
    {
        title=t;
    }
    public void setItemNo(int n)
    {
        item_no=n;
    }
    public String toString()
    {
        return "title="+getTitle()+"\n"+"item number="+getItemNo();
    }
}
class Book extends LibraryItem
{
    private String author;
    Book()
    {
        super();
        author="saii";
    }
    Book(String t,int no,String author)
    {
        super(t,no);
        this.author=author;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setauthor(String a)
    {
        author=a;
    }
    public String toString()
    {
        System.out.println(super.toString());
        return "author="+getAuthor();
    }
    
}
class dvd extends LibraryItem
{
    private String director;
    private double duration;
    dvd()
    {
        super();
        director="lucky";
        duration=0.00;
    }
    dvd(String t,int no,String director,double duration )
    {
        super(t,no);
        this.director=director;
        this.duration=duration;
    }
    public String getDirector()
    {
        return director;
    }
    public double getDuration()
    {
        return duration;
    }
    public void setDirector(String d)
    
    {
        director=d;
    }
    public void setDuration(double d)
    {
        duration=d;
    }
    public String toString()
    {
        System.out.println(super.toString());
        return "director="+getDirector()+"\n"+"duration="+getDuration();
    }
    
}
class Magzine extends LibraryItem
{
    private int issue_no;
    Magzine()
    {
        super();
        issue_no=22;
    }
    Magzine(String t,int n,int issue_no  )
    {
        super(t,n);
        this.issue_no=issue_no;
    }
    public int getIssueNo()
    {
        return issue_no;
    }
    public void setIssueNo(int i)
    {
        issue_no=i;
    }
    public String toString()
    {
        System.out.println(super.toString());
        return "issue no="+issue_no;
    }
}
public class Prog
{
    public static void main(String [] args)
    {
        Magzine  m=new Magzine();
        System.out.print(m);
        Book b=new Book();
        System.out.println(b);
        dvd d=new dvd();
        System.out.println(d);
        Magzine m1=new Magzine("abc",22,2292);
        Book b1=new Book("def",33,"sushma");
        dvd d1=new dvd("ghi",44,"qwertyy",11.00);
        System.out.println(m1);
        System.out.println(b1);
        System.out.println(d1);
    }
}*/




