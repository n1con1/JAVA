import java.util.*;
public class switch1 {
   public static void main(String[]args)
   {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("输入一个月份：");
	   int MonthNum=sc.nextInt();
	   
	   switch(MonthNum)
	   {
	    case 2:
	    case 3:
	    case 4:
	    	System.out.println("春天！");
	    	break;
	    case 5:
	    case 6:
	    case 7:
	    	System.out.println("夏天！");
	    	break;
	    case 8:
	    case 9:
	    case 10:
	    	System.out.println("秋天！");
	    	break;
	    case 11:
	    case 12:
	    case 1:
	    	System.out.println("冬天！");
	    	break;
	    default:
	        System.out.println("您的输入有误");
	   }
	    
	   
   }
}
