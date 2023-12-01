package com.rbi.Admin;

import java.util.Comparator;

import com.rbi.Model.Account3;

public class NameSortComparator implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Account3 A1=(Account3)obj1;
		Account3 A2=(Account3)obj2;
		
		String s1 = A1.getCustomerName().toString();
		String s2 = A2.getCustomerName().toString();
		
//		int l1 = s1.length();
//		int l2 = s2.length();
//		
//		if(l1<l2)
//		{
//			return -1;
//		}
//		else if(l1>l2)
//		{
//			return 1;
//		}
//		else
//		{
		return s1.compareTo(s2);
		}
//	}

}
