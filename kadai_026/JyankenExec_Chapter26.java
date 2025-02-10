package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		Jyanken_Chapter26 play = new Jyanken_Chapter26();

		String playerHand = play.getMyChoice();
		String opponentHand = play.getRandom();
		play.playGame(playerHand, opponentHand);

	}

}
