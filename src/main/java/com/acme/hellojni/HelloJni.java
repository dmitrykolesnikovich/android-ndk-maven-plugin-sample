package com.acme.hellojni;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class HelloJni extends Activity {
	
	static {
        System.loadLibrary("android-ndk-maven-plugin-sample");
    }
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView textView = new TextView(this);
        textView.setText(stringFromJNI());
        setContentView(textView);
    }
	
    public native String stringFromJNI();
	
}
