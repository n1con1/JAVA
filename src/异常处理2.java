
public class �쳣����2 {
	public static void main (String []args){
		try{//���ú���  �������쳣��
			dinner(3);
		}catch(NoMoneyException N){
			N.printStackTrace();
			System.out.println("��Ǯ��  ������");
		}
	}
	public static void dinner(int money) throws NoMoneyException{
		if(money>=10){
			System.out.println("����һ��");
		}
		else{
			throw new NoMoneyException("ûǮ�Ը����ӳԡ�");
		}
			
	}
}
class NoMoneyException extends Exception{//�Զ���һ���쳣��
	public NoMoneyException(String message){
		super(message);//message �Ǳ���������͡�
	}
}