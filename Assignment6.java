/*44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and another printSalary() to print salary.
-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)
-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. Override input() method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )
*/

import java.util.Scanner;

class Faculty{
    int facultyId;
    int salary;

    void input(int facultyId){

        this.facultyId=facultyId;
    }

    void printSalary(){

        System.out.println("Salary : "+this.salary);

    }



}

class FullTimeFaculty extends Faculty {

    int basicSalary;
    int allowance;


    void input(int facultyId)
    {
        super.input(facultyId);
    }

    FullTimeFaculty(int basicSalary,int allowance)
    {
        this.allowance=allowance;
        this.basicSalary=basicSalary;
        Calculate();

    }

    void Calculate(){
        int res=this.basicSalary+this.allowance;

        System.out.println("Fultime Salary "+res);
    }

}

class PartTimeFaculty extends Faculty{

    int workingHour;
    int ratePerHour;

    void input(int facultyId)
    {
        super.input(facultyId);
    }

    public PartTimeFaculty(int workingHour,int ratePerHour)
    {
        this.workingHour=workingHour;
        this.ratePerHour=ratePerHour;
        Calculate2();

    }

    void Calculate2()
    {
        int res2=this.workingHour*this.ratePerHour;
        System.out.println("part time salary "+res2);

    }

}

class FacultyM{


    public static  void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter data Full time faculty");
        System.out.println("Enter Faculty id ");
        int facultyId=sc.nextInt();
        System.out.println("Enter Basic salary");
        int basicSalary=sc.nextInt();
        System.out.println("Enter allowance ");
        int allowance=sc.nextInt();

        Faculty f=new FullTimeFaculty(basicSalary,allowance);
        f.input(facultyId);

        System.out.println("Enter data Part time faculty");
        System.out.println("Enter Faculty id ");
         facultyId=sc.nextInt();
        System.out.println("Enter working hour ");
        int workingHour=sc.nextInt();
        System.out.println("Enter rate per hour ");
        int ratePerHour=sc.nextInt();


        Faculty f1=new PartTimeFaculty(workingHour,ratePerHour);
        f1.input(facultyId);
    }

}



/*45.	Create a class Student with two members : rollno and percentage. Create default and parameterized constructors. Create method show() to display information. Create another class CollegeStudent inherits Student class. Add a new member semester to it. Create default and parameterized constructors. Also override show() method that calls super class show() method and displays semester. Create another class SchoolStudent inherits Student class. Add a new member className(eg 12th ,10th etc.) to it. Create default and parameterized constructors. Also override show() method that calls super class show() method and displays className. Create a class( say Demo) with main method that carries out the operation of the project : -- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent) --create two CollegeStudent  and three SchoolStudent objects and store them inside the array -- display all records from the array -- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. --count how many students are having A grade, if for A grade percentage >75. */



class Student{
	private static int rno;
	private  int rollno;
	private int percentage;
	
	Student(){
		this.rollno = ++rno;	
	}

	Student(int percentage ){
		this.rollno = ++rno;
		this.percentage = percentage;
	}

	void show(){
		System.out.println(" Rollno: "+rollno+" percentage: "+this.percentage);
	}
	
	int getRollNo(){
		return this.rollno;
	}
	
	int getPercentage(){
		return this.percentage;
	}


}




class CollegeStudent extends Student{
	private int sem;
	
	CollegeStudent(){
		this.sem = 1;	
	}

	CollegeStudent(int percentage ,int sem){
		super(percentage);
		this.sem =sem;
	}

	void show(){
		super.show();
		System.out.println(" Semester: "+this.sem);
	}


}

class SchoolStudent extends Student{
	private int className;

	SchoolStudent (){
		this.className = 1;
	}

	SchoolStudent (int cent,int className){
		super(cent);
		this.className = className;
	}

	void show(){
		super.show();
		System.out.println(" Class name: "+this.className);
	}

}
class ColgDemo{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		Student s[] = new Student[4];

		for(int i=0; i<2; i++){//0 1

			System.out.println("Enter percentage: ");
			int cent = sc.nextInt();
			System.out.println("Enter Semseter: ");
			int sem = sc.nextInt();

			Student s1 = new CollegeStudent(cent,sem);
			
			s[i]= s1;
		
		}

		for(int i=2; i<4; i++){// 2 3

			System.out.println("Enter percentage: ");
			int cent = sc.nextInt();
			System.out.println("Enter class Name: ");
			int className = sc.nextInt();

			
			Student s1 = new SchoolStudent(cent,className);
			s[i]= s1;
			
	
			 
		}
		
		int count75=0;
		System.out.println(s.length);
		for(int i=0; i<s.length; i++){
			
			if(s[i].getPercentage() >75){
				count75++;
			}
			s[i].show();
		}
		
		System.out.println("Enter a roll no to search: ");
		int srch = sc.nextInt();
		
		for(int i=0; i<s.length; i++){
			if(srch == s[i].getRollNo()){
				System.out.println("Enter a roll no to search: ");
				s[i].show();
			}
		}
		
		for(int i=0; i<s.length; i++){
			if(s[i] instanceof SchoolStudent){
				System.out.println("School type: ");
				s[i].show();
			}
			else{
				System.out.println("College type: ");
				s[i].show();
			}
		}
		

		
		System.out.println("\n\n"+"Students with grade A as a score: "+count75);
		
		
	
		
	}
	
}





//46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting.

class Parent{
	void Show(){
		System.out.println("in parent");
	}




}

class Child extends Parent{
	void Show(){
		System.out.println("in Child");
	}
	void ShowChild(){
		System.out.println("in CHILD CHILD");
	}
}

class InstOF{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		Parent p = new Child();	//updcasting
		//p.Show();



		if ( p instanceof Child ){
			Child c = (Child) p;
			c.ShowChild(); 
		}
		else{
			System.out.println("Error");
		}
		
	}
	
}

//47.	Create a program to demonstrate constructor chaining.

class ConstrA{
	ConstrA(){
		this(10);
		System.out.println("Calling constructor A");
	}
	ConstrA(int a){
		System.out.println("Calling constructor A having parameter: "+a);
	}

}

class ConstrB extends ConstrA{
	ConstrB(){
		this(5);
		System.out.println("Calling constructor B");	
	}
	ConstrB(int a){
		System.out.println("Calling constructor B having parameter: "+a);
	}

}


class ChainingMain{
	public static void main(String args[]){
		ConstrB b = new ConstrB();
		
		
	}
}