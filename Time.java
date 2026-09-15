public class Time {
	public static void main(String[] args) {
		int hour = 13;
		int minute = 40;
		int second = 00;
		int currentHour = 14;
		int currentMinute = 9;
		int currentSecond = 00;		
		System.out.println(hour*3600 + minute*60 + second + " seconds have passed since midnight.");
		System.out.println("There are " + (86400 - (hour*3600 + minute*60 + second)) + " seconds remaining today.");
		System.out.println(((hour*3600.00 + minute*60.00 + second) / 86400) * 100 + "% of the day has passed");
		System.out.println((currentHour*3600 + currentMinute*60 + currentSecond) - (hour*3600 + minute*60 + second) + " seconds have passed since beginning the assignment.");
	
	
	}

}
