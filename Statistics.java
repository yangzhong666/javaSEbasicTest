public class Practice3{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123456789012";
		char[] chs = s.toCharArray();
		int oddsum=0,evensum=0;
		for (int i = 0; i < chs.length; i++) {
			if(chs[i] % 2 != 0) {
				oddsum+=chs[i]-'0';
			}
			if(chs[i] %2 == 0) {
				evensum+=chs[i]-'0';
			}
		}
		System.out.println("�����������֮�ͣ�"+oddsum);
		System.out.println("ż���������֮�ͣ�"+evensum);
	}
 
}
