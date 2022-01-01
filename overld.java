class rect
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
	rect obj=new rect();
	obj.area(2,4);
	obj.area(6);
}
}

