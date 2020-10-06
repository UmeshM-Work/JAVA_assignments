//Q58.Store name of weekdays in an array (starting from “Sunday” at 0 index). Ask day position from user and print day name. Handle array index out of bound exception and give proper message if user enter day index outside range (0-6). 

package a3;
import java.util.Scanner;
public class Q58 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str2[]= {"Sun","Tue","Wed","Thur","Fri","Sat","Mon"};
		int a=sc.nextInt();
		for(int i=0;i<str2.length;i++) {
			if(i==(a-1)) {
				System.out.print(str2[i]);
				break;
			}
		}
		

	}

}
---------------------------------------------------------------------------------------------------------------------------------
//59.Create a class Voter(voterId, name, age) with parameterized constructor.
//The parameterized constructor should throw a checked exception if age is less than 18. 
//The message of exception is �invalid age for voter � 
package Excep;

import java.util.*;
class Voter {
	private int voterid;
	private String name;
	private int age;
	
	Voter(int voterid,String name,int age) 
	{
		this.voterid=voterid;
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "Voter Id : " +voterid+ " Voter Name : \n"+name+" Voter Age :"+age;
	}
	
	
	
}
public class Qst59Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter id : ");
			int id=sc.nextInt();
			System.out.println("Enter name :");
			String name=sc.next();
			System.out.println("Enter age : ");
			int age=sc.nextInt();
			if(age<18)
			{
				throw new Exception("Invalid age");
			}
			else {
				Voter v=new Voter(id,name,age);
				System.out.println(v);
				}
		}
			catch(Exception e){
				System.out.println(e);
			}
		

	}

}

---------------------------------------------------------------------------------------------------------------------------------
//60.Create Interface StudentFee and declare following method. 
//getFee() throws InvalidFeeException. This method ask fees from user and 
//throws exception if user enters invalid or negative fees Create class Student with members (name, fees) and 
//implement the StudentFee Interface.

package Excep;
import java.util.*;

interface StudentFee
{
	int getFee() throws Exception;
}
class StudentChild implements StudentFee{
	private int fee;
	public int getFee() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fee : ");
		fee=sc.nextInt();
		if(fee<=0 || fee >100000)
		{
			throw new Exception("Invalid fee");
		}
		return fee;
	}
}
public class Qst60Demo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			StudentChild c=new StudentChild();
			System.out.println(c.getFee());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
			
	}

}
---------------------------------------------------------------------------------------------------------------------------------
/*61.Create a Thread class to print following star (*) pattern on screen with delay 
  of 1 second between each * print. Number of lines in the pattern 
  should be passed to the constructor of Thread class.  
  *  * * * *  * * * * * * * * * * Use this class in main method and 
   ask user to enter number of lines to print.*/


//package com.p1;

import java.util.Scanner;

class MyThread extends Thread{
	int row;
	
	MyThread(int row){
		this.row = row;
	}
	
	@Override
	public void run() {
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
			
		}
	};
}

public class Q61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		MyThread m = new MyThread(row);
		m.start();
	}

}
-------------------------------------------------------------------------------------------------------------------------------
/*62Create a class that checks whether a given number is prime or not using  Runnable interface.*/


//package com.p1;

import java.util.Scanner;

class PrimeCheck implements Runnable{

	int num;
	
	
	PrimeCheck(int num){
		this.num = num;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i;
		for(i=2; i<num/2; i++) {
			if(num%i == 0) {
				System.out.println(+num+" is not a Prime number");
				break;
			}
		}
		if(num%i != 0) {
			System.out.println(num+" is a Prime number");
		}
	}
	
}

public class Q62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if it is a Prime number or not : ");
		int num = sc.nextInt();
		
		PrimeCheck p = new PrimeCheck(num);
		Thread t = new Thread(p);
		
		t.start();
	}

}

/*Q63.Write a program to count how many times character ‘t’ occurs in a file.*/

import java.io.*;

public class Q63 {

	public static void main(String[] args) throws IOException {
		FileOutputStream f1=new FileOutputStream("E:\\corejava\\DayFile2\\Demo3.txt");
		 String s=" Hi This is demo of FileOutputStream:\n ";
		 //f1.write(s); error as byte by byte
		 for(int i=0;i<s.length();i++)
		 {
			 f1.write(s.charAt(i));
			 
		 }
         f1.close();
         System.out.println("Success");
         int ch=-1;
         int count=0;
         FileInputStream f2=new FileInputStream("E:\\corejava\\DayFile2\\Demo3.txt");
         {
        	 while((ch=f2.read()) != -1)
            {
	           System.out.print((char)ch);
	           char ch1=(char)ch;
	           if(ch1=='t')
	           {
	        	   count++;
	           }
            }
        	
         }
         System.out.println(count);
         f2.close();
	}

}
-------------------------------------------------------------------------------------------------------------------------------
/*Q64.Write a program to count no of words in a text file and average word size.*/

import java.io.*;

public class Q64 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        FileInputStream f1=new FileInputStream("E:\\corejava\\DayFile2\\Demo3.txt");
              
	}
}
-------------------------------------------------------------------------------------------------------------------------------
/*Q65.Write a program to count number of bytes in a image file(jpeg/png/gif).  Also find how much time it will take to upload the file on server if internet speed is 256 bps(bits per second).*/


import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class Q65 {

	public static void main(String[] args) throws IOException{
		String dirName="C:\\Users\\Acer\\OneDrive\\Pictures\\Screenshots";
		ByteArrayOutputStream baos=new ByteArrayOutputStream(1000);
		BufferedImage img=ImageIO.read(new File(dirName,"dip.png"));
		ImageIO.write(img, "jpg", baos);
		baos.flush();
 
		String base64String=Base64.encode(baos.toByteArray());
		baos.close();
 
		byte[] bytearray = Base64.decode(base64String);
 
		BufferedImage imag=ImageIO.read(new ByteArrayInputStream(bytearray));
		ImageIO.write(imag, "jpg", new File(dirName,"snap.jpg"));
	}

}
-------------------------------------------------------------------------------------------------------------------------------
/*Q66.Write a program to store your shopping details in a binary file(shopping.dat) with information itemName, price, quantity. (Use ObjectOutputStream to store Item class object ).*/



//package p1;
import java.io.*;

class Shopping implements Serializable{
		private String itemName;
		private float price;
	        public int quantity;
		public Shopping () {

		}
		public Shopping(String itemName,float price,int quantity ) {
			this.itemName = itemName;
			this.price = price;
	                this.quantity=quantity;
		}
		@Override
		public String toString() {
			return itemName + " " + price + " " + quantity;
		}
		
	}
	
	public class Q66 {

		public static void main(String[] args) throws IOException,ClassNotFoundException {
			FileOutputStream f = 
					new FileOutputStream("D:\\core_java\\codes\\shopping.dat");
			
			ObjectOutputStream o = new ObjectOutputStream(f);
			
			o.writeObject(new Shopping("abc",2300f,5));
			o.close();	
			f.close();
			System.out.println("success");
		}

	}
-------------------------------------------------------------------------------------------------------------------------------
/*Q67.Write a program to read data from shopping.dat file creted in above problem and find total money spent on all shopping items. . (Use ObjectInputStream to read Item class object).*/

import java.io.*;

public class Q67 {

	public static void main(String[] args)throws IOException, ClassNotFoundException {
		FileInputStream f = 
				new FileInputStream("D:\\core_java\\codes\\shopping.dat");
		
		ObjectInputStream o = new ObjectInputStream(f);
		
		Shopping s = (Shopping)o.readObject();
		
		System.out.println(s); 
				
		f.close();
		System.out.println("success");
	}

}
