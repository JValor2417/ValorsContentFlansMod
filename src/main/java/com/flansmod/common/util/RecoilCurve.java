package com.flansmod.common.util;

import com.flansmod.common.vector.Vector2f;
import net.minecraft.util.math.MathHelper;

public class RecoilCurve {
	public final static RecoilCurve DEFAULT = new RecoilCurve(0, 5, 0, 1, 30);

	private final float endPointX;
	private final float endPointY;
	private final float controlPointX;
	private final float controlPointY;
	private final int bulletCount;

	private static float evaluateBezier(float start, float control, float end, float t) {
		return (1 - t) * ((1 - t) * start + t * control) + t * ((1 - t) * control + t * end);
	}
	private static float bezierSlope(float start, float control, float end, float t)
	{
		// First derivative of a quad bezier
		return 2 * (1 - t) * (control - start) + 2 * t * (end - control);
	}

	public RecoilCurve(float controlPointX, float controlPointY, float endPointX, float endPointY, int bulletCount) {
		this.endPointX = endPointX;
		this.endPointY = endPointY;
		this.controlPointX = controlPointX;
		this.controlPointY = controlPointY;
		this.bulletCount = bulletCount;
	}

	public Vector2f get(int step) {
		// Normalization for the bezier.
		// The sqrt is to ensure a more constant rate of change for the otherwise quadratic curve.
		float t = step / (float)bulletCount;
		float prev = (step - 1) / (float)bulletCount;

		// Calculating the difference between the previous recoil point and the current one.
		// That should give the current offset for this bullet.
		if (t <= 1) {
			float deltaX = evaluateBezier(0, controlPointX, endPointX, t);
			deltaX -= evaluateBezier(0, controlPointX, endPointX, prev);
			float deltaY = evaluateBezier(0, controlPointY, endPointY, t);
			deltaY -= evaluateBezier(0, controlPointY, endPointY, prev);
			return new Vector2f(deltaX, deltaY);
		} else {
			// The section of the recoil curve past t = 1 is linear.
			// The quadratic bezier is quadratic and would cause the recoil to accelerate.
			float deltaX = bezierSlope(0, controlPointX, endPointX, 1) * (1f / bulletCount);
			float deltaY = bezierSlope(0, controlPointY, endPointY, 1) * (1f / bulletCount);
			return new Vector2f(deltaX, deltaY);
		}
	}
}
