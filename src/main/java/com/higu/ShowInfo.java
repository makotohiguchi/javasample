package com.higu;

import cc.bitbank.entity.Assets;

public class ShowInfo {
	private Assets as = null;

	public ShowInfo(Assets as) {
		this.as = as;
	}

	public void show() {
		for(Assets.Asset a:as.assets) {
			System.out.println("------------------------------------");
			System.out.println("ASSET：" + a.asset);
			System.out.println("保有量：" + a.onhandAmount.doubleValue());
			System.out.println("ロック量：" + a.lockedAmount.doubleValue());
			System.out.println("利用可能量：" + a.freeAmount.doubleValue());
			System.out.println("引き出し手数料：" + a.withdrawalFee);
		}
	}
}
