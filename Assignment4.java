//33.Write a program to demonstrate functionalities of this keyword in java. 
import java.util.Scanner;
class keyword{
private int empid;
private String name;    //instance variable

void set(int empid,String name)
{
    this.empid=empid;       //this-->stores the refrence values of current object
    this.name=name;
}

void show()
{

    System.out.println(empid);
    System.out.println(name);
}

keyword()
{
    this(100,"mukesh");

System.out.println("Hello");

}

keyword(int empid,String name)
{
    System.out.println(empid+" "+name);
}


}


class keywordDemo1{

public static void main(String args[])
{

keyword s1=new keyword();
s1.set(100,"umesh");
s1.show();


}


}


//34.Create a class Circle that has two data members, one to store the radius and another to store area and three methods first init() method to input radius from user, second calculateArea() method to calculate area of circle and third display() method to display values of radius and area. Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.

class Circle{

    private float r;
    private double a;

    void init(float r)
    {
      
     this.r=r;
     

    }

   double calculateArea()
   {
        a=r*r*3.14;
         return a;
    }

    void display(){
        System.out.println("the radius is "+r);
        System.out.println("The area is "+a);

    }



}

class CircleDemo{

public static void main(String args[])
{
    Circle c1=new Circle();
    System.out.println("Enter radius");
    Scanner sc= new Scanner(System.in);
    float r=sc.nextFloat();
    c1.init(r);
    c1.calculateArea();
    c1.display();

}


}

//35.Create a class MathOperation that has four static methods. add() method that takes two integer numbers as parameter and returns the sum of the numbers. subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. multiply() method that takes two integer numbers as parameter and returns the product. power() method that takes two integer numbers as parameter and returns the power of first number to second number. Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and prints the return values of every method.


class  MathOperation{


static float add(float i,float j){

    return i+j;
   

}

static float subtract(float i,float j){

    return i-j;
   

}
static float multiply(float i,float j){

    return i*j;
   

}


static void show(float r){

    System.out.println(r);
}


}


class Demo{

public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter first number :");
    float a=sc.nextFloat();
    System.out.println("Enter second number :");
    float b=sc.nextFloat();
    System.out.println(": Operations :");
    System.out.println(" ");
    System.out.println("1 : Add");
    System.out.println("2 : Subtract");
    System.out.println("3 : Multiplication");
    System.out.println("4 : Power");
    System.out.println(" ");
    System.out.println("Choose option");
    int c=sc.nextInt();
switch(c){

    case 1:

    float sum=MathOperation.add(a,b);
    System.out.print("The sum is : ");
    MathOperation.show(sum);
    break;

    case 2:

    float subtract=MathOperation.subtract(a,b);
    System.out.print("The subtraction is : ");
    MathOperation.show(subtract);
    break;

    case 3:

    float multiply=MathOperation.multiply(a,b);
    System.out.print("The multiplication is : ");
    MathOperation.show(multiply);
    break;
}


}

}

//36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
//a.	 two integers 
//b.	 three floats 
//c.	 all elements of array 
//d.	one double and one integer 


class MathOperation1{

    void multiply(int i,int j)
    {
        
    System.out.println("The multiplication of "+i+" and "+j+" is "+(i*j));

    }
    void multiply(float i,float j,float k)
    {
        
    System.out.println("The multiplication of "+i+" and "+j+"  and "+k+" is "+(i*j*k));

    }

    void multiply(int a)
    {
        int arr[]=new int[a];
       
        for(int i=0;i<arr.length;i++)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter elements : ");
            arr[i]=sc.nextInt();
          
        }
        System.out.println(" ");
        int multiply=1;
        for(int x:arr)
        {   
            multiply=multiply*x;
        }
      
        System.out.print(" ");
        System.out.print("The multiplication is "+multiply);
        System.out.print(" ");


    }



    void multiply(double i,int j)
    {
        
    System.out.println("The multiplication of "+i+" and "+j+" is "+(i*j));

    }



}


class Demo1
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Multiplication");
        System.out.println("a. two integers");
        System.out.println("b. three integers");
        System.out.println("c. all emlements of array integers");
        System.out.println("d. one double one int");
        System.out.println(" ");
        System.out.print("Enter from the above three choices : ");
        int ch=sc.nextInt();
        

        switch(ch){

            case 1:
            System.out.print("Enter First number : ");
            int a=sc.nextInt();
            System.out.print("Enter Second number : ");
            int b=sc.nextInt();
            System.out.println(" ");
    
            MathOperation1 m1=new MathOperation1();
            m1.multiply(a,b);
            break;

            case 2:
            System.out.print("Enter First number : ");
            float a1=sc.nextFloat();
            System.out.print("Enter Second number : ");
            float b1=sc.nextFloat();
            System.out.print("Enter third number : ");
            float c=sc.nextFloat();
            System.out.println(" ");
            MathOperation1 m2=new MathOperation1();
            m2.multiply(a1,b1,c);
            break;

            case 3:
            System.out.println("enter the size of array");
            int size=sc.nextInt();
            MathOperation1 m3=new MathOperation1();
            m3.multiply(size);
            System.out.print(" ");
           
          
            break;

            case 4:
            System.out.print("Enter First number : ");
            double a2=sc.nextDouble();
            System.out.print("Enter Second number : ");
            b=sc.nextInt();
            System.out.println(" ");
    
            MathOperation1 m4=new MathOperation1();
            m4.multiply(a2,b);
            break;



        }


    }

}



