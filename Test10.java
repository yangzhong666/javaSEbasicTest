import java.util.*;
public class Test10{
	public static void main(String[] args){
		//����1000���ڵ���ȫ����
		List<Integer> perfectList=new ArrayList<Integer>();//��¼�Ѿ������ϵ�������
		for(int i=1;i<=1000;i++){
			//1�Ե�ǰ�����ҵ����в��������������
			List<Integer> list=new ArrayList<Integer>();//��¼��ǰ��i�����Ķ�̬���顣
			for(int j=1;j<i/2+1;j++){  //��Ϊ���������ܳ�����ǰ����һ�룬������i/2+1���ټ���������1��Ϊ�˽����ǰ��1�����������1/2=0.5��Ҫ��һ���int 1.  18   18/2=9�����������������������9��
				//�ҳ���ǰ��i���в��������������
				if(i%j==0){
					//������  ��¼��ǰ��  �������������ж�
					list.add(j);
				}
			}
			//2�жϵ�ǰ���Ƿ�Ϊ����
			int sumx=0;//���嵱ǰ������
			for(int x:list){
				sumx=sumx+x;
			}
			if(sumx==i){
				//3������������������ǰ�����뵽������̬���顣
				perfectList.add(i);
			}
		}
		     //4�������������
		System.out.print("1000���ڵ������У�");
		for(int w:perfectList){
				System.out.print(w+" ");
			}
		
	}
}
