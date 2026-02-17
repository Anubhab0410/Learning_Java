import java.util.Scanner;
public class checkInt{
public static void main(String args[]){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter three numbers:");
if (scanner.hasnextInt()){
int num1=scanner.nextInt();
if (scanner.hasnextInt()){
int num2=scanner.nextInt();
if (scanner.nextInt()){
int num3=scanner.nextInt();
int largest=num1;
if (num2>largest){
largest=num2;
}
if (num3>largest){
largest=num3;
}
System.out.println("The largest among the integers is :"+largest);
}
else{
System.out.println("Enter valid integers");
}}
else{
System.out.println("Enter valid integers");
}}
else{
System.out.println("Enter valid integers");
}
scanner.close();
}}
