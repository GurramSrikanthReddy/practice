public class TernaryOperatorDemo{

	public static void main(String args[]){

          int a=30,b=50,c=70;
          
          int max1 = (a>b) ? a : b;
          System.out.println("The maximum value of two numbers using ternary operator : " +max1);

          int max2 = (a>b) ? ((a>c)? a:c) : ((b>c)? b:c);
          System.out.println("The maximum value of three numbers using ternary operator : " +max2);
         }
}
