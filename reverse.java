import java.util.*;
import java.io.*;
public class reverse{
public static void main(String ar[]){
Scanner s=new Scanner(System.in);
String s1=s.nextLine();
char c[]=s1.toCharArray();
for(int i=c.length-1;i>=0;i--){
System.out.print(s.charAt(i));
}
}
}
