package timtable;

public enum Day {
	MON("Monday", "월"), 
	TUE("Tuesday", "화"),
	WED("Wednesday", "수"),
	THU("Thursday", "목"),
	FRI("Friday", "금"),
	SAT("Saturday", "토"),
	SUN("Sunday", "일");
	
	private String fullName;
	private String korName;
	
	private Day(String fullName, String korName) {
		this.fullName = fullName;
		this.korName = korName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getKorName() {
		return korName;
	}
	
}
