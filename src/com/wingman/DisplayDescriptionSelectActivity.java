package com.wingman;

import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.wingman.models.PersonModel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DisplayDescriptionSelectActivity extends Activity {
	private static final String MY_AD_UNIT_ID = "a14e50830f3a4d4";
	

	public void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.displaydescriptionselection);
		
		
		
		
		Intent i = getIntent();
		Bundle extras = i.getExtras();
		PersonModel pm = (PersonModel) extras.get("PersonModel");
		
		// Nasty conversion of int to yes/no
		String single = "No";
		if(pm.isSingle() == 1)
		{
			single = "Yes";
		} 
		
		StringBuilder sb = new StringBuilder();
		sb.append("Firstname: " + pm.getFirstName() + "\n");
		sb.append("Lastname: " + pm.getLastName() + "\n");
		sb.append("Date posted: " + pm.getDate() + "\n");
		sb.append("Single: " + single + "\n");
		sb.append("Description: " + pm.getComment() + "\n");
		sb.append("Rating: " + pm.getRating() + "\n");
		
		TextView tv = (TextView) findViewById(R.id.textView1);
		tv.setText(sb.toString());
		
		
	}
}
