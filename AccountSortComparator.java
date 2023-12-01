package com.rbi.Admin;

import java.util.Comparator;

import com.rbi.Model.Account3;

public class AccountSortComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
	Account3 A1=(Account3)obj1;
	Account3 A2=(Account3)obj2;
		return A1.getAccNum()-A2.getAccNum();
	}

}
