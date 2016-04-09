package com.wq.jitter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
	
	private Button button_01;
	private Button button_02;
	
	private RelativeLayout rl;
	private JitterAnimation jitter;
	private TVcloseAnimation tVcloseAnimation;
	
	private int seconds = 1;//设置抖动时间
	private int repeatCount = 2;//重复次数（不包括第一次）
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button_01 = (Button) findViewById(R.id.button_01);
		button_02 = (Button) findViewById(R.id.button_02);
		rl = (RelativeLayout) findViewById(R.id.rl);
		
		//抖动
		jitter = new JitterAnimation();
		jitter.setDuration(seconds*1000);
		jitter.setRepeatCount(repeatCount);
		//TV关闭效果
		tVcloseAnimation = new TVcloseAnimation();
		
		button_01.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				rl.startAnimation(jitter);
			}
		});
		button_02.setOnClickListener( new OnClickListener() {
			@Override
			public void onClick(View v) {
				rl.startAnimation(tVcloseAnimation);
			}
		});
	}

}
