
public class �쳣 {
	public static void  main (String[]args)
	{	
		
		try{//�п����յ��쳣 ���յ��쳣��Ҫ�������� ������try catch���ա�
			FeiQ(null);
		
		}catch(NoipException e){
			e.printStackTrace();//��ӡ�쳣��Ϣ��
			System.out.println("������߲��ϰ�����");
		}
	}
	public static void FeiQ(String ip) throws NoipException{
		if(ip==null){
			throw new NoipException("û�����ߡ�");
		}		
		System.out.print("������ʾ�����б�");
	}
}
//�Զ����쳣 ���̳�exception�ࡣ
class NoipException extends Exception{
	public NoipException(String message){
		super(message);
	}
}