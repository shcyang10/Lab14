package co.grandcircus;

public class Random extends Player {

	public Random() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public Roshambo generateRoshambo() {
		int random = (int)(Math.random() * 3 + 1);
		if(random == 1) {
			return Roshambo.Rock;
		}else if(random == 2) {
			return Roshambo.Paper;
		}else {
			return Roshambo.Scissors;
		}
	}

}
