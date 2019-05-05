
public class for循环练习2 {
  public static  void main (String []args)
  {
	  /*
	     利用for循环打印
	     *
	     **
	     ***
	     ****
	     *****
	     
	   */
	  for (int i=0;i<5;i++)
	  {
		  for(int j=0;j<=i;j++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	  } 
  }
}
