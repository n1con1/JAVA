import java.util.*;
public class switch1 {
   public static void main(String[]args)
   {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("����һ���·ݣ�");
	   int MonthNum=sc.nextInt();
	   
	   switch(MonthNum)
	   {
	    case 2:
	    case 3:
	    case 4:
	    	System.out.println("���죡");
	    	break;
	    case 5:
	    case 6:
	    case 7:
	    	System.out.println("���죡");
	    	break;
	    case 8:
	    case 9:
	    case 10:
	    	System.out.println("���죡");
	    	break;
	    case 11:
	    case 12:
	    case 1:
	    	System.out.println("���죡");
	    	break;
	    default:
	        System.out.println("������������");
	   }
	    
	   
   }
}
