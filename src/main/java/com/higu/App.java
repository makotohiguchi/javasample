package com.higu;

import java.io.IOException;

import cc.bitbank.Bitbankcc;
import cc.bitbank.entity.enums.CurrencyPair;
import cc.bitbank.exception.BitbankException;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) {
    	Bitbankcc bb = new Bitbankcc();
    	bb.setKey("KEY","SECRET");

		try {
			//保有量とか手数料とかを表示
			ShowInfo si = new ShowInfo(bb.getAsset());
			si.show();
			// 売り注文、買い注文とかの最高値、最低値を表示
			Tick t = new Tick(bb.getTicker(CurrencyPair.BTC_JPY));
			t.show();
			// 買い板、売り板を表示
			Dep d = new Dep(bb.getDepth(CurrencyPair.BTC_JPY));
			d.show();

		} catch (BitbankException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
