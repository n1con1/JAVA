
public class WhileTest1 {
    public static void main (String []args)
    {
    	//就算1-100，7的倍数的数的和。
    	int Num=1;
    	int Sum=0;
    	while (Num<=100)
    	{   
    		if(Num%7==0)
    		{
    			Sum=Sum+Num;
    		}
    		
    		Num++;
    		
    	}
    	System.out.println("1到100内，7倍数的和为："+Sum);
    }
}
