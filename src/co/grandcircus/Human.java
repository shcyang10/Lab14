package co.grandcircus;

// human player
public class Human extends Player {


	public Roshambo generateRoshambo(String choice) {
		if (choice.equalsIgnoreCase("Rock")) {
			return Roshambo.Rock;
		} else if (choice.equalsIgnoreCase("Paper")) {
			return Roshambo.Paper;
		} else {
			return Roshambo.Scissors;
		}

	}

	@Override
	public Roshambo generateRoshambo() {
		
		return null;
	}
	
	

}
