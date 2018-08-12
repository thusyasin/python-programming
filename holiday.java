import java.io.*;
import java.util.*;
public class holiday{
public static void main(String ar[]){
Scanner s=new Scanner(System.in);
String ss=s.nextLine().toLowerCase();
if(ss.equals("sunday")||ss.equals("saturday")){
System.out.print("yes");
else
{
System.out.print("no");
}
}
}
