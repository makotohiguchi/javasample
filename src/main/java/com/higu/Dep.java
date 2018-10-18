package com.higu;

import java.math.BigDecimal;

import cc.bitbank.entity.Depth;

public class Dep {
	private Depth d = null;

	public Dep(Depth d) {
		this.d = d;
	}

	public void show() {
		for (BigDecimal[] asks : d.getAsks()) {
			System.out.println(asks[0].doubleValue() + ":" + asks[1].doubleValue());
		}

	}
}
