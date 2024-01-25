package project1jv;

import java.util.Scanner;

public class MovieTicketBooking{

	public static void main(String[] args) {
	MovieTicketBooking mb = new MovieTicketBooking();
System.out.println("             WELCOME TO ZCINEMAS              ");
System.out.println(" ");
mb.getname();
	}
	
 static Scanner sc = new Scanner(System.in);

static String [] movieList = {"1)alaipayuthe","2)priyamanavale", "3)VTV", "4)engeyum eppothum"};
//System.out.println("TODAY MOVIE LIST");
public static void getname() {
	String name;
	System.out.println("ENTER YOUR NAME: ");
	name = sc.nextLine();
	System.out.println(" ");
	System.out.println("             WELCOME  "  +name);
	System.out.println(" ");
	getmovie();
}
public static void getmovie() {

	System.out.println("SELECT  YOUR MOVIE FROM THE LIST: ");
	for(int i=0; i<movieList.length; i++) {
		System.out.println(movieList[i]);
	}
	int choice = sc.nextInt();
	System.out.println(" SELECTED MOVIE TO WATCH: ");
	System.out.println(movieList[choice-1].toString().substring(2));
			//substring(2,movieList[choice-1].length()));
	//movie number will not show so we use substring
	
	getseat();
	}
public static void getseat() {
	
	int n;
	System.out.println("NUMBER OF  SEATS YOU WANT: ");
	n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("CHOOSE SEAT NUMBER:");
	for(int i=0; i<n; i++) {
		arr[i] = sc.nextInt();
		
	}
	
	
	
	int amount = n*170;// one ticket cost is 170
	System.out.println("TOTAL AMOUNT TO PAY:" + amount);

	System.out.println("PLEASE SELECT YOUR PAYMENT METHOD");
	int payment=1;
	while(payment==1) {
		System.out.println("1)Gpay");
		System.out.println("2)Phonepay");
		System.out.println("3)Paytm");
		System.out.println("4)UPI");
		int pay = sc.nextInt();
		switch(pay) {
		case 1:
		System.out.println("PAYMENT THROUGH Gpay");
		break;
		case 2:
		System.out.println("PAYMENT THROUGH Phonepay");
		break;
		case 3:
		System.out.println("PAYMENT THROUGH paytm");
		break;
		case 4:
		System.out.println("PAYMENT THROUGH UPI");
		break;
		}
		break;
	}
	System.out.println("ENTER THE AMOUNT: ");
	int amountpay = sc.nextInt();
	if(amountpay == amount) {
		System.out.println("YOUR PAYMENT IS SUCCESSFULLY COMPLETED.");
		System.out.println("YOUR SEAT HAS BEEN SUCCESSFULLY BOOKED.");
		System.out.println(" ");
		System.out.println("               ! THANK YOU FOR CHOOSING ZCINEMAS !               ");
	}
	else {
		System.out.println("Enter valid amount");
		System.out.println("payment failed please! try again");
	}
		
	}

	}


