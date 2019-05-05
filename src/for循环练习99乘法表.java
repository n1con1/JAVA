
public class for循环练习99乘法表 {
  public static void main (String[]args )
  {
	  /*
	     九九乘法表。
	     
	   */
	  for (int i=1;i<10;i++)
	  {
		  for(int j=1;j<=i;j++)
		  {   
			  int sum =i*j;
			  System.out.print(i+"*"+j+"="+sum+"\t");
		  }
		  System.out.println();
	  }
	 
  }
}
