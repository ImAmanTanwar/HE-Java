import java.io.*;

class XsquareCoin {
	public static void main(String s[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int[] p={2,3,5,7};
		int t=Integer.parseInt(br.readLine());
		int[][] mem=new int[5][1000001];
		for(int i=1;i<=1000000;i++)
			mem[0][i]=Integer.MAX_VALUE;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=1000000;j++) {
				if(j<p[i-1])
					mem[i][j]=mem[i-1][j];
				else
					mem[i][j]=Math.min(mem[i-1][j], 1+mem[i][j-p[i-1]]);
			}
		}
		while(t-->0) {
			int num=Integer.parseInt(br.readLine());
			if(num==1)
				System.out.println("-1");
			else
				System.out.println(mem[4][num]);
		}
	}
}
