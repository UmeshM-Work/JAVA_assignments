/*
48.	Create an Abstract class Processor with int member variable data  
and method showData to display data value. 
Create abstract method process() to define processing of member data. 
Create a class  Factorial using abstract class Processor  to calculate 
and print factorial of a number by overriding the process method.
b. Create a class Circle using abstract class Processor to calculate 
and print area of a circle by overriding the process method.
Ask user to enter choice (factorial or circle area).  
Also ask data to work upon. Use Processor class reference to achieve 
this mechanism.
*/


import java.util.Scanner;

abstract class Processor{

    int data;
    void showData()
    {
        System.out.println(" Result ="+data);
    }

    abstract void process(int no);

}



class Factorial extends Processor{

    int Result=1;
    void process(int no)
    {
        for(int i=no;i>0;i--)
        {
            Result=Result*i;
        }
        data=Result;
    }
    
}

class Circle extends Processor{

    void process(int no)
    {
        int area=(int)(Math.PI*(Math.pow(no,2)));
        data=area;
    }

}

class Main{

    public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		while(true){
		  System.out.println("Choose from following option: \n1. Factorial\n2.Area Of Circle\n3.Exit");
		  int choice=sc.nextInt();
		
			     if(choice == 1)
				 {
					 System.out.println("Enter Factorial no.");
		             int no1=sc.nextInt();
		
		             Processor fact= new Factorial();
		             fact.process(no1);
		             fact.showData();
				 }
				 else if(choice == 2)
				 {
					System.out.println("Enter Radius of circle");
		            int no2=sc.nextInt();
		
		            Processor rad= new Circle();
		            rad.process(no2);
		            rad.showData();
				 }
				 else if(choice == 3)
				 {
					 System.exit(0);
				 }
				 else{
					 System.out.println("Invalid Choice");
				 }
		}		 
	}
}

/*49.	Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. create abstract method calcTax(). a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary. b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product. c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.*/
interface Taxable{
	
	float salesTax= 7f;
	float incomeTax= 10.5f;
	
	void calcTax();
	
}


class Employee implements Taxable{
	private int empId;
	private String name;
	private float salary;
	
	Employee(int empId,String name, float salary)
	{
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}
	
	public void calcTax()
	{
		System.out.println("Employee Income Tax= "+((incomeTax/100)*salary));
	}
	
	
}

class Product implements Taxable{
	private int pid;
	private float price;
	private int quantity;
	
	Product(int pid,float price,int quantity)
	{
		this.pid = pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	public void calcTax()
	{
		System.out.println("Sales Tax= "+((salesTax/100)*price));
	}
}

class Tax{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee Information: ");
		System.out.println("Enter Employee Id:");
		int empId= sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String name=sc.next();
		System.out.println("Enter Employee Salary: ");
		float salary=sc.nextFloat();
		
		Employee e= new Employee(empId,name,salary);
		e.calcTax();
		
		System.out.println("\nEnter Product Details: ");
		System.out.println("Enter Product Id: ");
		int pid=sc.nextInt();
		System.out.println("Enter Price: ");
		float price=sc.nextFloat();
		System.out.println("Enter Quantity: ");
		int quant= sc.nextInt();
		
		Product p=new Product(pid , price , quant);
		p.calcTax();
		
	}
	
}

/*50.	Explain the importance of toString() and equals() method of the Object class and override them on class Employee(empId,name,salary).  a. Create class for main method(say XYZ),and accept five employees information and store in an array. Also ensure if entered empId already exist or not (use equals method).  b. Display all employee info using toString method.*/



class Employee1{
	public int empid;
	private String name;
	private float salary;

	Employee1(int empid, String name, float salary){
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public String toString(){
		return "Employee Id:"+empid+" Employee Name: "+this.name+" Employee Salary: "+this.salary;
	}
	//obj.toString();

	public boolean equals(Object obj){
		Employee1 e = (Employee1) obj;
		return empid == e.empid;
	}

}

class EmpToStringMain{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size o array: ");
		int sz = sc.nextInt();

		Employee1 arr[] = new Employee1[sz];

		for(int i=0; i<arr.length; i++){
			System.out.println("Enter employeed id: ");
			int eid = sc.nextInt();
//refobj.equals(obj);
			for(int j=0; j<i; j++){
				System.out.println(arr[j].empid);
				if (eid==(arr[j].empid )){
					System.out.println("Already Exists");
					break;
				}
			}				
			
			System.out.println("Enter employeed Name: ");
			String ename = sc.next();
			System.out.println("Enter employeed Salary: ");
			float esal = sc.nextFloat();

			Employee1 e = new Employee1(eid, ename, esal);
			arr[i]=e;
			
		}

		for(Employee1 e : arr){
			System.out.println(e);
		}
		
	}
}