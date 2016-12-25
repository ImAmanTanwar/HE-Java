import java.io.*;

class TimeLand {
	public static void main(String s[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			String[] input=br.readLine().split(" ");
			int n=Integer.parseInt(input[0]);
			int l=Integer.parseInt(input[1]);
			int[] nums=new int[n+1];
			String[] val=br.readLine().split(" ");
			for(int j=1;j<n+1;j++)
				nums[j]=Integer.parseInt(val[j-1]);
			int j=1;
			for(;j<=l;j++)
				if(nums[j]<nums[j-1])
					nums[j]=nums[j-1];
			for(;j<n+1;j++)
				nums[j]=(nums[j]+nums[j-l-1]<nums[j-1])?nums[j-1]:(nums[j]+nums[j-l-1]);
			System.out.println(nums[n]);	
		}
	}
}
