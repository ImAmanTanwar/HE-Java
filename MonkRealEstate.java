import java.util.Scanner;

class MonkRealEstate {
	public static void main(String s[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int count=0;
			boolean[] arr=new boolean[10001];
			int n=sc.nextInt();
			while(n-->0) {
				arr[sc.nextInt()]=true;
				arr[sc.nextInt()]=true;
			}
			for(int i=1;i<=10000;i++)
				if(arr[i]=true)
					count++;
			System.out.println(count);
		}
	}
}
