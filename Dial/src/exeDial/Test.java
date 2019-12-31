package exeDial;

public class Test {

	public static void main(String[] args) throws Exception{
		
		
		
		Runtime.getRuntime().exec("cd C:/Program Files (x86)/Streams/");
		System.out.println("Application Started.....");
		Runtime.getRuntime().exec("Start Streams.exe -dial=9997");
				
				
	}

}
