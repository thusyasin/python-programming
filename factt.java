import java.io.*;
import java.util.*;
public class factt{
public static void main(String ar[]){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int fact=1,i;
for(i=1;i<=n;i++){
fact=fact*i;
}
System.out.print(fact);
}
}
