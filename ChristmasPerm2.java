import java.util.Scanner;

class ChristmasPerm2 {
	public static void main(String s[]) {
		  Scanner str = new Scanner(System.in);
	      int N = str.nextInt();
	      str.close();
	      boolean[] nums=new boolean[10001];
	      StringBuilder res=new StringBuilder("");
	      for(int i=1;i<=N;i++)
	    	  nums[i]=true;
	      for(int i=0;i<=N/2;i++) {
	    	  if(nums[i*2+1]==true) {
	    		  res.append((i*2+1)+" ");
	    		  nums[i*2+1]=false;
	    	  }
	      }
	      int sum=4+2*(N%2==1?N+1:N);
	      int temp=sum;
	      for(int i=N;i>0;i--) {
	    	  System.out.println(i+" "+nums[i]+" "+sum);
	    	  if(nums[i]==false)
	    		  continue;
	    	  else {
	    		  if(i<=sum) {
	    			  sum-=i;
	    			  if(sum==0) {
	    				  sum=temp+8;
	    				  temp=sum;
	    			  }
	    			  System.out.println("I am in ELSE IF "+i);
	    			  res.append(i+" ");
	    			  nums[i]=false;
	    		  }
	    		  else {
	    			  if(nums[sum]==true) {
	    				  System.out.println("I am in ELSE ELSE IF "+i);
	    				  res.append(sum+" ");
	    				  nums[sum]=false;
	    				  sum=temp+8;
	    				  temp=sum;
	    				  i++;
	    			  }
	    		  }
	    	  }
	      }
	      System.out.println(res);
	}
}
