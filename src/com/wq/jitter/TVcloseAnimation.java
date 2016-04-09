package com.wq.jitter;

import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

public class TVcloseAnimation extends Animation {

	private int mCenterWidth, mCenterHeight;

	@Override
	public void initialize(int width, int height, int parentWidth, int parentHeight) {
		super.initialize(width, height, parentWidth, parentHeight);

		// ����Ĭ��ʱ��
		setDuration(4000);
		// ���ֶ����Ľ���״̬
		setFillAfter(true);
		// ����Ĭ�ϲ�ֵ��
		// setInterpolator(new BounceInterpolator());// �ص�Ч���Ĳ�ֵ��
		mCenterWidth = width / 2;
		mCenterHeight = height / 2;

	}

	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {
		super.applyTransformation(interpolatedTime, t);

		final Matrix matrix = t.getMatrix();
		matrix.preScale(1, 1 - interpolatedTime, mCenterWidth, mCenterHeight);
	}

}