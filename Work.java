import java.io.*;
public class Work
{
public static void main(String[] args)throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str = br.readLine();
if(str.equalsIgnoreCase("Sunday"))
{
System.out.println("false");
}
else if(str.equalsIgnoreCase("monday") || str.equalsIgnoreCase("tuesday") || str.equalsIgnoreCase("wednesday") || str.equalsIgnoreCase("thursday") || str.equalsIgnoreCase("friday") || str.equalsIgnoreCase("saturday"))
{
	System.out.println("true");
}
else
{
	System.out.println("Not Valid");

}
}
}
