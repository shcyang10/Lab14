package co.grandcircus;

public class Rock extends Player {
	


	public Rock(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Roshambo generateRoshambo() {
		return Roshambo.Rock;
	}

}
