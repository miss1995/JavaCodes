package StringDemo;

public class StringBufferDemo {
	String st;
	String[] arr;
	String str= "what's the matter son? you Notebooks are still uncoverd";
	public void acc()
	{
		//StringBuffer sb=new StringBuffer("hello ");
		//sb.append("how are you ?");
		//System.out.println(sb);
		
		//StringBuffer sb=new StringBuffer("MOM ");
		//sb.reverse();
		//System.out.println("Palidrome number is" +sb);
		
		//st="happy new year";
	
		//System.out.println(st.toUpperCase());
		
		String sb=new String("what's the matter son? you Notebooks are still uncoverd");
		arr=sb.split(" ");
		System.out.println(arr[5]);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBufferDemo oo=new StringBufferDemo();
        oo.acc();
	}

}


