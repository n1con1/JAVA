import java.util.Random;
import java.util.Scanner;

public class WhileTest {
  public static void main(String[]args)
  {
	  //��������ɡ�
	  /*
	   ʹ�÷����ͼ�����Ϣ���ơ�
	   1������һ�����������
	   2������һ������������nextInt������
	   3��������
	   */
	  Random random= new Random();
	  int Num = random.nextInt(11);//������ɵ�ֵ��
	  //����һ��ɨ������
	  Scanner sc= new Scanner(System.in);
	  boolean flag= true;
	  while(flag)
	  {
	  System.out.println("��²������");
	  int Gause = sc.nextInt();//�²��ֵ��
	  if (Gause>Num)
	  {
		  System.out.println("�´��ˡ�");
	  }
	  else if(Gause<Num)
	  {
		  System.out.println("��С�ˡ�");
	  }
	  else 
	  {
		  System.out.println("��ϲ�㣬�¶��ˡ�");
		  flag= false; 
	  }
	 
	  }
	  
	 
	  
	
  }
  
}
