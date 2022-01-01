class rect{
	
void area(int i,int b)
{
	System.out.println("area rectangle is="+i*b);
	System.out.println("class rect");
}
void area (int i)
{
	System.out.println("area of square="+i*i);
	System.out.println("class rect");
}
}

class InRect extends rect{
void area (int i,int b)
{
	System.out.println("area of rectangle="+i*b);
	System.out.println("class InRect");
}
}

class overrd
{
public static void main(String s[])
{
	InRect obj=new InRect();
	obj.area(2,4);
	obj.area(6);
}
}

