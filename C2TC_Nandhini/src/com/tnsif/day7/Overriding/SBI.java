package com.tnsif.day7.Overriding;

public class SBI extends RBI{
	@Override
	public float getRateOfInterest() {
		return 7.0f;
	}

	public SBI getObject() {
		return this;
	}
}
