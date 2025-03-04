package text.section_11;

public class WhileSyntax_1 {

	public static void main(String[] args) {

		// 【While文】
		// 繰り返す回数が決まっていない時に使う。

		// 書き方

		// while( 条件式 ) {
		// 反復処理;
		// }

		int dice = 1;// サイコロの目

		// 6が出るまでサイコロを振り続ける
		while (dice != 6) {
			dice = (int) (Math.ceil(Math.random() * 6));
			System.out.println("サイコロの目は" + dice);
		}

		
		// ≪抜け道  break≫

		// ループ処理が無限にならないように、予防をしておくことも大事。

		int dices = 1; // サイコロの目
		int cnt = 0; // サイコロを振った数

		while (dices != 6) {

			// 先にbreak処理をいれ、止められるようにする。
			// 最後にサイコロを振った数を増やすことを忘れないように。
			if (5 <= cnt) {
				System.out.println("5回に達したため強制終了します");
				break;
			}

			dices = (int) (Math.ceil(Math.random() * 6));
			System.out.println("サイコロの目はbreak" + dices);

			// ※ココ！！！ サイコロを振った数をプラス。
			cnt++;
		}

		
		// ≪処理のスキップ continue≫

		int dice3 = 1; // サイコロの目
		int sum = 0; // 合計

		while (sum < 10) {

			dice3 = (int) (Math.ceil(Math.random() * 6));
			System.out.println("サイコロの目はcontinue" + dice3);

			// 出た目が4の場合は以降の処理をせず、次のループへ進む
			if (dice3 == 4) {
				System.out.println("4は加算しません");
				continue;
			}

			// 出た目を変数に加算
			sum += dice3;
			System.out.println(dice3 + " を加算：現在の合計は " + sum);

		}
		System.out.println("最終合計は" + sum);

		
		
		// ≪最初の１回は必ず処理を実行する do-while文≫
		// do {
		//     反復処理;
		// } while( 条件式 );
		
		// 以下の例文では、初期値が1のためwhile文は動かないが、
		// do-while文は最初は動くため処理が続く。

		// 1が出るまでサイコロを振る（while文)
		int diceDo = 1;

		while (diceDo != 1) {

			diceDo = (int) (Math.ceil(Math.random() * 6));
			System.out.println("[while]サイコロの目は" + diceDo);
		}

		// 1が出るまでサイコロを振る（do-while文）
		do {
			diceDo = (int) (Math.ceil(Math.random() * 6));
			System.out.println("[do-while]サイコロの目は" + diceDo);
		} while (diceDo != 1);

	}

}
