package minion;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	public Minion(String a, int b, String c, String d) {
		name=a;
		eyes=b;
		color=c;
		master=d;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public int getEyes() {
		// TODO Auto-generated method stub
		return eyes;
	}
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}
	public String getMaster() {
		// TODO Auto-generated method stub
		return master;
	}
	public void setMaster(String string) {
		// TODO Auto-generated method stub
		master=string;
	}
	
}
