class DrivingRule {
	private final String name;
	private String description;
	private static String country = "Latvia";
	private static final int CITY_MAX_SPEED = 50;
	private static final int OUT_MAX_SPEED = 90;
	static int totalRuleAmount=0;

	public DrivingRule() {
		this("", "");
	}

	public DrivingRule(String name, String description) {
		this.name = name;
		this.description = description;
		totalRuleAmount++;
	}

	String getName(){
		return this.name;
	}
	
	String getDescription(){
		return this.description;
	}
	
	String getCountry(){
		return country;
	}
	
	int getCityMaxSpeed(){
		return CITY_MAX_SPEED;
	}
	
	int getOutMaxSpeed(){
		return OUT_MAX_SPEED;
	}
	
	void setDiscription(String discription){
		this.description=discription;
	}
}

public class StaticFinalTask {
	

	public static void main(String[] args) {
		DrivingRule d1=new DrivingRule("Gaismas","Tuvajam gaismam vienmer jabut ieslegtam");
		DrivingRule d2 =new DrivingRule("542","Obligati jaapstajas pie STOP zimes");
		
		System.out.println("Sobrid ir izveidoti "+DrivingRule.totalRuleAmount+" noteikumi.");
		

	}

}
