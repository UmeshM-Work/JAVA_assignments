import java.util.Scanner;
import java.util.Arrays;
//Run the command ::: javac Assignment2
//Then run ::: java _____ -->question number.
//16.Write a program to print table of any entered number using loop.

class sixteen
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
System.out.println("Table for given number is");
for(int i=1;i<11;i++)
{
int z=n*i;
System.out.println(+n+"x"+i+"="+z);
}
}
}

//17.Write a program to reverse a given number.

class seventeen
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n=sc.nextInt();
int rev=0;
System.out.println("the number is : "+n);
while(n>0)
{

int temp=n%10;
rev=rev*10+temp;
n/=10;

}

System.out.println("Reverse of the number is : "+rev);

}
}

//18.Program to check whether number is prime or not.

class eighteen
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to check prime or not");
int n=sc.nextInt();
int m=2;
int c=0;
for(int i=1;i<=n;i++)
{
if(n%i==0){

c++;
}	
}

if(c==2){

System.out.println("Its prime");

}
else{

System.out.println("Its not prime");
}


}
}

//19.Calculate  series : 12+22+32+42+.........+n2

class nineteen
{

public static void main (String args[]){

Scanner sc=new Scanner(System.in);

System.out.println("Enter a number to print series upto");
int no=sc.nextInt();

int a=12;
int sum=12;
System.out.print(a);
for(int i=1;i<no;i++)
{
a+=10;
System.out.print("+"+a);
sum+=a;

}
System.out.println("\n Sum is : "+sum);


}

}


//20.Print all prime numbers between two given numbers. [ break continue ]

class twenty
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);


System.out.println("Enter range between");
System.out.println("Enter first range");
int lb=sc.nextInt();
System.out.println("Enter last range");
int ub=sc.nextInt();
int count;

System.out.println("prime numbers between "+lb+" and "+ub+" are: ");

for(int i=lb;i<ub;i++)
{
count=0;
for(int j=1;j<=i;j++){

if(i%j==0){

count++;

}
}
if(count==2){
System.out.println(i+" ");
}

}




}

}


//21.Program to show sum and average of 10 element array. Accept array elements from user. 

class twentyone
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int arr[]=new int[10];
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter Numbers : ");
arr[i]=sc.nextInt();

}
int sum=0;
for(int i:arr)
{
sum+=i;
}
System.out.println("Sum is: "+sum+"\naverage is : "+(sum/arr.length));

}

}

//22.Sort a ten element array in descending order.



class twentytwo
{

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements");
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{

System.out.println("Enre an number");
arr[i]=sc.nextInt();

}

//Arrays.sort(arr);

System.out.println("Descending order : ");
for(int i=(arr.length-1);i>=0;i--)
{

System.out.print(arr[i]+" ");
}

}
}

//23.Write a program to reverse the array elements.

class twentythree
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);



int size=sc.nextInt();
int arr[]= new int[size];

for(int i=0;i<size;i++)
{
System.out.print("Enter an number: ");
arr[i]=sc.nextInt();
}

int last =arr.length-1;

for(int i=0;i<arr.length/2;i++){
int temp=arr[i];
arr[i]=arr[last];
arr[i]=temp;
last--;

}

for(int i:arr)
{
System.out.print(i+" ");
}


}

}


//


//24.Write a program to search an element in the array.

class twentyfour
{

public static void main (String args[]){

Scanner sc = new Scanner(System.in);
			
System.out.println("Enter size of the array: ");
int size = sc.nextInt();

int arr[] = new int[size];

for(int i=0; i<size; i++)
{
System.out.print("Enter a number: ");
arr[i]=sc.nextInt();
}

System.out.println("Enter number to search: ");
int srch = sc.nextInt();

for(int i=0; i<size; i++)
{
if(arr[i]==srch){
System.out.println("Element "+srch+" found at index "+(i+1));
break;
}
else
{ System.out.println("Not found");
}
}			

}

}


//25.Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.

class twentyfive
{

public static void main(String args[])
{

Scanner sc=new Scanner (System.in);

System.out.println("Enter the size of an array: ");
int size =sc.nextInt();
int arr[]=new int[size];

for(int i=0;i<size;i++){

System.out.print("Enter a number : ");
arr[i]=sc.nextInt();
}
int even=0;
int odd=0;

for(int i=0;i<size;i++){

if(arr[i]%2==0){
even+=arr[i];
}else
{
odd+=arr[i];

}

}
System.out.println("sum of even elements: "+even);
System.out.println("sum of odd elements: "+odd);
}

}


