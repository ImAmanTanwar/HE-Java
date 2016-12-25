import java.io.*;

class MJGame {
	public static void main(String s[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
		String[] input=br.readLine().split(" ");
		int stk=Integer.parseInt(input[0]);
		int coins=Integer.parseInt(input[1]);
		int turn=0,val;
		while(stk>0 && coins>0) {
			if(stk==2) {
				val=turn;
				stk=0;
				coins=0;
			}
			else if(stk>2) {
				stk-=2;
				turn=(++turn)% 2;
			}
			else if(stk==1) {
				while(coins>1) {
					coins=(coins+1)/2;
					turn=(++turn)%2;		
				}
				stk=0;
				coins=0;
				val=turn;
			}
		}
		if(turn==0)
			System.out.println("Mojo");
		else
			System.out.println("Jojo");
		}
	}
}
