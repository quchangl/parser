Parser By Naveen Alok (naveen@itisindia.net)

Please refer to gpl.txt for licence. 

********************************************************************

1. What is parser?
A badword filter which can filter the given set of words from a string. Works with anything, Swing,Servlet, JSP etc.

What are it's application?
     For me its application is really nothing. For you there may be a world of things you can do with it You can use this code in your chat programs to filter those words which must be restricted in chat. You can use it in a mail servlet to filter unwanted words in your mail.
	There are many more things you can do with it, if can think more than this.


2. How to use? 
i. To use it just make a .class file with a list of badwords and pass it to the default constructor of
Parser
	String badWords[]={
	"shit","fuck","cunt","assole","sucks"
}
Eg :   Parser myParserObject = new Parser(badWords);

ii. Now pass your string which contains the messege.
String mess= "world sucks";
String newMess= myParser.checkBadOnes(mess);

ii. Now the filtered message is in newMess, use it as per your requirement.


3. Features
Advanced pattern matching, yes it not only matches words but also matches Pattern so you use less badwords and best performance.

Eg. If you have given a badword as suck, and someone likes to flaw by words :
sucker
Sucked 
Suckeeeeeeeeeeeeeeeeeeeer
Thissucker

All of the above words will be filtered automatically by a single word.


4. Its Free!!
    You will never have to pay for this code but do tell me where you are using this code so I may add more pssibilities in my thoughts too.


Have Nice Coding.

Regards
Naveen Alok

 
