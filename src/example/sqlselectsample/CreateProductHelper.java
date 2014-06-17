package example.sqlselectsample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class CreateProductHelper extends SQLiteOpenHelper{

	// コンストラクタ定義
	public CreateProductHelper(Context con){
		// SQLiteOpenHelperのコンストラクタ呼び出し
		super(con,"dbsample",null,1);
	}

	// onCreateメソッド
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table author2(_id integer primary key autoincrement," +
					"id integer not null,name text not null,kana text not null," +
					"seibetu text not null);");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(20,'吉川英治','よしかわえいじ','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(21,'江戸川乱歩','えどがわらんぽ','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(22,'川端康成','かわばたやすなり','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(23,'太宰修','だざいおさむ','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(24,'西村京太郎','にしむらきょうたろう','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(25,'アガサ・クリスティー','あがさ・くりすてぃー','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(26,'アーサー・コナン・ドイル','あーさー・こなん・どいる','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(27,'小澤善哉','おざわぜんや','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(28,'司馬遼太郎','しばりょうたろう','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(29,'三浦しをん','みうらしをん','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(30,'J・K・ローリング','じぇー・けー・ろーりんぐ','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(31,'樋口一葉','ひぐちいちよう','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(32,'橋田壽賀子','はしだすがこ','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(33,'J・R・R・トールキン','じぇー・あーる・あーる・とーるきん','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(34,'星新一','ほししんいち','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(35,'田口ランディ','たぐちらんでぃ','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(36,'森博嗣','もりひろし','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(37,'あさのあつこ','あさのあつこ','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(38,'西尾維新','にしおいしん','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(39,'乙一','おついち','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(40,'恩田陸','おんだりく','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(41,'大槻ケンヂ','おおつきけんぢ','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(42,'鏡リュウジ','かがみりゅうじ','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(43,'檀ふみ','だんふみ','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(44,'竹久夢二','たけひさゆめじ','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(45,'林真理子','はやしまりこ','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(46,'村上龍','むらかみりゅう','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(47,'村上春樹','むらかみはるき','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(48,'森繁久彌','もりしげひさや','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(49,'柳田国男','やなぎだくにお','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(50,'夢枕獏','ゆめまくらばく','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(51,'吉本ばなな','よしもとばなな','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(52,'リリーフランキー','りりーふらんきー','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(53,'江國香織','えくにかおり','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(54,'宮部みゆき','みやべみゆき','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(55,'京極夏彦','きょうごくなつひこ','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(56,'森見登美彦','もりみとみひこ','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(57,'田中芳樹','たなかよしき','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(58,'有栖川有栖 ','ありすがわありす','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(59,'横山秀夫','よこやまひでお','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(60,'桜庭一樹','さくらばかずき','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(61,'石田衣良','いしだいら','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(62,'綾辻行人','あやつじゆきと','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(63,'赤川次郎','あかがわじろう','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(64,'上遠野浩平','かどのこうへい','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(65,'乾くるみ','いぬいくるみ','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(66,'高里椎奈','たかさとしいな','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(67,'はやみねかおる','はやみねかおる','女');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(68,'山田悠介','やまだゆうすけ','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(69,'舞城王太郎','まいじょうおうたろう','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(70,'ロバート・Ａ・ハインライン','ろばーと・えー・はいんらいん','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(71,'椎名誠','しいなまこと','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(72,'日日日','あきら','男');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(73,'H・P・ラヴクラフト','えいち・ぴー・らぶくらふと','男');");
	}


	// onUpgradeメソッド
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
	}

}
