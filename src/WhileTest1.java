
public class WhileTest1 {
    public static void main (String []args)
    {
    	//����1-100��7�ı��������ĺ͡�
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
    	System.out.println("1��100�ڣ�7�����ĺ�Ϊ��"+Sum);
    }
}