//37.   Create a class Person with properties (name and age) with following features. 
//a.    Default age of person should be 18.
//b.    A person object can be initialized with name and age.
//c.    Method to display name and age of person
//      Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.

class Person{

    static int age=18;
    private String name;

    void input(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

  public void Display(){
       
        System.out.println("The name is : "+this.name);
        System.out.println("The name is : "+this.age);

    }

}


class PersonDemo{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
   
    Person a=new Person();
    a.Display();
    System.out.print("Enter your name : ");
        String name =sc.next();
        System.out.print("Enter your age : ");
        int age =sc.nextInt();
        
        a.input(name,age);
        a.Display();
    
     
}

}



//38.Create a class Employee with three data members (empNo, salary and totalSalary) and following features.

class Employee{

    static int empNo;
    int salary;
   static int totalSalary;

    void input(int salary)
    {
        empNo++;
        this.salary=salary;

        totalSalary+=salary;
    }

    void display()
    {
        System.out.println("Employee Id : "+empNo);
        System.out.println("Employee salary : "+salary);
        System.out.println(" ");
      

    }
  static public void display2(){
        System.out.println("Total salary : "+totalSalary);
    }


}


class EmployeeDemo{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee details");
       
        
        System.out.print("Enter the number of employees ");
        int n=sc.nextInt();
        System.out.println(" ");
        
        for(int i=0;i<n;i++)
        {
       
        System.out.print("Employee salary : ");
        int salary=sc.nextInt();
        System.out.println(" ");

        Employee abc=new Employee();
        abc.input(salary);
        abc.display();
        }
      Employee bcd=new Employee();
      bcd.display2();
       





    }

    
}


/* 39.	Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. ( amount spent on single product = price of product * quantity of product ) 
*/

    class Product{

        private int pid;
        private float price;
        private int quant;


        void Product(int pid,float price,int quant)
        {
           this.pid=pid;
           this.price=price;
           this.quant=quant;
        }

        void display()
        {
            System.out.println("Total amount on this product with pid "+pid+" is "+(quant*price));
        }

     static void hspid(Product arr[])
        {   Product max=arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i].price>max.price)
                {
                    max=arr[i];
                }

            }
            System.out.println(" ");

            System.out.println("The product with highest price : "+max.pid+" with max price "+max.price);

        }

       static void total(Product arr[])
        {   float total=0;
            for(int i=0;i<arr.length;i++)
            {
               total+=arr[i].price*arr[i].quant;

            }
            System.out.println(" ");
            System.out.println("The total cost of whole products is "+total);

        }




 }

    class ProductDemo{
        public static void  main(String args[])
        {
        Scanner sc= new Scanner(System.in);
        System.out.println("OBJECTS");
        Product arr[]=new Product[2];
        System.out.println("Enter the details for 5 objects :");
        for(int i=0;i<arr.length;i++)
            {   
                System.out.print("Enter the PID number : ");
                int pid=sc.nextInt();
                System.out.print("Enter the price : ");
                float price=sc.nextFloat();
                System.out.print("Enter the quantity : ");
                int quant=sc.nextInt();
                System.out.println(" ");

                Product abc=new Product();
                abc.Product(pid,price,quant);

             // Product a=new Product(pid,price,quant);
                abc.display();
                System.out.println(" ");

                arr[i]=abc;
            
            }
            Product.hspid(arr);
            Product.total(arr);
       
        }
        
    }






/*40.	Create a class Student having data members name, roll no., age and score. Write a program to accept 10 records of student and store them in an array. And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100].
*/


class Student
{
private String name;
private int rollNo;
private int age;
private int score;

Student(String name,int rollNo,int age,int score){

    this.name=name;
    this.rollNo=rollNo;
    this.age=age;
    this.score=score;

}
public static Student[] sort(Student s[]){
    Student temp;
	for(int i=0;i<s.length;i++)	
{
	   for(int j=i+1;j<s.length;j++)
		if(s[i].score > s[j].score){
			temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			}
		}
		

	System.out.println("Student with score<50 are: ");
	for(int i=0;i<s.length;i++){
	   if(s[i].score<50){
		s[i].display();
		}
	}

	System.out.println("Student with score>=50 and <65 are: ");
	for(int i=0;i<s.length;i++){
	   if(s[i].score>=50 && s[i].score<65){
		s[i].display();
		}
	}

	System.out.println("Student with score>=65 and <80 are: ");
	for(int i=0;i<s.length;i++){
	   if(s[i].score>=65 && s[i].score<80){
		s[i].display();
		}
	}

	System.out.println("Student with score>=80 and <100 are: ");
	for(int i=0;i<s.length;i++){
	   if(s[i].score>=80 && s[i].score<100){
		s[i].display();
		}
	}
	
	return s;

	}



void display()
{
    System.out.println("Name : "+this.name+" Rollno : "+this.rollNo+" Age : "+this.age+" score : "+this.score);

}
}

class Studentdemo
{

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Student s[]=new Student[3];

        for(int i=0;i<3;i++)
        {
            System.out.print("Enter name : ");
            String name=sc.next();
            System.out.print("Enter roll : ");
            int roll=sc.nextInt();
            System.out.print("Enter age : ");
            int age=sc.nextInt();
            System.out.print("Enter score : ");
            int score=sc.nextInt();
            System.out.println(" ");

            Student s1= new Student(name,roll,age,score);

            s[i]=s1;



        }


        for(Student i : s)
        {
            i.display();
           
        }
        Student.sort(s);


    }

}