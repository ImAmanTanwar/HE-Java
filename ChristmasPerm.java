import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChristmasPerm {
	public static void main(String s[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String str="";
		for(int i=0;i<num/2;i++) 
				str+=(i*2+1)+" ";
		if(num%2==1)
			str+=num+" ";
		for(int i=1;i<=num/2;i++) 
			str+=i*2+" ";
		System.out.println(str);
	}
}
