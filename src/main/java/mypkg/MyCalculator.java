package mypkg;

public class MyCalculator {
	
	public int sum(int a, int b)
	{
	return a+b;
	}
	
	public int sub(int a, int b)
	{
		return a-b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}
	
	public void display()
	{
	System.out.println("display functions1");
	}
	
	public void display2()
	{
	System.out.println("display functions2");
	}
	
	
	public static void main(String[] args) {
		
	 MyCalculator ob = new MyCalculator(); 
	 
	 System.out.println("Sum is :"+ob.sum(20, 10)); 
	 System.out.println("Sub is :"+ob.sub(20, 10));
	 System.out.println("Mul is :"+ob.mul(20, 10));
	 System.out.println("Div is :"+ob.div(20, 10));
	
	}

}
