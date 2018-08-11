import java.io.*;
import java.util.*;
public class revnum{
public static void main(String ar[]){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int t=0,x;
while(n!=0){
x=n%10;
t=t*10+x;
n=n/10;
}
System.out.print(t);
}
}
