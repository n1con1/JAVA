
public class For循环练习 {
    public static void  main (String []args)
    {
    	/*打印  ***** 利用for 循环。
    	      *****
    	      *****
    	      *****
    	      *****
    	 */
    	
    	for (int i=0;i<5;i++)//控制行数。
    	{
    		for (int j=0;j<5;j++)//控制列数。
    		{
    			System.out.print("*");//print不换行。
    		}
    		System.out.println();//输出空  换行。
    	}
    }
}
