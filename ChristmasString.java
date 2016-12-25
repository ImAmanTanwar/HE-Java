import java.io.*;

class ChristmasString {
	public static void main(String s[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int[] count=new int[3001];
		int n=Integer.parseInt(br.readLine());
		while(n-->0) {
			String test=br.readLine();
			int dist=0,index=-1;
			int l=test.length();
			for(int i=0;i<l;i++) {
				if(dist>1)
					break;
				else if(test.charAt(i)!=input.charAt(i)&&input.charAt(i)!='*') {
					dist++;
					if(dist>1)
						break;
					index=i;
				}
			}
			if(dist<2)
				count[index+1]+=1;
		}
		int max=0;
		for(int i=1;i<=3000;i++)
			if(max<count[i])
				max=count[i];
		System.out.println(max+count[0]);
	}

}
