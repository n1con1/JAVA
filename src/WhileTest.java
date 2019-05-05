import java.util.Random;
import java.util.Scanner;

public class WhileTest {
  public static void main(String[]args)
  {
	  //随机数生成。
	  /*
	   使用方法和键入信息相似。
	   1，创建一个随机数对象。
	   2，调用一个随机数对象的nextInt方法。
	   3，导包。
	   */
	  Random random= new Random();
	  int Num = random.nextInt(11);//随机生成的值。
	  //创建一个扫描器。
	  Scanner sc= new Scanner(System.in);
	  boolean flag= true;
	  while(flag)
	  {
	  System.out.println("你猜测的数是");
	  int Gause = sc.nextInt();//猜测的值。
	  if (Gause>Num)
	  {
		  System.out.println("猜大了。");
	  }
	  else if(Gause<Num)
	  {
		  System.out.println("猜小了。");
	  }
	  else 
	  {
		  System.out.println("恭喜你，猜对了。");
		  flag= false; 
	  }
	 
	  }
	  
	 
	  
	
  }
  
}
