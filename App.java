class MyString1
{
   private  String s;
    MyString1()
    {
        s="  ";
    }
    MyString1(String s)
    {
        this.s=s;
    }
    public String getString()
    {
        return s;
    }
    public void setString(String s)
    {
        this.s=s;
    }
    public int compare(String s1)
    {
             return (getString().compareTo(s1));
    }
    public  String substring()
    {
        return getString().substring(6);
    }
    public String uppercase()
    {
        return getString().toUpperCase();
    }
    public String toString()
    {
        return s;
    }
   
}
public class App
{
    public static void main(String [] args)
    {
        MyString1 a=new MyString1(" welcome to java");
        System.out.print(a);

    }
}
