public class Time {
	public static void main(String[] args) {
		int hour = 14;
		int minute = 35;
		int second = 00;
		System.out.println(hour*3600 + minute*60 + second + " seconds have passed since midnight.");
		System.out.println("There are " + (86400 - (hour*3600 + minute*60 + second)) + " seconds remaining today.");
		System.out.println(((hour*3600.00 + minute*60.00 + second) / 86400) * 100 + "% of the day has passed");
	
	
	}

}
