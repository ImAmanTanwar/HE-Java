import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ChristmasDishes {
	public static void main(String s[]) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		int n=Integer.parseInt(input[0]);
		int k=Integer.parseInt(input[1]);
		StringBuilder str=new StringBuilder("");
		if(k==n)
			for(int i=0;i<n;i++)
				str.append("a");
		else if(n==2 && k==3)
			str.append("ab");
		if(str.length()==0)
			System.out.println("No");
		else
			System.out.println(str);
	}
}
