class a
{
void area(int i,int b)
{
System.out.println("area rectangle is="+i*b);
}
void area (int i)
{
System.out.println("area of square="+i*i);
}
}

class overld
{
public static void main(String s[])
{

a l=new a();
l.area(2,4);
l.area(6);
}
}

