package application;

public class kioskModel {

	public int msum(int[] cnt) {
		
		int summ=0;
		int price=0;
		
		for(int i=0;i<cnt.length;i++) {
			if(i==0) price=1000; 
			if(i==1) price=2000;
			if(i==2) price=3000;
			
			summ=summ+cnt[i]*price;
				
		}
		return summ;
		
	}
	
}
