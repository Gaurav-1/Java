import package1.PPrint;

//change p.printt to System.out.println and remove import file

class Exce{
	public static void main(String arg[]){
		
		int a[]={10,20,30};
		int total=0;
		PPrint p=new PPrint();
		
		for(int i=0;i<2;i++){
			try{
				int result;
				if(i==0)
					total=a[0]+a[1]+a[2]+a[3];
				if(i==1)
					result=30/0;
			}
			
			catch(ArithmeticException e){
				p.printt("\nArithmetic Exception");
				System.out.println(e);
			}
			
			catch(ArrayIndexOutOfBoundsException e){
				p.printt("\nTrying to use invalid index");
				System.out.println(e);
			}
			
			finally{
				p.printt("Finally Block");
			}
		}
		p.printt("Last Statement");
}
}
