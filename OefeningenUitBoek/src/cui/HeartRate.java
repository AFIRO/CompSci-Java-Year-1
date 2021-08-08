package cui;


public class HeartRate {
	private String firstName,lastName;
	private int dayOfBirth,monthOfBirth,yearOfBirth;
	
	public String getFirstName() {
		return firstName;
	}
	
	public int getDayOfBirth() {
		return dayOfBirth;
	}
	public String getLastName() {
		return lastName;
	}
	
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	
	public int getMonthOfBirth() {
		return monthOfBirth;
	}
	
	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}
	
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
	public HeartRate(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
		this.dayOfBirth= dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	private int calculateAge() {
		int age = 2021 - this.yearOfBirth;
		return age;
	}
	
	private int calculateMaxHeartRate(int age) {
		return 220-age;
	}
	
	private String calculateTargetHeartRate(int max) {
		double minTHR = max * 0.5;
		double  maxTHR = max * 0.8;
		return String.format("Your target heart rate is between %.2f and %.2f", minTHR,maxTHR);
	}
	
	public void giveOverview() {
		System.out.printf("Your name is %s %s.\n", getFirstName(), getLastName());
		System.out.printf("You are %d years old.\n", calculateAge());
		System.out.printf("Your max heart rate is %d.\n", calculateMaxHeartRate(calculateAge()));
		System.out.printf("%s", calculateTargetHeartRate(calculateMaxHeartRate(calculateAge())));
	}

}
