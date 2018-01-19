
public class owl extends Animal {

	public owl(String name) {
		super(name);
	}
	@Override
	public String getSound() {
		return "HOOT!";
	}
	@Override
	public boolean hasWings() {
		return true;
	}
	@Override
	public int getNumLegs() {
		return 2; 
	}
}
