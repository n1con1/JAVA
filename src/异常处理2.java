
public class 异常处理2 {
	public static void main (String []args){
		try{//调用函数  ，接收异常。
			dinner(3);
		}catch(NoMoneyException N){
			N.printStackTrace();
			System.out.println("带钱啊  憨憨。");
		}
	}
	public static void dinner(int money) throws NoMoneyException{
		if(money>=10){
			System.out.println("饱餐一顿");
		}
		else{
			throw new NoMoneyException("没钱吃个锤子吃。");
		}
			
	}
}
class NoMoneyException extends Exception{//自定义一个异常。
	public NoMoneyException(String message){
		super(message);//message 是报告错误类型。
	}
}