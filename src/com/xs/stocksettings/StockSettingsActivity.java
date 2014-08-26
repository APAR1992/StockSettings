package com.xs.stocksettings;

import android.os.Bundle;
import android.preference.*;
import android.widget.Toast;

public class StockSettingsActivity extends PreferenceActivity {
	
	private static final String ABOUT = "about";
	
	private Preference mAbout;
	
	public void onCreate (Bundle SavedInstanceState) {
		super.onCreate(SavedInstanceState);
		addPreferencesFromResource(R.xml.activity_stocksettings);
		
		mAbout = (Preference) findPreference(ABOUT);
	}
	
	public boolean onPreferenceTreeClick (PreferenceScreen preferencescreen , Preference preference) {
		if (preference == mAbout) {
			Toast.makeText(this, "����������XS��������Ȩ��С��ʹ�ã��Ͻ����˵��ԣ�", 2000).show();
		}
		return false;
	}
	
}
