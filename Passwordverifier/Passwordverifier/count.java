import java.io.*;

class count
{
void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
System.out.println("enter the String");
String s=br.readLine();
int i,l,c1=0,c2=0,c3=0,sp=0;
char ch;
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(Character.isLetter(ch))
++c1;
else if(Character.isDigit(ch))
++c2;
else if(ch==' ')
++sp;
else
++c3;
}
System.out.println("no of Letter="+c1);
System.out.println("no of Digit="+c2);
System.out.println("no of Spaces="+sp);
System.out.println("no of Symbol="+c3);
}
}