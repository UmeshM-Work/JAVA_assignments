import java.util.Scanner;

/*
Create a program that helps banks to maintain records.
 It should have following facilities.
 o Anybody can create current or saving account with following initial information: account number, name, balance, and branch.
 o display account detail for a particular accounts.
 o display total money deposited in bank.
 o allow deposit and  withdrawal in an account.
 o for saving account opening balance and minimum balance must be 5000.
 o for current account opening balance and minimum balance must be 1000.
 o can not withdraw the amount from the account that makes balance less than the minimum balance. 
*/

import java.util.Scanner;
class CurrentAccount {

	private int accntno;
	private String name;
	private float balance;
	
	CurrentAccount(){}

	CurrentAccount(int accntno, String name, float balance){
		this.accntno = accntno;
		this.name = name;
		this.balance = balance;
	}
	public void DsiplayCA(){
		System.out.println("Account number: "+this.accntno+" Account holder's Name: "+this.name+" Balance Amount: "+this.balance);
	}
	
	public void WithdrawCA(float balance){
		if( (this.balance - balance) <1000F){
			System.out.println("Your balance is lower than minimum balance: ");
			System.out.println("You can only withdraw: "+(this.balance - 1000F));
		}else{
		
		System.out.println("Amount "+balance+" has been deducted from main balance, New balance is: "+(this.balance - balance) );
		this.balance-= balance;
		}
	}
	
	public void DepositeCA( float balance){
				System.out.println("Account number: "+this.accntno+"Amount "+balance+" has been credited , New balance is: "+(this.balance + balance) );
		this.balance += balance;
	}

}

class SavingAccount {
	
	
	private int accntno;
	private String name;
	private float balance;
	
	SavingAccount(){}

	SavingAccount(int accntno, String name, float balance){
		this.accntno = accntno;
		this.name = name;
		this.balance = balance;
	}
	public void DsiplaySA(){
		System.out.println("Account number: "+this.accntno+" Account holder's Name: "+this.name+" Balance Amount: "+this.balance);
	}
	
	public void WithdrawSA(float balance){
		if( (this.balance - balance) <5000F){
			System.out.println("Your balance is lower than minimum balance: ");
			System.out.println("You can only withdraw: "+(this.balance - 1000F));
		}else{
		
		System.out.println("Amount "+balance+" has been deducted from main balance, New balance is: "+(this.balance - balance) );
		this.balance-= balance;
		}
	}
	
	public void DepositeSA( float balance){
				System.out.println("Account number: "+this.accntno+"Amount "+balance+" has been credited , New balance is: "+(this.balance + balance) );
		this.balance += balance;
	}


}

class AccountMain{
	
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice: ");
		System.out.println("1. Saving Account: ");
		System.out.println("2. Current Account: ");
		int chc = sc.nextInt();
		
			System.out.println("Enter account no: ");
			int acnt = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			
			CurrentAccount ca = new CurrentAccount();
			SavingAccount sa = new SavingAccount();
			 
		
		switch(chc){
			
			
			case 1: 
					System.out.println("Enter Amount: ");
					float amnt = sc.nextFloat();
					if(amnt < 5000F){
						System.out.println("Amount cannot be less than 5000");
						System.out.println("Please enter again: ");
						amnt = sc.nextFloat();
					}else{
						System.out.println("Valid amount");
					}	
					
					//CurrentAccount ca = new CurrentAccount(acnt, name, amnt);
					ca.CurrentAccount(acnt, name, amnt);
					ca.DsiplayCA();
					
					break;
					
			case 2: 
					System.out.println("Enter Amount: ");
					float amnt = sc.nextFloat();
					if(amnt < 1000F){
						System.out.println("Amount cannot be less than 5000");
						System.out.println("Please enter again: ");
						amnt = sc.nextFloat();
						
					}else{
						System.out.println("Valid amount");
					}	
					
					SavingAccount sa = new SavingAccount(acnt, name, amnt);
					sa.DsiplayCA();
					
					break;
		}
		
		
			
				boolean flag = true;
				while(flag){
				System.out.println("1. to withdraw ");
				System.out.println("2. to Deposite: ");
				System.out.println("3. to exit: ");
				int ch =sc.nextInt();
		
				switch(ch){
				case 1:
					System.out.println("Enter Amount: ");
					float withdraw = sc.nextFloat();
					ca.WithdrawCA(withdraw);
					break;
					
				case 2:
					System.out.println("Enter Amount: ");
					float credit = sc.nextFloat();
					ca.DepositeCA(credit);
					break;
					
				case 3:
					flag =false;
					break;

				}
				
			}
		
		
		//ca.DsiplayCA();
		//Transaction();
		
	}
	
	
}

/*52.	Input name of a person and count how many vowels it contains.  Use String class functions */

class Vowels1{


    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a Name");
        String name=sc.next();
int count=0;
       for(int i=0;i<name.length();i++)
       {

        if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
        {
            count++;
        }
       } 
       System.out.println("count of vowel is : "+count);
    }
}

/*53.	Input data exactly in the following format, and print sum of all integer values. “67, 89, 23, 67, 12, 55, 66”.   (Hint use String class split method and Integer class parseInt method) .*/

class SplitCount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number in csf: ");
		String str = sc.nextLine();
		String arr[] =str.split(",");

		int sum=0;
		for(String i: arr){
			sum+=Integer.parseInt(i);

		}
		System.out.println("Sum is: "+sum);

	}
}

//54.	Write a program to reverse the given String.


class RevString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string to reverse it: ");
		String str = sc.nextLine();
		StringBuffer sbr = new StringBuffer(str);
		
		System.out.println(sbr.reverse());
		
		//System.out.println("Enter a string to reverse it: ");
		//String str1 = sc.nextLine();

		//System.out.println(str1.split("").reverse().join(""));
	}
}
//55.	Write a program to count no of words in the String.


class CountWords{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to count words: ");
		String str = sc.nextLine().toLowerCase();
 
		//String arr[] = 
		int count=1;
		for(int i=0; i<str.length(); i++){
			if(!(str.charAt(i)>='a' && str.charAt(i)<='z') ){
				count++;
			}
		}
		System.out.println(count);
		
	}
}
//56.	Write a program to convert very first character of every word in uppercase in a String.
class UpperCase{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String ");
		String str = sc.nextLine();

		String arr[] = str.split(" ");

		int count=1;
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1,arr[i].length()).toLowerCase()+" ");
		}
		//System.out.println(str);


		
	}
//57.	Write a program to reverse every word of the String.


class ReverseWord{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String ");
		String str = sc.nextLine();


		//StringBuilder sbr = new StringBuilder(str);

		String arr[] = str.split(" ");

		for(int i=0; i<arr.length; i++){
			StringBuilder sbr = new StringBuilder(arr[i]);
			System.out.print(sbr.reverse()+" ");
			
		}


		
	}
}


