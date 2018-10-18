package com.higu;

import cc.bitbank.entity.Ticker;

public class Tick {
	Ticker ticker = null;

	public Tick(Ticker ticker) {
		this.ticker = ticker;
	}

	public void show() {
		System.out.println("現在の売り注文の最安値:" + ticker.sell.doubleValue());
		System.out.println("現在の買い注文の最高値:" + ticker.buy.doubleValue());
		System.out.println("過去24時間の最高値取引価格:" + ticker.high.doubleValue());
		System.out.println("過去24時間の最安値取引価格:" + ticker.low.doubleValue());
		System.out.println("最新取引価格:" + ticker.last.doubleValue());
		System.out.println("過去24時間の出来高:" + ticker.vol.doubleValue());
		System.out.println("過去24時間の出来高:" + ticker.timestamp);
	}

}
