package com.rbi.Admin;

import java.util.Comparator;

import com.rbi.Model.Account3;

public class MoneySortComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Account3 A1=(Account3)obj1;
		Account3 A2=(Account3)obj2;
		
		if(A1.getDepositMoney()< A2.getDepositMoney())
		{
			return -1;
		}
		else if(A1.getDepositMoney()> A2.getDepositMoney())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
