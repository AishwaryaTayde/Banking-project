package com.rbi.Admin;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


import com.rbi.Model.Account3;

public class Main_Using_Customise_Treeset {
	public static void main(String[] args) {
    int A;
//        TreeSet<Account3> t1=null;
		Scanner sc = new Scanner(System.in);
		Account3 Ac = new Account3();
		Account3 Ac2 = new Account3();
		 TreeSet<Account3> t =null;
		
		 
		while (true) {
			System.out.println();
			System.out.println("Select bellow one option");
			System.out.println("1. Create Account \n2. Show Acc Info ");
			System.out.println("   21. Account Number Sort \n   22. Name Sort \n   23.Address Sort \n   24.Balance Sort");
			System.out.println("3. Balance Enquiry \n4. Credit Money \n5. Withdraw \n6. Transfer Money");
			int x = sc.nextInt();

			switch (x) {

			case 1:
				// op.CreateAccount();
				while (true) {
					while (true) {
						try {
							Scanner sc1 = new Scanner(System.in);
							System.out.println("Enter Account Number:");
							Ac.setAccNum(sc1.nextInt());
							break;
						} catch (Exception e) {
							System.out.println("Input should be in digits only");
						}
					}

					System.out.println("Enter Customer Name:");
					Ac.setCustomerName(sc.next());

					System.out.println("Enter Customer Address:");
					Ac.setAddress(sc.next());

					System.out.println("Password should be in digits \nEnter password:");
					Ac.setPassword(sc.nextInt());

					while (true) {
						try {
							Scanner sc2 = new Scanner(System.in);
							System.out.println("Deposit Money");

							double d = sc2.nextDouble();

							if (d >= 500) {
								Ac.setDepositMoney(d);
								System.out.println("Money has been deposited successfully");
								break;
							} else {

								System.out.println("Deposite money should be greater than or equal to 500");

							}

						} catch (Exception e) {
							System.out.println("Input should be in digits only");

						}
					}
					break;
				}
				while (true) {
					System.out.println("You want to create another account press Y or N");
					char C = sc.next().charAt(0);
					if (C == 'Y') {
						while (true) {

							try {
								System.out.println("Enter Account Number:");
								Scanner sc1 = new Scanner(System.in);
								Ac2.setAccNum(sc.nextInt());
								break;
							} catch (Exception e) {
								System.out.println("Input should be in digits only");
							}
						}
						System.out.println("Enter Customer Name:");
						Ac2.setCustomerName(sc.next());

						System.out.println("Enter Customer Address:");
						Ac2.setAddress(sc.next());

						System.out.println("Password should be in digits \nEnter password:");
						Ac2.setPassword(sc.nextInt());

						while (true) {
							try {
								// Scanner sc2 = new Scanner(System.in);
								System.out.println("Deposit Money");

								double d = sc.nextDouble();

								if (d >= 500) {
									Ac2.setDepositMoney(d);
									System.out.println("Money has been deposited successfully");
									break;
								} else {

									System.out.println("Deposite money should be greater than or equal to 500");

								}

							} catch (Exception e) {
								System.out.println("Input should be in digits only");

							}
						}

					} else if (C == 'N') {
						break;
					}

					else {

						System.out.println("Invalid Input");
					}
				}

				break;

			case 2:
				t=new TreeSet();
				 t.add(Ac);
					t.add(Ac2);
					
				
				Iterator i1 = t.iterator();
				while (i1.hasNext()) {
					Object i2 = i1.next();
					System.out.println(i2);
					System.out.println("________________");
				}
				break;

			case 3:

				while (true) {
					System.out.println("Press 1 for Account " + Ac.getAccNum() + " and press 2 for " + Ac2.getAccNum()
							+ " and press 0 to exit");

					A = sc.nextInt();
					if (A == 1) {
						System.out.println("Account number:" + Ac.getAccNum());
						System.out.println("Your total Balance is:" + Ac.getDepositMoney());
					} else if (A == 2) {
						System.out.println("Account number:" + Ac2.getAccNum());
						System.out.println("Your total Balance is:" + Ac2.getDepositMoney());
					}

					else if (A == 0) {
						break;
					}

					else {
						System.out.println("Invalid Choice");
					}

				}

				break;

			case 4:
				while (true) {
					System.out.println("Press 1 for Account " + Ac.getAccNum() + " and press 2 for " + Ac2.getAccNum()
							+ " and press 0 to exit");

					A = sc.nextInt();
					if (A == 1) {
						while (true) {
							System.out.println("Account number:" + Ac.getAccNum());

							
								System.out.println("Enter amount:");
								int c = sc.nextInt();
								if (c > 0) {
									double Total = Ac.getDepositMoney() + c;
									Ac.setDepositMoney(Total);
									System.out.println("Your Total Balance is:" + Ac.getDepositMoney());
									break;
								}
							}
						
					} else if (A == 2) {
						while (true) {
							System.out.println("Account number:" + Ac2.getAccNum());

						
								System.out.println("Enter amount:");
								int c = sc.nextInt();
								if (c > 0) {
									double Total = Ac2.getDepositMoney() + c;
									Ac2.setDepositMoney(Total);
									System.out.println("Your Total Balance is:" + Ac2.getDepositMoney());
									break;
								}
							}
						}
					

					else if (A == 0) {
						break;
					}

					else {
						System.out.println("Invalid choice");
					}
				}

				break;

			case 5:
				while (true) {
					System.out.println("Press 1 for Account " + Ac.getAccNum() + "and press 2 for " + Ac2.getAccNum()
							+ "and press 0 for exit");

					A = sc.nextInt();
					if (A == 1) {
						System.out.println("Account number:" + Ac.getAccNum());

						
							while (true) {
								System.out.println("Enter amount:");
								double c = sc.nextDouble();
								if (c < Ac.getDepositMoney()) {
									Double Total = Ac.getDepositMoney() - c;
									System.out.println("Money has been Withdraw successfully");

									Ac.setDepositMoney(Total);
									System.out.println("Total balance is:" + Ac.getDepositMoney());
									break;
								} else if (c < 0) {
									System.out.println("Enter Amount should be greater than Zero ");
								}

								else {
									System.out.println(
											"Your entered Amount has been greater than your Total Balance \n Please ReEnter Amount");
								}
							}
						}
					

					else if (A == 2) {
						System.out.println("Account number:" + Ac2.getAccNum());

						
							while (true) {
								System.out.println("Enter amount:");
								double c = sc.nextDouble();
								if (c < Ac2.getDepositMoney()) {
									Double Total = Ac2.getDepositMoney() - c;
									System.out.println("Money has been Withdraw successfully");

									Ac2.setDepositMoney(Total);
									System.out.println("Total balance is:" + Ac2.getDepositMoney());
									break;
								} else if (c < 0) {
									System.out.println("Enter Amount should be greater than Zero ");
								}

								else {
									System.out.println(
											"Your entered Amount has been greater than your Total Balance \n Please ReEnter Amount");
								}
							}
						}
					

					else if (A == 0) {
						break;
					}

					else {
						System.out.println("Invalid Input");
					}
				}
				break;

			case 6:
				while (true) {

					System.out.println(
							"press 1 to tranfer money from Account " + Ac.getAccNum() + " to " + Ac2.getAccNum());
					System.out.println(
							"press 2 to tranfer money from Account " + Ac2.getAccNum() + " to " + Ac.getAccNum());
					System.out.println("pres 0 to exit");
					A = sc.nextInt();
					if (A == 1) {
						while (true) {
							System.out.println("Enter amount:");
							int c = sc.nextInt();
							if (c < Ac.getDepositMoney()) {

								double Total = Ac.getDepositMoney() - c;
								Ac.setDepositMoney(Total);

								System.out.println("Amount has been transferred successfully");
								System.out.println("Rs " + c + " has been debited from " + Ac.getAccNum());
								System.out.println(
										"Account Number " + Ac.getAccNum() + " Balance is " + Ac.getDepositMoney());
								System.out.println();

								Double Total1 = Ac2.getDepositMoney() + c;
								Ac2.setDepositMoney(Total1);
								break;

							} else if (c < 0) {
								System.out.println("Enter Amount should be greater than Zero ");
							}

							else {
								System.out.println(
										"Your entered Amount has been greater than your Total Balance \n Please ReEnter Amount");
							}
						}
					} else if (A == 2) {
						while (true) {

							System.out.println("Enter amount:");
							int c = sc.nextInt();

							if (c < Ac2.getDepositMoney()) {

								double Total = Ac2.getDepositMoney() - c;
								Ac2.setDepositMoney(Total);

								System.out.println("Amount has been transferred successfully");
								System.out.println("Rs " + c + " has been debited from " + Ac2.getAccNum());
								System.out.println(
										"Account Number " + Ac2.getAccNum() + " Balance is " + Ac2.getDepositMoney());
								System.out.println();

								Double Total1 = Ac.getDepositMoney() + c;
								Ac.setDepositMoney(Total1);
								break;
							} else if (c < 0) {
								System.out.println("Enter Amount should be greater than Zero ");
							}

							else {
								System.out.println(
										"Your entered Amount has been greater than your Total Balance \n Please ReEnter Amount");
							}

						}
					} else if (A == 0) {
						break;

					} else {
						System.out.println("Input is invalid");
					}
				}
				break;
				
			case 21:
				 t=new TreeSet(new AccountSortComparator());
				 t.add(Ac);
					t.add(Ac2);
				for( Account3 Acc:t)
				{
					System.out.println("Account Number sort: "+Acc.getAccNum());
					System.out.println(Acc.getCustomerName());
					System.out.println(Acc.getAddress());
					System.out.println(Acc.getDepositMoney());
					System.out.println(Acc.getPassword());
					System.out.println();
				}
			
				break;
				
			case 22:
				 t=new TreeSet(new NameSortComparator());
				 t.add(Ac);
					t.add(Ac2);
				for( Account3 Acc:t)
				{
					System.out.println(Acc.getAccNum());
					System.out.println("Name Sort: "+Acc.getCustomerName());
					System.out.println(Acc.getAddress());
					System.out.println(Acc.getDepositMoney());
					System.out.println(Acc.getPassword());
					System.out.println();
				}
			
				
				
				break;
				
			case 23:
				t=new TreeSet(new AddressSortComparator());
				 t.add(Ac);
					t.add(Ac2);
				for( Account3 Acc:t)
				{
					System.out.println(Acc.getAccNum());
					System.out.println(Acc.getCustomerName());
					System.out.println("Address Sort: "+ Acc.getAddress());
					System.out.println(Acc.getDepositMoney());
					System.out.println(Acc.getPassword());
					System.out.println();
				}
			
				
				break;
				
			case 24:
				t=new TreeSet(new MoneySortComparator());
				 t.add(Ac);
					t.add(Ac2);
				for( Account3 Acc:t)
				{
					System.out.println(Acc.getAccNum());
					System.out.println(Acc.getCustomerName());
					System.out.println(Acc.getAddress());
					System.out.println("Balance Sort: "+Acc.getDepositMoney());
					System.out.println(Acc.getPassword());
					System.out.println();
				}
			
				break;
			
		
			}
			 
		}
		}
}
		
	
			
			


