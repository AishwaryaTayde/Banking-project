package com.rbi.Model;

public class Account {
	private int AccNum;
	private String CustomerName;
	private String Address;
	private Double DepositMoney;
	private int Password;
	 
	public void setAccNum(int AccNum)
	{
		this.AccNum=AccNum;
	}
	public int getAccNum()
	{
		return AccNum;
	}
	
	
	public void setCustomerName(String CustomerName)
	{
		this.CustomerName=CustomerName;
	}
	public String getCustomerName()
	{
		return CustomerName;
	}
	
	
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	public String getAddress()
	{
		return Address;
	}
	
	
	public void setDepositMoney(double DepositMoney)
	{
		this.DepositMoney=DepositMoney;
	}
	public double getDepositMoney()
	{
		return DepositMoney;
	}
	
	
	public void setPassword(int Password)
	{
		this.Password=Password;
	}
	public int getPassword()
	{
		return Password;
	}
	@Override
	public String toString() {
		return "AccNum=" + AccNum + "\n CustomerName=" + CustomerName + "\n Address=" + Address
				+ "\n DepositMoney=" + DepositMoney + "\n Password=" + Password ;
	}
	
	
	
	
	
	

}
