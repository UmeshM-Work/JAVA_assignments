//Assignment 5


import java.util.Scanner;

// 41.	Write a program to demonstrate this() construct functionality.
class Demo{

    Demo(){

        this(10,20);
        System.out.println("no-param");

    }

    Demo(int i,int j)
    {
        System.out.println("param");

    }

}

class DemoDemo{

    public static void main(String args[])
    {
        Demo a=new Demo();

    }
}


//42.	Create a class Tile to store the edge length of a square tile, and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.


class Tile{
    int es;

   

    int set(int es){

        return this.es=es;
      
    }

  public  int Tarea(){
        

        return (this.es)*(this.es);
      
    }

}

class Floor{

    private int a;
    private int b;

   void set(int a,int b)
   {
        this.a=a;
        this.b=a;
   } 

   int Farea(){
        return (this.a)*(this.b);

   }
   void totalTiles(Tile t)
   {    System.out.println("Considering the area");
       double Tilearea=t.Tarea();
       double FloorArea=Farea();

    System.out.println("The total Tiles required : "+(FloorArea/Tilearea));
   }

}

class CoverFloor{

    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);

       System.out.print("Enter the edge length of square tile :");
        int es=sc.nextInt();
        
        System.out.print("Enter the edge length of rectangular floor : ");
        int a=sc.nextInt();
        System.out.print("Enter the edge width of rectangular floor : ");
        int b=sc.nextInt();

        Tile t=new Tile();
        t.set(es);
        t.Tarea();

        Floor f=new Floor();
        f.set(a,b);
        f.totalTiles(t);

    }
}



//43.	Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default constructor that initializes instance variables with some values and a parameterized constructor that takes values for all instance variables and stores them in instance variables. Now create a method named show()  to print OneBHK’s instance variable values.
//Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area. Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all instance variables. Override show() method to print all data member information.Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. Also print total amount of all flats. 


class OneBHK
{
    double roomArea;
    double hallArea;
    double price;
     static double tprice;

    OneBHK(){
        this(200,200,100d);
    }
    OneBHK(double r1,double h1,double p1){

        this.roomArea=r1;
        this.hallArea=h1;
        this.price=p1;
        tprice+=price;
    }

    void show(){
        System.out.print("Room area : "+this.roomArea+" Hall area : "+this.hallArea);


    }
    public static void Calculate(){

        System.out.print("total amount : "+tprice);

    }


}

class TwoBHK extends OneBHK
{
    double room2Area;

    TwoBHK(){
        super();
      room2Area=200;

    }

    TwoBHK(double r1,double h1,double room2Area,double p1 ){

        super(r1,h1,p1);
        this.room2Area=room2Area;

    }

    void show(){

        super.show();
        System.out.println(" Room 2 area : "+this.room2Area);
    }
}

class demo{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter room one area : ");
            double r1=sc.nextDouble();
            System.out.print("Enter room hall area : ");
            double h1=sc.nextDouble();
            System.out.print("Enter room two area : ");
            double r2=sc.nextDouble();
            System.out.print("Enter Price : ");
            double p1=sc.nextDouble();

            TwoBHK ab=new TwoBHK(r1,h1,r2,p1);
            ab.show();

        }
        OneBHK.Calculate();


    }
}


