package com.rbi.Admin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import com.rbi.Model.Account;
import com.rbi.Operation.Operation;

public class Main_using_Arraylist {

	public static void main(String[] args)  {

		int A;
		Operation op = new Operation();
		Scanner sc = new Scanner(System.in);
		Account Ac = new Account();
		Account Ac2 = new Account();

		ArrayList l = new ArrayList();
		l.add(Ac);
		l.add(Ac2);

		while (true) {
			System.out.println();
			System.out.println("Select bellow one option");
			System.out.println(
					"1. Create Account \n2. Show Acc Info \n3. Balance Enquiry \n4. Deposit Money \n5. Withdraw \n6. Transfer Money");
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
				Iterator itr = l.iterator();
				while (itr.hasNext()) {
					Object itr1 = itr.next();
					System.out.println("Show Account Information:" + itr1);
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

			}
		}
	}
}
