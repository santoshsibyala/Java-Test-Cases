package samplePackage;

public class Exception {
	Exception(){
		try{
	         int a[] = new int[2];
	         System.out.println("Access element three :" + a[3]);
	        
	      }catch(ArrayIndexOutOfBoundsException e){
	    	  e.printStackTrace();
	      }
		try{
			 String s=null;
	         s.replaceAll("", "space");
		}catch(NullPointerException e){
			e.printStackTrace();
	    }
		try{
			 int a=5;
	         System.out.println("Dive by Zero is "+a/0);
		}catch(ArithmeticException e){
			e.printStackTrace();
	    }
		try{
			 String s = "FOOBAR";
	         int i = Integer.parseInt(s);
	         System.out.println(i);
		}catch(NumberFormatException e){
			e.printStackTrace();
	    }
		String a=new String("One Two Three Four");
		String[] split=a.split(" ");
		System.out.println(split[0]);
		//String str=split.toString();
		
		
		//System.out.println(str);
	    System.out.println("Out of the block");
	   }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exception();

	}

}
