import java.util.*;

public class Test5
{
    public static void main (String[] args){
	System.out.print("请输入您的税前工资:");
	Scanner scanner = new Scanner (System.in);
	double salary = scanner.nextDouble();
	double minStandrad = 5000;
	double finalSalary = salary  - 5000;
	double oneMoney = 1000;
	double subSidy = 500;
	double realSalary = 0;
	
	
	
	if(finalSalary<=1500){
	    realSalary = finalSalary*0.97 + minStandrad - oneMoney + subSidy;
	    }else if(finalSalary > 1500 && finalSalary <=4500){
		    realSalary = finalSalary*0.90 + minStandrad - oneMoney + subSidy;
		}else if (finalSalary > 4500 && finalSalary <=9000){
		    realSalary = finalSalary*0.80 + minStandrad - oneMoney + subSidy;
        }else if (finalSalary > 9000 && finalSalary <=35000){
		    realSalary = finalSalary*0.75 + minStandrad - oneMoney + subSidy;
	    }else if (finalSalary > 35000 && finalSalary <=55000){
		    realSalary = finalSalary*0.75 + minStandrad - oneMoney + subSidy;
        }else{
		    realSalary = minStandrad - oneMoney + subSidy;
			
	    }
	    System.out.print("您到手工资:"+realSalary);
	
	
	}
}