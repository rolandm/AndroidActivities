package com.example.webviewtest;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;

public class WebViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_web_view);
		
		WebView wView = (WebView)findViewById(R.id.wView);
		wView.loadUrl("http://www.spiegel.de");
	}

}
