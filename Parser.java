/**
**************************************************************
** @ Author: Naveen Alok									**
** @ Date  : June 23, 2005									**
** @ File  : Parser.java									**
**															**
** A badword filter which can filter the given set of		**	
** words from a string. Works with anything, Swing,Servlet,	**
**	JSP.													**
**															**
**															**
** This file filters the bad words and returnds the 		**
** filtered output as String.								**
**															**
**	If you are using this code or modifying it please let 	**
**  me know.     *This Code is Free.*						**
**															**
**		naveen@itisindia.net								**					**
**************************************************************
*/

import java.util.*;

class Parser
{
	String errorWords[];
	Parser(){}
	
	//Constructor to initilize errorWords[] which contain 
	//words to be filtered.
	
	Parser(String badAll[])
	{
		errorWords= badAll;	
	}
	
	//This method checks for all the errorWords in the message
	
	String checkBadOnes(String message)
	{
		
	StringTokenizer st = new StringTokenizer(message);

    while (st.hasMoreTokens()) 
	{
		String sx=st.nextToken();
    for (int idx=0;idx<errorWords.length; idx++)
       { 
        if((errorWords[idx].equalsIgnoreCase(sx))||(sx.length()>errorWords[idx].length()?bruteCheck(errorWords[idx],sx):false))  
        {
      		message=ReplaceSubstring.oldReplace(message,sx,"***");   
        
    	}
      }
	}
    	return message;
	}
	
	//This method checks those words which are continious.
	//This is a pattern matching algorithm. If pattern is 
	//matched true is returned.
	
	static public boolean bruteCheck(String txt1,String txt2){
    boolean found = false;
    int limit = (txt2.length() - txt1.length() + 1);
    if (limit > 0){
      int i=0;
      while ((i < limit)&&(!found)){
        if (txt2.regionMatches(true, i, txt1, 0, txt1.length()))
          found = true;
        else
          i++;
      }
    }

    return found;
  }

	
}