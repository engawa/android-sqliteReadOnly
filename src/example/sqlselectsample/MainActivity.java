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

		// DB作成
		helper = new CreateProductHelper(MainActivity.this);
		//ビューを取得
		ListView listView;
		listView = (ListView)findViewById(R.id.listView1);

		//リストビューにアダプタを設定
	    adapter = new AutherAdapter();
	    listView.setAdapter(adapter);

	    //データベースを読み込み、リストビューに追加
	    Readdb();

	    //カーソルの内容をリストビューに追加
	    //addItem(cursor);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	//データベースから読込
	private void Readdb(){
		//読込
		String sql =  "select * from author2;";
		db = helper.getReadableDatabase();
		Cursor c = (Cursor)db.rawQuery(sql, null);

		//リストへ追加
		while(c.moveToNext()){
			dataList.add(new Author(c.getString(3),c.getString(2),c.getString(4)));
		}
		adapter.notifyDataSetChanged();
		
		c.close();
		db.close();
	}

	//カーソルの内容をリストに設定
//	private void addItem(Cursor c){
//		c.moveToFirst();
//		while(c.moveToNext()){
//			dataList.add(new Author(c.getString(3),c.getString(2),c.getString(4)));
//		}
//		adapter.notifyDataSetChanged();
//		c.close();
//	}

	//アダプタクラス
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
