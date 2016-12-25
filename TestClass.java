import java.io.*;

class TestClass {

	static long calculate(int n) {
		int count=0;
		int[][] mem=new int[n][n];
		int i=((n+1)/2);
		int j=0;
		if(n%2==0)
			j=(n-1)/2;
		else
			j=(n+1)/2;
		mem[i][j]=++count;
		mem[i][++j]=++count;
		mem[--i][j]=++count;
		mem[i][--j]=++count;
		mem[i][--j]=++count; 
		while(count!=n*n) {
			down(mem,i,j,count,n);
			right(mem,i,j,count,n);
			top(mem,i,j,count,n);
			left(mem,i,j,count,n);
		}
		long sum=0;
		for(int x=0;x<n;x++) {
			for(int y=0;y<n;y++)
				System.out.print(mem[x][y]+" ");
			System.out.println();
		}
		for(int l=0;l<n;l++) {
				sum+=(long)mem[l][l];
				sum+=(long)mem[l][n-l-1];
		}
		return sum;
	}
	static void top(int[][] mem,int i,int j,int count,int n) {
		if(count==n*n)
			return;
		while(i>=0&&mem[i][j-1]>0) {
			mem[--i][j]=++count;
		}
	}
	static void right(int[][] mem,int i,int j,int count,int n) {
		if(count==n*n)
			return;
		while(j<n&&i<n&&mem[i-1][j-1]>0) {
			mem[i][++j]=++count;
		}
	}
	static void down(int[][] mem,int i,int j,int count,int n) {
		if(count==n*n)
			return;
		while(i<n&&mem[i][j+1]>0) {
			mem[++i][j]=++count;
		}
	}
	static void left(int[][] mem,int i,int j,int count,int n) {
		if(count==n*n)
			return;
		while(j>=0&&mem[i+1][j]>0) {
			mem[i][--j]=++count;
		}
	}
	
	public static void main(String s[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			int n=Integer.parseInt(br.readLine());
			System.out.println(calculate(n));
		}
	}
}
