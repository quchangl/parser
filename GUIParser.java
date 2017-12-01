/**
**************************************************************
** @ Author: Naveen Alok									**
** @ Date  : June 23, 2005									**
** @ File  : GUIParser.java									**
**															**
** This program is an example for using the Parser.java		**	
** Program.											 		**
**															**
**															**
**	If you are using this code or modifying it please let 	**
**  me know.	*This Code is Free.*						**
**															**
**		naveen@itisindia.net								**					**
**************************************************************
*/

// stupid update
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class GUIParser implements ActionListener
{
	JFrame mainFrame = new JFrame("Parser");
	JButton clickButton = new JButton("Click");
	JTextArea mainTextArea = new JTextArea();	
	Container containAll;
	Parser myParser;
	
	//Initilize this string with choice of your badwords
	//these are for example
	
	String words[]={
		"shit","fuck","cunt","assole","suck"
	};
	
	void startParsing()
	{
		
		// Here the method of parser class is called and output
		// is stored in mainTextArea.
		
		mainTextArea.setText(
			myParser.checkBadOnes(
				mainTextArea.getText()
		));
	}
	
	//This method builds the GUI of the program.
	
	GUIParser()
	{
		myParser = new Parser(words);
		containAll = mainFrame.getContentPane();
		containAll.add(new JScrollPane(mainTextArea),"Center");
		containAll.add(clickButton,"South");
		clickButton.addActionListener(this);
		mainFrame.setSize(300,300);
		mainFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ev)
	{
		try{
		if(ev.getSource()==clickButton)
			startParsing();
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	}
	
	public static void main(String arg[])
	{
		new GUIParser();
	}
}