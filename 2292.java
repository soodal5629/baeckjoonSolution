import java.util.*;
public class Main{
    public static void main(String args[]){
   	 // 계차수열 이용
	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int a = 0;
		int temp=1;
		int count =0;
		while(true) {
			if(temp>=n) break;
			else {
				a+=6;
				temp+=a;
				count++;
			}
		}
		System.out.println(count+1);
        sc.close();
    }
}
