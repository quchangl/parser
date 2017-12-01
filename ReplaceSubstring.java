/**
**************************************************************
** @ Author: Naveen Alok									**
** @ Date  : June 23, 2005									**
** @ File  : ReplaceSubstring.java							**
**															**
** This program replaces a given pattern from a string		**	
** with new characters. This program is part of Parser 		**
** application.												**
**															**
**															**
**															**
**	If you are using this code or modifying it please let 	**
**  me know.	*This Code is Free.*						**
**															**
**		naveen@itisindia.net								**					**
**************************************************************
*/


public final class ReplaceSubstring {

public static String oldReplace(
	final String aInput,
	final String aOldPattern,
	final String aNewPattern
	){
	if ( aOldPattern.equals("") ) {
	return "bad Message.";
	}

	final StringBuffer result = new StringBuffer();
	int startIdx = 0;
	int idxOld = 0;
	while ((idxOld = aInput.indexOf(aOldPattern, startIdx)) >= 0) {
	result.append( aInput.substring(startIdx, idxOld) );
	result.append( aNewPattern );
	startIdx = idxOld + aOldPattern.length();
	}
	result.append( aInput.substring(startIdx) );
	return result.toString();
}


}