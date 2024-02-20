package com.flansmod.common.util;

import com.flansmod.common.vector.Vector2f;

public class RecoilCurve {
	public final static RecoilCurve DEFAULT = new RecoilCurve(0, 5, 0, 1, 30);

	private float endPointX;
	private float endPointY;
	private float controlPointX;
	private float controlPointY;
	private int bulletCount;

	private static float evaluateBezier(float start, float control, float end, float t)
	{
		return (1 - t) * ((1 - t) * start + t * control) + t * ((1 - t) * control + t * end);
	}

	public RecoilCurve(float endPointX, float endPointY, float controlPointX, float controlPointY, int bulletCount)
	{
		this.endPointX = endPointX;
		this.endPointY = endPointY;
		this.controlPointX = controlPointX;
		this.controlPointY = controlPointY;
		this.bulletCount = bulletCount;
	}

	public Vector2f get(int step)
	{
		// Normalization for the bezier.
		float t = step / (float)bulletCount;
		float prev = (step - 1) / (float)bulletCount;

		// Calculating the difference between the previous recoil point and the current one.
		// That should give the current offset for this bullet.
		float deltaX = evaluateBezier(0, controlPointX, endPointX, t);
		deltaX -=  evaluateBezier(0, controlPointX, endPointX, prev);
		float deltaY = evaluateBezier(0, controlPointY, endPointY, t);
		deltaY -=  evaluateBezier(0, controlPointY, endPointY, prev);
		return new Vector2f(deltaX, deltaY);
	}
}
