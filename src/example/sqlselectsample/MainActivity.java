package example.sqlselectsample;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity{

	static List<Author> dataList = new ArrayList<Author>();
	static AutherAdapter adapter;

	CreateProductHelper helper = null;
	SQLiteDatabase db = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// DB�쐬
		helper = new CreateProductHelper(MainActivity.this);
		//�r���[���擾
		ListView listView;
		listView = (ListView)findViewById(R.id.listView1);

		//���X�g�r���[�ɃA�_�v�^��ݒ�
	    adapter = new AutherAdapter();
	    listView.setAdapter(adapter);

	    //�f�[�^�x�[�X��ǂݍ��݁A���X�g�r���[�ɒǉ�
	    Readdb();

	    //�J�[�\���̓��e�����X�g�r���[�ɒǉ�
	    //addItem(cursor);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	//�f�[�^�x�[�X����Ǎ�
	private void Readdb(){
		//�Ǎ�
		String sql =  "select * from author2;";
		db = helper.getReadableDatabase();
		Cursor c = (Cursor)db.rawQuery(sql, null);

		//���X�g�֒ǉ�
		while(c.moveToNext()){
			dataList.add(new Author(c.getString(3),c.getString(2),c.getString(4)));
		}
		adapter.notifyDataSetChanged();
		
		c.close();
		db.close();
	}

	//�J�[�\���̓��e�����X�g�ɐݒ�
//	private void addItem(Cursor c){
//		c.moveToFirst();
//		while(c.moveToNext()){
//			dataList.add(new Author(c.getString(3),c.getString(2),c.getString(4)));
//		}
//		adapter.notifyDataSetChanged();
//		c.close();
//	}

	//�A�_�v�^�N���X
	 private class AutherAdapter extends BaseAdapter {

		    @Override
		    public int getCount() {
		      return dataList.size();
		    }

		    @Override
		    public Object getItem(int position) {
		      return dataList.get(position);
		    }

		    @Override
		    public long getItemId(int position) {
		      return position;
		    }

		    @Override
		    public View getView(
		      int position,
		      View convertView,
		      ViewGroup parent) {

		      TextView textView1;
		      TextView textView2;
		      TextView textView3;
		      View v = convertView;

		      if(v==null){
		        LayoutInflater inflater =
		          (LayoutInflater)
		            getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		        v = inflater.inflate(R.layout.listrow, null);
		      }
		      Author author = (Author)getItem(position);
		      if(author != null){
		        textView1 = (TextView) v.findViewById(R.id.textView1);
		        textView2 = (TextView) v.findViewById(R.id.textView2);
		        textView3 = (TextView) v.findViewById(R.id.textView3);

		        textView1.setText(author.kana);
		        textView2.setText(author.name);
		        textView3.setText(author.seibetu);
		      }
		      return v;
		    }

	 }



}
