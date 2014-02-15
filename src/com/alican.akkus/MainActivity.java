package com.example.sertifikasinavcustomlistview;

//Alican Akkuþ
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private ListView customListView;
	private final List<User> users = new ArrayList<User>();

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final User erkek1 = new User("Erkek - 1 ", true);
		final User bayan1 = new User("Bayan - 1", false);
		final User erkek2 = new User("Erkek - 2 ", true);
		final User erkek3 = new User("Erkek - 3 ", true);
		final User bayan2 = new User("Bayan - 2 ", false);
		final User bayan3 = new User("Bayan - 3 ", false);

		users.add(erkek1);
		users.add(bayan1);
		users.add(erkek2);
		users.add(erkek3);
		users.add(bayan2);
		users.add(bayan3);

		customListView = (ListView) findViewById(R.id.listView);

		final MyListAdapter myListAdapter = new MyListAdapter(
				MainActivity.this, users);

		customListView.setAdapter(myListAdapter);

		customListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(final AdapterView<?> arg0, final View arg1,
					final int position, final long id) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(),
						users.get(position).getInformation(),
						Toast.LENGTH_SHORT).show();
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
