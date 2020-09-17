//Assingment 1

//Run on cmd prompt by typing ---   javac Assignments1.java

//01.Write a program to print Hello World. Compile and run it using command prompt

import java.util.Scanner;
public class Assignment1{

public static void main(String args[]){
System.out.println("Assignment 1");

}
}


class Helloworld
{
public static void main(String args[]){
System.out.println("Hello world");
}
}



//02.Write a program to declare a variable named rollNo of integer type. Assign it a value (let say 100) to it and print the following statement roll no = 100 .


class two
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter roll number");
int roll=sc.nextInt();

System.out.println("roll no : "+roll);
}
}

//03.Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any //random value.
//A. y = x2 + 3x - 7 (print value of y) 
//B. y = x++ + ++x (print value of x and y) 
//C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
//D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]


class three
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter number x : ");
int x=sc.nextInt();
System.out.println("Enter number y : ");
int y=sc.nextInt();

System.out.println("Enter options");

int a=sc.nextInt();
switch(a)

{
	case 1:
	y=(x*x)+3*x-7;
	System.out.println("value of Y is "+y);
	break;
	case 2:
	y = x++ + ++x; 
	System.out.println("value of Y is "+y+" and x is "+x);
	break;
	case 3:
	int z = x++ - --y - --x  +  x++; 	
	System.out.println("value of Y is "+y+" and x is "+x+" and z is "+z);
	break;
	case 4:
	boolean q = true;
	boolean w= false; 
	boolean e = q && w || !(q || w); 	
	System.out.println("value of z is "+e);
	break;
		
}

}
}

//04.Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable

class four
{
public static void main(String args[]){

int a=300;
int b=300;
byte b1=(byte)a;
byte b2=(byte)b;

int c=b1+b2;
byte b3=(byte)c;
System.out.println("Add values : "+b3);
}
}

//05.Write a program that takes user’s name as command line argument and prints Welcome <entered user name>.


class five
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
String name=sc.next();

System.out.println("Welcome "+name);
}
}

//06.Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.

class six
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius");
double rad=sc.nextDouble();

double area=(3.14*(rad*rad));
double circ=(2*(3.14*rad));

System.out.println("The area of circle is : "+area);
System.out.println("The Circumference of circle is : "+circ);
}
}

//07.Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class.

class seven
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(": Enter the marks : ");
System.out.println("Enter the Sub1 :");
int sub1=sc.nextInt();
System.out.println("Enter the Sub2 :");
int sub2=sc.nextInt();
System.out.println("Enter the Sub3 :");
int sub3=sc.nextInt();
System.out.println("Enter the Sub4 :");
int sub4=sc.nextInt();
System.out.println("Enter the Sub5 :");
int sub5=sc.nextInt();

double total=(sub1+sub2+sub3+sub4+sub5)/5;

System.out.println(" percentage marks = "+total+"%");

}
}

//08.Write a program to find the simple interest. Take the principle amount, rate of interest and time from user using Scanner class.

class eight
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(": Simple interest : ");
System.out.println("Enter the principle amount :");
int p=sc.nextInt();
System.out.println("Enter the Rate of interest in % :");
int r=sc.nextInt();
System.out.println("Enter the term");
int t=sc.nextInt();

double SI=(p*r*t)/100;
System.out.println(" Simple interest = "+SI);

}
}

//09.Write a program to read the days (eg. 670 days) as integer value using Scanner class. Now convert the entered days into complete years, months and days and print //them


class nine
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(": Calender convertor ");
System.out.println("Enter the number of days : ");
int day=sc.nextInt();
int yr=0;
int month=0;
int days=0;
while(day>=365)
{
day-=365;
yr++;
}

while(day>=30)
{
day-=30;
month++;
}

while(day>=30)
{
day-=7;
days++;
}

System.out.println(" Calender : Year = "+yr+" | Months = "+month+" | Days = "+days);

}
}

//10.Write a program to convert temperature from Fahrenheit to Celsius. Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ]


class ten
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(": Temperature convertor ");
System.out.println("Enter temp in Farenheit : ");

int  f=sc.nextInt();

float cel = (5*(f-32))/9;

System.out.println("Temperature in Celcius = "+cel+" C");

}
}


//11.Write a program to swap two numbers without using third variable.

class eleven
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(": SWAP :");
System.out.println("Enter 1st number : ");
int  a=sc.nextInt();
System.out.println("Enter 2nd number : ");
int  b=sc.nextInt();

System.out.println("The numbers are : "+a+" and "+b);

a=a+b;
b=a-b;
a=a-b;



System.out.println("The numbers after swap : "+a+" and "+b);
}
}

//12.In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and //DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]

class twelve
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(": SWAP :");
System.out.println("Enter salary: ");
int  sal=sc.nextInt();


if(sal<10000)
{
float hra=(0.10F)*sal;
float DA=(0.90F)*sal;

float GS=sal+DA+hra;


System.out.println("The Gross salary is " +GS);
}

else
{
float hra=2000;
float DA=0.98F*sal;

float GS=sal+DA+hra;

System.out.println("The Gross salary is " +GS);
}

}
}






//13.Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  

class thirteen
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(": Greatest of three :");
System.out.println("Enter 1st number : ");
int  a=sc.nextInt();
System.out.println("Enter 2nd number : ");
int  b=sc.nextInt();
System.out.println("Enter 3rd number : ");
int  c=sc.nextInt();

if(a>b && a>c)
{
	System.out.println("The greatest of three "+a+" and "+b+" and "+c+" is --> "+a);
}
else if(b>a && b>c)
{
	System.out.println("The greatest of three "+a+" and "+b+" and "+c+" is --> "+b);
}
else
{
	System.out.println("The greatest of three "+a+" and "+b+" and "+c+" is --> "+c);
}

}
}



class thirteen2
{

	public static void main(String args[])
{
	
Scanner sc=new Scanner(System.in);
System.out.println(": Greatest of three :");
System.out.println("Enter 1st number : ");
int  a=sc.nextInt();
System.out.println("Enter 2nd number : ");
int  b=sc.nextInt();
System.out.println("Enter 3rd number : ");
int  c=sc.nextInt();


int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c); 
      
System.out.println("The greatest of three "+a+" and "+b+" and "+c+" is --> "+max);



}


}	


//14.Program to check that entered year is a leap year or not.

class fourteen
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(": Leap year or not :");
System.out.println("Enter the year to check : ");
int  year=sc.nextInt();


if(year%4==0 && year%100!=0 || year%400==0)
{
	System.out.println("The year"+year+" is a leap year");
}
else
{
	System.out.println("The year"+year+" is not a leap year");
}


}
}





//15.Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is eligible for marriage or not.

class fifteen
{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println(": Eligibility for marriage :");
System.out.println("Enter Gender in M and F: ");
String gender=sc.next();
System.out.println("Enter Age in number ");
int age=sc.nextInt();


if(age>20)
{
System.out.println("Congratualtions  for being eligible for marriage");
}
else{
System.out.println("Sorry  You are not eligible");
}

}
}



