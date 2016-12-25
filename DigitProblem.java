import java.io.*;

class DigitProblem {
	public static void main(String s[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] str=br.readLine().split(" ");
		String[] num=str[0].split("");
		int k=Integer.parseInt(str[1]);
		String val="";
		for(int i=0;i<num.length;i++) {
			if(k<=0) {
				for(int j=i;j<num.length;j++)
					val+=num[j];
				i=num.length;
			}
			else {
				if(!num[i].equals("9"))
					k--;
				val+="9";
					
			}
		}
		System.out.println(val);
	}
}
