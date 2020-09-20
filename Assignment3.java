//Assignment 3	

//26.Create an array of 17 elements in 5 rows.  And calculate sum of all elements.

import java.util.Scanner;
import java.util.Arrays;


class twentysix{

public static void main (String args[]){
Scanner sc = new Scanner(System.in);

int arr[][] = new int [5][];
		
		
for(int i=0; i<arr.length;i++){

System.out.println("Enter number of columns: ");
int sz =sc.nextInt();
arr[i] =new int[sz];

for(int j=0; j<arr[i].length;j++)
{
System.out.print("Enter a number: ");
arr[i][j]=sc.nextInt();
}
}

int sum = 0;
for(int a[] : arr){
for(int i : a){
System.out.print(i+" ");
sum+=i;	
}
System.out.println("");
}

System.out.println("Sum of array is: "+sum);

}
}

//27.Write a program to fine the smallest and greatest number present in the array of integer type

class twentyseven{

public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
System.out.println("enter size of array :");
int size=sc.nextInt();
int arr[]=new int[size];

for(int i=0;i<arr.length;i++)
{
System.out.println("enter elements:");
arr[i]=sc.nextInt();
}
int min=arr[0];
int max=arr[0];

for(int i=1;i<arr.length;i++)
{

if(arr[i]<min){
min=arr[i];
}
else if(arr[i]>max){
max=arr[i];
}

}

System.out.println("Minimum element in array is "+min);
System.out.println("Maximum element in array is "+max);

}

}


//28.Initialize one String type of array and print the elements using for each loop.



class twentyeight{

public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of the array: ");
int size = sc.nextInt();

String str[] = new String[size];

for(int i=0; i<str.length; i++)
{
str[i]=sc.next();
}
System.out.println("Entered String are: ");
for(String i : str){
System.out.println(i);
}
}
}


//29.Write a program to print the total number of one-D arrays in a two-D array and the number of elements in every one-D array present in the two-D arrays.


class twentynine{

public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter size of 2-D array: ");
int row = sc.nextInt();
int col = sc.nextInt();

int arr[][] = new int[row][col];
		
for(int i=0; i<arr.length; i++)
{
for(int j=0; j<arr[i].length; j++)
{
System.out.println("Enter a number: ");
arr[i][j]=sc.nextInt();
}
}

for(int i=0; i<arr.length; i++){
System.out.println("Size of "+i+" array is: "+(arr[i].length));
System.out.println("Elements in "+i+"array are:");
for(int j=0; j<arr[i].length; j++)
{
System.out.print(" "+arr[i][j]);			
}
System.out.println("");
}
		
}
}



//30.Create an integer type 2-D array of size [3X3]. Take the elements from the user and then calculate the sum of the elements present in the diagonal.


class thirty{

public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int arr[][] = new int[3][3];

for(int i=0; i<arr.length; i++)
{
for(int j=0; j<arr[i].length; j++)
{
System.out.print("Enter a number: ");
arr[i][j] = sc.nextInt();
}
}
		
int ldiag=0;
int rdiag=0;

for(int i=0; i<=arr.length;i++)
{
for(int j=0; j<arr.length; j++)
{
				
if(i==j){
ldiag+=(arr[i][j]);
rdiag+=(arr[(arr.length-1)-i][j]);
}
//(arr.length-1)-i

}
}
System.out.println("Sum of left diagonal: "+ldiag+"\nsum right diagonal: "+rdiag+"\nsum of diagonals: "+(ldiag+rdiag));
}
}





//31.Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members //rno and name. Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates Student class object and calls //setData() and showData() methods.


class Student{
private int sRollNo;
private String sName;

void setData(int roll, String name)
{
sRollNo = roll;
sName = name;
}

void showData()
{
System.out.println("Roll no: "+sRollNo+" Name: "+sName);
}

}

class StudentMain{

public static void main (String args[]){
Scanner sc = new Scanner(System.in);

System.out.print("Enter Student's name: ");
String sName = sc.nextLine();

System.out.print("Enter roll number: ");
int rollNo = sc.nextInt();

Student s =new Student();
		
s.setData(rollNo,sName);
s.showData();
}
}


//32.Modify the above program (no. 30) to count the no of Student objects created. [ In this program static variable is required ]

class Student{
private int sRollNo;
private String sName;
private static int objCount;

void setData(int roll, String name){
sRollNo = roll;
sName = name;
ObjCounter();
}
	
void ObjCounter()
{
objCount++;
}
	
int getObjCounter()
{
return objCount;
}
	
void showData()
{
System.out.println("Roll no: "+sRollNo+" Name: "+sName);
		
}

}

class ModiStudnt{

public static void main (String args[]){


Scanner sc = new Scanner(System.in);

System.out.print("Enter Student's name: ");
String sName = sc.nextLine();

System.out.print("Enter roll number: ");
int rollNo = sc.nextInt();

Student s =new Student();
		
s.setData(rollNo,sName);
//==================================================================
System.out.print("Enter Student's name: ");
sName = sc.next();

System.out.print("Enter roll number: ");
rollNo = sc.nextInt();

Student s1 =new Student();
		
s1.setData(rollNo,sName);

s.showData();
s1.showData();
System.out.println("object counter: "+s.getObjCounter());
}
}