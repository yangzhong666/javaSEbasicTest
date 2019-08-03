import java.util.*;
public class Test4
{
    public static void main (String[] args){
	double price = 5;
	double totalPrice = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.print("请输入要购买的饮料的数量:");
	int count = scanner.nextInt();
	if(count == 1){
	    totalPrice = price * count;
		System.out.print("您需要支付:"+totalPrice);
	}else if(count == 2){
        totalPrice = price + (count - 1)*price/2;
        System.out.print("你需要支付:"+totalPrice);
    }else{
        System.out.print("输入有误");
		
		
	}	
	
	}
}
