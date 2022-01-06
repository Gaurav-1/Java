import package1.PPrint;

//change p.printt to System.out.println and remove import file

class UDE extends Exception{

}

class UserExce{
	public static void main(String arg[]){
		
		int age=15;
		PPrint p=new PPrint();
		
			try{
				if(age<18)
					throw new UDE();
			}
			
			catch(UDE e){
				p.printt("You Are Underage");
				System.out.println(e);
			}
			
			finally{
				p.printt("Finally Block");
			}
		p.printt("Last Statement");
}
}
