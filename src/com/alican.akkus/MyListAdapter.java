package com.example.sertifikasinavcustomlistview;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {
	private LayoutInflater inflater;
	private List<User> userList;

	public MyListAdapter(final Activity activity, final List<User> user) {
		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		userList = user;
	}

	public void MyListAdapter1(final Activity activity, final List<User> user) {
		inflater = (LayoutInflater) activity
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		userList = user;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return userList.size();
	}

	@Override
	public Object getItem(final int position) {
		// TODO Auto-generated method stub
		return userList.get(position);
	}

	@Override
	public long getItemId(final int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(final int position, final View convertView,
			final ViewGroup parent) {
		// TODO Auto-generated method stub
		View vi = convertView;
		if (convertView == null) {
			vi = inflater.inflate(R.layout.listview, null);
		}

		final TextView text = (TextView) vi.findViewById(R.id.row_textview);
		final ImageView image = (ImageView) vi.findViewById(R.id.row_imageview);

		final User user = userList.get(position);
		text.setText(user.getName());

		if (user.isMale()) {
			image.setImageResource(R.drawable.male);
		} else {
			image.setImageResource(R.drawable.female);
		}

		return vi;
	}

}
