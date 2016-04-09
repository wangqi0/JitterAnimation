package com.wq.jitter;

import android.view.animation.Animation;
import android.view.animation.Transformation;

public class JitterAnimation extends Animation {

	/**
	 * 两个参数： 1. float interpolatedTime: 表示当前动画进行的时间与动画总时间（一般在 setDuration()
	 * 方法中设置）的比值，从0逐渐增大到1 。 2. Transformation t 传递当前动画对象，一般可以通过代码
	 * android.graphics.Matrix matrix = t.getMatrix() 获得 Matrix 矩阵对象，再设置 Matrix
	 * 对象，一般要用到 interpolatedTime 参数，以此达到控制动画实现的结果。
	 * 
	 */
	@Override
	protected void applyTransformation(float interpolatedTime, Transformation t) {

		//50越大频率越高，8越小振幅越小
		t.getMatrix().setTranslate((float) Math.sin(interpolatedTime * 50) * 8, (float) Math.sin(interpolatedTime * 50) * 8);

		super.applyTransformation(interpolatedTime, t);
	}

}
