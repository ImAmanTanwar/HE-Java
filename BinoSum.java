import java.io.*;

class BinoSum {
	public static void main(String s[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		long[][] mem=new long[1001][1001];
		for(int j=0;j<=1000;j++)
			mem[j][0]=1;
		for(int j=1;j<=1000;j++) 
			for(int k=1;k<=1000;k++) 
				if(j>=k)
					mem[j][k]=(mem[j-1][k-1]+mem[j-1][k])%1000000007;
		for(int i=0;i<t;i++) {
			String[] str=br.readLine().split(" ");
			int N=Integer.parseInt(str[0]);
			int P=Integer.parseInt(str[1]);
			long sum=0;
			for(int j=0;j<=P;j++)
				sum+=mem[N][j];
			System.out.println(sum%1000000007);
		}
	}
}
