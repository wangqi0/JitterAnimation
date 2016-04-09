package com.wq.jitter;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public class JitterAnimation extends Animation {

	/**
	 * ���������� 1. float interpolatedTime: ��ʾ��ǰ�������е�ʱ���붯����ʱ�䣨һ���� setDuration()
	 * ���������ã��ı�ֵ����0������1 �� 2. Transformation t ���ݵ�ǰ��������һ�����ͨ������
	 * android.graphics.Matrix matrix = t.getMatrix() ��� Matrix ������������� Matrix
	 * ����һ��Ҫ�õ� interpolatedTime �������Դ˴ﵽ���ƶ���ʵ�ֵĽ����
	 * 
	 */
	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {

		//50Խ��Ƶ��Խ�ߣ�8ԽС���ԽС
		t.getMatrix().setTranslate((float) Math.sin(interpolatedTime * 50) * 8, (float) Math.sin(interpolatedTime * 50) * 8);

		super.applyTransformation(interpolatedTime, t);
	}

}
