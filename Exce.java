import package1.PPrint;

class Exce{
	public static void main(String arg[]){
		int a[]={10,20,30};
		int total=0,flag=0;
		PPrint p=new PPrint();
		for(int i=0;i<2;i++){
			try{
				int result;
				if(flag==0)
					total=a[0]+a[1]+a[2]+a[3];
				if(flag==1)
					result=30/0;
			}
			
			catch(ArithmeticException e){
				p.printt("\nArithmetic Exception");
				System.out.println(e);
				flag++;
			}
			
			catch(ArrayIndexOutOfBoundsException e){
				p.printt("\nTrying to use invalid index");
				System.out.println(e);
				flag++;
			}
			
			finally{
				p.printt("Finally Block");
			}
		}
		p.printt("Last Statement");
}
}
