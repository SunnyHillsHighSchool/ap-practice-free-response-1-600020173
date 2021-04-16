//written by Jonathan Hsing
import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
//create an arrayList
ArrayList<String> a = new ArrayList<String>();
//For each loop
for(String b : tokens){
//if a is open or closed delimiter, add it to the list
if(b.equals(openDel) || b.equals(closeDel))
a.add(b);
}
//return a
return a;
	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
		//create a counter variable
int c = 0;
//for each loop
for(String a: delimiters)
{
//if c < 0, return false
if(c < 0)
return false;
// if a is open, increase c 
if(a.equals(openDel))
c++;
//if a is closed, decrese c
if(a.equals(closeDel))
c--;
}
//if c = 0, return true
if(c == 0)
return true;
//otherwise return false
else
return false;
	}
}