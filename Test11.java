public class Test11{
	public static void main(String[] args){
		float totalmeters=100;//��·�̡�
		float startHeight=100;//ÿһ���������ĸ߶�
		//�����ڵ�ʮ�����ʱ�Ѿ��߹���·�̡�����ʮ���Ѿ���ص��ǲ�û���ߵ�ʮ�ε�·�̣�
		for(int i=1;i<=9;i++){
			startHeight=startHeight/2;//����˴ε��𵥳̸߶�
			
			totalmeters+=startHeight*2;//���˴ε�����صĸ߶ȼӵ���·���С�
		}
		
		System.out.println("totalmeters:"+totalmeters);
		System.out.println("��ʮ�θ߶ȣ�"+startHeight*1/2);
	}
	
}
