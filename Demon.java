import java.io.*;
import java.util.Arrays;

class Demon {
	public static void main(String s[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			int num=Integer.parseInt(br.readLine());
			int n=Integer.parseInt(br.readLine());
			String[] str=br.readLine().split(" ");
			int[] val=new int[n];
			for(int j=0;j<n;j++)
				val[j]=Integer.parseInt(str[j]);
			Arrays.sort(val);
			boolean[][] check=new boolean[n+1][num+1];
			for(int j=0;j<=n;j++)
				check[j][0]=true;
			for(int j=1;j<=n;j++) {
				check[j][0]=false;
				for(int k=1;k<=num;k++) {
					check[j][k]=check[j-1][k];
					if(val[j-1]<=k)
						check[j][k]=check[j][k] || check[j-1][k-val[j-1]] || check[j][k-val[j-1]];
				}
			}
			if(check[n][num]) {
			int[][] mem=new int[n][num+1];
			for(int j=0;j<=num;j++) {
				if(val[0]<=j)
					mem[0][j]=1+mem[0][j-val[0]];
			}				
			for(int j=1;j<n;j++) {
				for(int k=1;k<=num;k++) {
					if(k>=val[j])
						mem[j][k]=mem[j-1][k]<(1+mem[j][k-val[j]])?mem[j-1][k]:(1+mem[j][k-val[j]]);
					else
						mem[j][k]=mem[j-1][k];
				}
			}
			for(int j=0;j<n;j++) {
				for(int k=0;k<=num;k++)
					System.out.print(mem[j][k]);
				System.out.println();
			}
			System.out.println(mem[n-1][num]);
		}
			else
				System.out.println("No Solution");
		}
	}
}