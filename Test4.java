import java.util.*;
public class Test4
{
    public static void main (String[] args){
	double price = 5;
	double totalPrice = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.print("������Ҫ��������ϵ�����:");
	int count = scanner.nextInt();
	if(count == 1){
	    totalPrice = price * count;
		System.out.print("����Ҫ֧��:"+totalPrice);
	}else if(count == 2){
        totalPrice = price + (count - 1)*price/2;
        System.out.print("����Ҫ֧��:"+totalPrice);
    }else{
        System.out.print("��������");
		
		
	}	
	
	}
}
