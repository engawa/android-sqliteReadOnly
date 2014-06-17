package example.sqlselectsample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class CreateProductHelper extends SQLiteOpenHelper{

	// �R���X�g���N�^��`
	public CreateProductHelper(Context con){
		// SQLiteOpenHelper�̃R���X�g���N�^�Ăяo��
		super(con,"dbsample",null,1);
	}

	// onCreate���\�b�h
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table author2(_id integer primary key autoincrement," +
					"id integer not null,name text not null,kana text not null," +
					"seibetu text not null);");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(20,'�g��p��','�悵���킦����','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(21,'�]�ː에��','���ǂ������','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(22,'��[�N��','����΂��₷�Ȃ�','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(23,'���ɏC','������������','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(24,'���������Y','�ɂ��ނ炫�傤���낤','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(25,'�A�K�T�E�N���X�e�B�[','�������E���肷�Ă��[','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(26,'�A�[�T�[�E�R�i���E�h�C��','���[���[�E���Ȃ�E�ǂ���','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(27,'���V�P��','�����킺���','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(28,'�i�n�ɑ��Y','���΂�傤���낤','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(29,'�O�Y������','�݂��炵����','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(30,'J�EK�E���[�����O','�����[�E���[�E��[���','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(31,'�����t','�Ђ��������悤','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(32,'���c���q','�͂���������','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(33,'J�ER�ER�E�g�[���L��','�����[�E���[��E���[��E�Ɓ[�邫��','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(34,'���V��','�ق����񂢂�','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(35,'�c�������f�B','���������ł�','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(36,'�X���k','����Ђ낵','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(37,'�����̂���','�����̂���','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(38,'�����ېV','�ɂ���������','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(39,'����','������','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(40,'���c��','���񂾂肭','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(41,'��΃P���a','�����������','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(42,'�������E�W','�����݂�イ��','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(43,'�h�ӂ�','����ӂ�','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(44,'�|�v����','�����Ђ���߂�','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(45,'�ѐ^���q','�͂₵�܂肱','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(46,'���㗴','�ނ炩�݂�イ','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(47,'����t��','�ނ炩�݂͂邫','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(48,'�X�ɋv�\','���肵���Ђ���','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(49,'���c���j','��Ȃ������ɂ�','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(50,'������','��߂܂���΂�','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(51,'�g�{�΂Ȃ�','�悵���Ƃ΂Ȃ�','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(52,'�����[�t�����L�[','���[�ӂ�񂫁[','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(53,'�]�����D','�����ɂ�����','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(54,'�{���݂䂫','�݂�ׂ݂䂫','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(55,'���ɉĕF','���傤�����ȂЂ�','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(56,'�X���o���F','����݂Ƃ݂Ђ�','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(57,'�c���F��','���Ȃ��悵��','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(58,'�L����L�� ','���肷���킠�肷','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(59,'���R�G�v','�悱��܂Ђł�','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(60,'������','������΂�����','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(61,'�Γc�ߗ�','����������','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(62,'���ҍs�l','������䂫��','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(63,'�Ԑ쎟�Y','�������킶�낤','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(64,'�㉓��_��','���ǂ̂����ւ�','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(65,'�������','���ʂ������','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(66,'�����œ�','�������Ƃ�����','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(67,'�͂�݂˂�����','�͂�݂˂�����','��');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(68,'�R�c�I��','��܂��䂤����','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(69,'���鉤���Y','�܂����傤�������낤','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(70,'���o�[�g�E�`�E�n�C�����C��','��΁[�ƁE���[�E�͂���炢��','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(71,'�Ŗ���','�����Ȃ܂���','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(72,'������','������','�j');");
		db.execSQL("INSERT INTO author2 (id,name,kana,seibetu) VALUES(73,'H�EP�E�����N���t�g','�������E�ҁ[�E��Ԃ���ӂ�','�j');");
	}


	// onUpgrade���\�b�h
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
	}

}
