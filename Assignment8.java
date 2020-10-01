import java.util.Scanner;

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


