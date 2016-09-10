import java.util.Scanner;
 
class Positive{
public static void main(String[] args){
int num;
System.out.println("Enter a number");
Scanner a=new Scanner(System.in);
num=a.nextInt();
if(num%2==0)
System.out.println("The num is even");

else
System.out.println("num is odd");

}
}
