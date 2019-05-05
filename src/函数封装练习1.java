
public class 函数封装练习1
{
   public static void main (String[]args)
   {
	  System.out.println("hello world");
	/* int max=getMax(6,6);
	  System.out.println("最大值是"+max);
	  */
	   System.out.println(level(76));
	   chengfa(9);
	  
   }
 
   public static int getMax(int a,int b)
   {
	   if (a>b)
	   {
		   return a;
	   }
	   else if(a<b)
	   {
		   return b;
	   }
	   else
	   {
		   return -8;
	   }
	   
   }
   public static String level(int a)
   {
	   if(a>90&a<=100)
	   {
		   return "A";
	   }
	   if(a>80&a<=90)
	   {
		   return "B";
	   }
	   if(a>70&a<=80)
	   {
		   return "C";
	   }
	   if(a>60&a<=70)
	   {
		   return "D";
	   }
	return null;
   }
    public static void chengfa(int a)
    {
    	for(int i=1;i<=a;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print(i+"*"+j+"="+i*j+"\t");
    		}
    		System.out.println( );
    			
    	}
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
