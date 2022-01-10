class cal{
	public void rect(int l,int b){
		System.out.println("Finding rectangle using object");
		System.out.println("Area of rectangle = "+(l*b));
	}
}

class ObjRect{
	public static void main(String arg[]){
		cal c=new cal();
		c.rect(6,7);
	}
}