package study;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int [] score;
		score = new int[8];
		score [1] = 1;
		System.out.println("要素の数" + score.length);
		int [] score2 = {1,2,3,4,5,6,6};
		System.out.println(score2.length);
		for(int value : score) {
			System.out.println(value);
		}
//		ガベージコレクション
		boolean b = true;
		if (b == true) {
			int[] i = {1,2,2,2,2};
			System.out.println(i);
		}
		//こうするとifを抜けた時点で、i[]はメモリから消える
		//その処理をせずとも、Javaが勝手にメモリ上から消してくれる
		//その機能がガベージコレクション

//		score2 = null;
		//こうすると、参照する値がなくなるため、実行時エラーになる。
//		System.out.println(score2[2]);
		//要素数もさんしょうできない
//		System.out.println(score2.length);
//		多次元配列
		int [][] score3 = {{1,3,2,1},{1,2,3,2,3,3}};
		System.out.println("配列数" + score3.length);//配列の数２
		System.out.println("配列の要素数" + score3[0].length);//一番目の配列の要素数４
		ArrayList<Integer> numArray = new ArrayList<Integer>();
		numArray.add(10);
		numArray.add(12);
		System.out.println("numArrayの中身は" + numArray);
		//numArray(0) = 10;上書きはset
		numArray.set(1, 100);
		System.out.println("numArrayの中身は" + numArray);
//		System.out.println(numArray.length);lengthではなくsize()
		System.out.println("numArrayの要素数は" + numArray.size());
		if(numArray.isEmpty() == false) {
			//要素数が空かどうかのはんていはisEmpty()
			System.out.println("空ではない");
		}else {
			System.out.println("空です");
		}
		if(numArray.contains(100) == true) {
			System.out.println("100が含まれています");
		}else {
			System.out.println("100が含まれていません");
		}
		numArray.clear();//要素をすべて削除
		System.out.println("numArrayのようそは" + numArray + "numArrayの要素数は" + numArray.size());
	}

}
