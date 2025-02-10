package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	String rock = "r";
	String scissors = "s";
	String paper = "p";

	public String getMyChoice() {

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		System.out.println(input);

		if (input.equals("r") || input.equals("s") || input.equals("p")) {
			return input;

		} else {
			System.out.println("正しい手をにゅうりょくしてください");
			return getMyChoice();
		}
	}

	public String getRandom() {
		String[] randomHands = { "r", "s", "p" };

		int answer = (int) Math.floor(Math.random() * randomHands.length);

		return randomHands[answer];

	}

	public void playGame(String player, String opponent) {

	    HashMap<String, String> hands = new HashMap<>();
	    hands.put("r", "グー");
	    hands.put("s", "チョキ");
	    hands.put("p", "パー");
	    
	    String playerHand = hands.get(player);
	    String opponentHand = hands.get(opponent);

		System.out.println("自分の手は" + playerHand + ",対戦相手の手は" + opponentHand);

		if (player.equals(opponent)) {
			System.out.println("あいこです");
		} else if ((player.equals(rock) && opponent.equals(scissors)) ||
				(player.equals(scissors) && opponent.equals(paper)) ||
				(player.equals(paper) && opponent.equals(rock))) {
			System.out.println("あなたの勝ちです");
		} else {
			System.out.println("あなたの負けです");

		}

	}

}
