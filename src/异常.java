
public class 异常 {
	public static void  main (String[]args)
	{	
		
		try{//有可能收到异常 ，收到异常需要立即处理。 所以用try catch接收。
			FeiQ(null);
		
		}catch(NoipException e){
			e.printStackTrace();//打印异常信息。
			System.out.println("你把网线插上啊憨憨");
		}
	}
	public static void FeiQ(String ip) throws NoipException{
		if(ip==null){
			throw new NoipException("没插网线。");
		}		
		System.out.print("正常显示好友列表");
	}
}
//自定义异常 即继承exception类。
class NoipException extends Exception{
	public NoipException(String message){
		super(message);
	}
}