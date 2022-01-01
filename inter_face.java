import package1.PPrint;

//change p.printt to System.out.println and remove import file

interface area{
	void rect(int l,int b);
	void circle(int r);
}

class cal implements area{
	PPrint p= new PPrint();
	public void rect(int l,int b){
		p.printt("WE are performing inteface here");
		p.printt("area of rectangle = "+(l*b));
	}
	public void circle(int r){
		double a=3.14*r*r;
		p.printt("area of circle = "+a);
	}
}

class inter_face{
	public static void main(String arg[]){
		cal c=new cal();
		c.rect(6,7);
		c.circle(5);
	}
}
