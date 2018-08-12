import java.util.*;
public class squ{
public static void main(String ar[]){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a,i,sum=0;
int b[]=new int[50];
String s=Integer.toString(n);
for(i=0;i<s.length();i++){
a=Integer.parseInt(Character.toString(s.charAt(i)));
b[i]=a*a;
sum=sum+b[i];
}
System.out.print(sum);
}
}
