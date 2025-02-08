package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> fruits;

	public Dictionary_Chapter21() {
		fruits = new HashMap<String, String>();
		fruits.put("apple", "りんご");
		fruits.put("peach", "桃");
		fruits.put("banana", "バナナ");
		fruits.put("lemon", "レモン");
		fruits.put("pear", "梨");
		fruits.put("kiwi", "キウィ");
		fruits.put("strawberry", "いちご");
		fruits.put("grape", "ぶどう");
		fruits.put("mascut", "マスカット");
		fruits.put("cherry", "さくらんぼ");
	}

	public boolean searchDic(String word) {
		return fruits.containsKey(word);

	}

	public void check(String word) {
		if (searchDic(word)) {
			System.out.println(fruits.get(word));
		}

		else {
			System.out.println(word + " は辞書に存在しません");

		}

	}

}
