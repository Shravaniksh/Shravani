import java.util.Scanner;
public class Vowel{
public static void main(String[] args){
char ch;
Scanner s=new Scanner(System.in);
System.out.println("Enter a character");
ch=s.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
System.out.println("it is vowel");
}
else{
System.out.println("it is a consonent");
}
}
}