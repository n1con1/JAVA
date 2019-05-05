import java.util.*;

public class main1 {
  public static void main (String []args)
  { 
	 Scanner sc = new Scanner(System.in); 
	 System.out.println("ÇëÊäÈë·ÖÊı£º"); 
     int Mark = sc.nextInt(); 
	 if (Mark>=90&Mark<=100)
		  	{
		  		System.out.println("A");
		  	}
	  	else if (Mark>=80&Mark<90)
		  	{
		  		System.out.println("B");
		  	}
	  	else if (Mark>=70&Mark<80)
		  	{
		  		System.out.println("C");
		  	}
	  	else if (Mark>=60&Mark<70)
		  	{
		  		System.out.println("D");
		  	}
	  	else if (Mark>=70&Mark<60)
		  	{
		  		System.out.println("E");
		  	}
  }
}
