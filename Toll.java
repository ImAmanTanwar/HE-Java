import java.io.*;

class Toll {
	public static void main(String s[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			int n=Integer.parseInt(br.readLine());
			int[] toll_A=new int[n];
			int[] toll_B=new int[n];
			int[] trans_AB=new int[n-1];
			int[] trans_BA=new int[n-1];
			String[] str1=br.readLine().split(" ");
			String[] str2=br.readLine().split(" ");
			for(int j=0;j<n;j++) {
				toll_A[j]=Integer.parseInt(str1[j]);
				toll_B[j]=Integer.parseInt(str2[j]);
			}
			str1=br.readLine().split(" ");
			str2=br.readLine().split(" ");
			for(int j=0;j<n-1;j++) {
				trans_AB[j]=Integer.parseInt(str1[j]);
				trans_BA[j]=Integer.parseInt(str2[j]);
			}
			for(int j=1;j<n;j++) {
				toll_A[j]=Math.min(toll_A[j-1]+toll_A[j], toll_B[j-1]+trans_BA[j-1]+toll_A[j]);
				toll_B[j]=Math.min(toll_B[j-1]+toll_B[j], toll_A[j-1]+trans_AB[j-1]+toll_B[j]);
			}
			System.out.println(Math.min(toll_A[n-1], toll_B[n-1]));
		}
	}
}
