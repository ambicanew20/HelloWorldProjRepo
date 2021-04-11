
public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello World New!");
		
		char var1 = '\u00A7';
		System.out.println(var1);
		char var2 = '\u2300';
		System.out.println(var2);
		
		 	//int number1= 10.128;
		    float number2 = 10.128952248f;
		    double number3 = 10.128952248d;
		 
		    //System.out.println(number1);
		    System.out.println(number2);
		    System.out.println(number3);
		    
		    for (int i=10; i<=100; i+=10){
		    	//System.out.println(i);
		    }
		    
		    int x = 3;
		    switch(x){
		    default:
		       	System.out.println("value is not 1 to 3");
		       	break;
		    case 1:
		    	System.out.println("value is 1");
		    	break;
		    case 2:
		    	System.out.println("value is 2");
		    	break;		    
		    case 3:
		    	System.out.println("value is 3");
		    	break;
		    }
		    
		    
		    int a = 3;
		    
		    a=a++;
		    System.out.println(a);
		    a=++a;
		    System.out.println(a);
		    a=a--;
		    System.out.println(a);
		    a=--a;
		    System.out.println(a);
		    
		    int input = 43211234;
		    int sum = 0, remainder;
		    
		    while(input > 10){
		    	remainder = input % 10;
		    	sum += remainder;
		    	input /= 10;		    	
		    }
		    sum += input;
		    System.out.println(sum);
		    
		  System.out.println("area is:" + area(6));
		  
		  

	}
	
	public static double area(double length, double width){
		return length*width;
	}
	
	public static double area(float length, double width){
		return length*width;
	}
	
	public static double area(double length, float width){
		return length*width;
	}
	
	public static double area(double side){
		return side*side;
	}
	
	public static float area(int side){
		return side*side;
	}
	
	public static int area(float side){
		System.out.println("********************");
		return (int)(side*side);
	}
}
