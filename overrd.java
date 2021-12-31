class a
{
void area(int i,int b)
{
System.out.println("area rectangle is="+i*b);
System.out.println("class a1");

}
void area (int i)
{
System.out.println("area of square="+i*i);
System.out.println("class a2");
}
}
class c extends a{
void area (int i,int b)
{
System.out.println("area of rectangle="+i*b);
System.out.println("class b");

}
}



class overrd
{
public static void main(String s[])
{
c l=new c();

l.area(2,4);
l.area(6);
}
}

