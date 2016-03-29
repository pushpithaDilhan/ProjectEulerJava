import java.util.Date;

public class test2 {
	public static void main(String args[]){		
		long y = System.currentTimeMillis();
		
		Date x  =new Date(01,00,01);
		int sunCount = 0;
		for(int year = 1;year <101;year++){
			x.setYear(year);
			for(int month = 0;month<12;month++){
				x.setMonth(month);
				if(x.toString().substring(0,3).equals("Sun")){
					sunCount++;
				}
			}
			
		}
		System.out.println(sunCount);
		System.out.println(System.currentTimeMillis()-y + " milliseconds");
	}
	

}
