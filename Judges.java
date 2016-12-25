import java.io.*;

 class Shopping {
	 public static void main(String s[]) throws Exception {
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int t=Integer.parseInt(br.readLine());
		 for(int i=0;i<t;i++) {
			 int n=Integer.parseInt(br.readLine());
			 int[] mem=new int[3];
				 String[] str=br.readLine().split(" ");
				 mem[0]=Integer.parseInt(str[0]);
				 mem[1]=Integer.parseInt(str[1]);
				 mem[2]=Integer.parseInt(str[2]);
			 for(int j=1;j<n;j++) {
				 str=br.readLine().split(" ");
				int a=Integer.parseInt(str[0]);
				int b=Integer.parseInt(str[0]);
				int c=Integer.parseInt(str[0]);
				if(a+mem[1]<a+mem[2])
					a+=mem[1];
				else
					a+=mem[2];
				if(b+mem[0]<a+mem[2])
					b+=mem[0];
				else
					b+=mem[2];
				if(c+mem[0]<c+mem[1])
					c+=mem[0];
				else
					c+=mem[1];
				mem[0]=a;mem[1]=b;mem[2]=c;
			 }
			 System.out.println(Math.min(mem[0], Math.min(mem[1], mem[2])));
		 }
	 }
}
