


import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.JOptionPane;
/*
 <applet code="Sudoku.class" width=350 height=350>
 </applet>
 */
 

public class Sudoku extends Applet implements TextListener{
	//declaring 81 textfields
	TextField textfield1, textfield2, textfield3, textfield4, textfield5, textfield6, textfield7, textfield8, textfield9, textfield10, textfield11, textfield12, textfield13, textfield14, textfield15, textfield16, textfield17, textfield18, textfield19, textfield20, textfield21, textfield22, textfield23, textfield24, textfield25, textfield26, textfield27, textfield28, textfield29, textfield30, textfield31, textfield32, textfield33, textfield34, textfield35, textfield36, textfield37, textfield38, textfield39, textfield40, textfield41, textfield42, textfield43, textfield44, textfield45, textfield46, textfield47, textfield48, textfield49, textfield50, textfield51, textfield52, textfield53, textfield54, textfield55, textfield56, textfield57, textfield58, textfield59, textfield60, textfield61, textfield62, textfield63, textfield64, textfield65, textfield66, textfield67, textfield68, textfield69, textfield70, textfield71, textfield72, textfield73, textfield74, textfield75, textfield76, textfield77, textfield78, textfield79, textfield80, textfield81;
	//initialing the correct answers given as 0
	static int green=0;
	
	public void init()
	{
		try
		{
			//setting the layout as 9X9 grid


			setLayout(new GridLayout(9, 9));
			Color c = new Color(220, 170, 190);
			
			//creating 81 text fields and adding to the applet
			//some textfields are provided with initial values are made uneditable
			//setColumns is used here to give each textfield a unique no so that it can be identified later
			
			textfield1 = new TextField("6");
			textfield1.setColumns(1);
			textfield1.setEditable(false);
			add(textfield1);
			textfield2 = new TextField("");
			textfield2.setColumns(2);
			add(textfield2);
			textfield3 = new TextField("");
			textfield3.setColumns(3);
			add(textfield3);
			textfield4 = new TextField("1");
			textfield4.setColumns(4);
			textfield4.setEditable(false);
			textfield4.setBackground(c);
			add(textfield4);
			textfield5 = new TextField("");
			textfield5.setColumns(5);
			textfield5.setBackground(c);
			add(textfield5);
			textfield6 = new TextField("");
			textfield6.setColumns(6);
			textfield6.setBackground(c);
			add(textfield6);
			textfield7 = new TextField("2");
			textfield7.setColumns(7);
			textfield7.setEditable(false);
			add(textfield7);
			textfield8 = new TextField("");
			textfield8.setColumns(8);
			add(textfield8);
			textfield9 = new TextField("3");
			textfield9.setColumns(9);
			textfield9.setEditable(false);
			add(textfield9);
			textfield10 = new TextField("");
			textfield10.setColumns(10);
			add(textfield10);
			textfield11 = new TextField("2");
			textfield11.setColumns(11);
			textfield11.setEditable(false);
			add(textfield11);
			textfield12 = new TextField("");
			textfield12.setColumns(12);
			add(textfield12);
			textfield13 = new TextField("");
			textfield13.setColumns(13);
			textfield13.setBackground(c);
			add(textfield13);
			textfield14 = new TextField("4");
			textfield14.setColumns(14);
			textfield14.setEditable(false);
			textfield14.setBackground(c);
			add(textfield14);
			textfield15 = new TextField("");
			textfield15.setColumns(15);
			textfield15.setBackground(c);
			add(textfield15);
			textfield16 = new TextField("");
			textfield16.setColumns(16);
			add(textfield16);
			textfield17 = new TextField("9");
			textfield17.setColumns(17);
			textfield17.setEditable(false);
			add(textfield17);
			textfield18 = new TextField("");
			textfield18.setColumns(18);
			add(textfield18);
			textfield19 = new TextField("8");
			textfield19.setColumns(19);
			textfield19.setEditable(false);
			add(textfield19);
			textfield20 = new TextField("");
			textfield20.setColumns(20);
			add(textfield20);
			textfield21 = new TextField("3");
			textfield21.setColumns(21);
			textfield21.setEditable(false);
			add(textfield21);
			textfield22 = new TextField("");
			textfield22.setColumns(22);
			textfield22.setBackground(c);
			add(textfield22);
			textfield23 = new TextField("");
			textfield23.setColumns(23);
			textfield23.setBackground(c);
			add(textfield23);
			textfield24 = new TextField("5");

			textfield24.setColumns(24);
			textfield24.setBackground(c);
			textfield24.setEditable(false);
			add(textfield24);
			textfield25 = new TextField("4");
			textfield25.setColumns(25);
			textfield25.setEditable(false);
			add(textfield25);
			textfield26 = new TextField("");
			textfield26.setColumns(26);
			add(textfield26);
			textfield27 = new TextField("");
			textfield27.setColumns(27);
			add(textfield27);
			textfield28 = new TextField("5");
			textfield28.setColumns(28);
			textfield28.setEditable(false);
			textfield28.setBackground(c);
			add(textfield28);
			textfield29 = new TextField("");
			textfield29.setColumns(29);
			textfield29.setBackground(c);
			add(textfield29);
			textfield30 = new TextField("4");
			textfield30.setColumns(30);
			textfield30.setEditable(false);
			textfield30.setBackground(c);
			add(textfield30);
			textfield31 = new TextField("6");
			textfield31.setColumns(31);
			textfield31.setEditable(false);
			
			add(textfield31);
			textfield32 = new TextField("");
			textfield32.setColumns(32);
			
			add(textfield32);
			textfield33 = new TextField("7");
			textfield33.setColumns(33);
			textfield33.setEditable(false);
			
			add(textfield33);
			textfield34 = new TextField("");
			textfield34.setColumns(34);
			textfield34.setBackground(c);
			add(textfield34);
			textfield35 = new TextField("");
			textfield35.setColumns(35);
			textfield35.setBackground(c);
			add(textfield35);
			textfield36 = new TextField("9");
			textfield36.setColumns(36);
			textfield36.setEditable(false);
			textfield36.setBackground(c);
			add(textfield36);
			textfield37 = new TextField("");
			textfield37.setColumns(37);
			textfield37.setBackground(c);
			add(textfield37);
			textfield38 = new TextField("3");
			textfield38.setColumns(38);
			textfield38.setEditable(false);
			textfield38.setBackground(c);
			add(textfield38);
			textfield39 = new TextField("");
			textfield39.setColumns(39);
			textfield39.setBackground(c);
			add(textfield39);
			textfield40 = new TextField("");
			textfield40.setColumns(40);
			
			add(textfield40);
			textfield41 = new TextField("");
			textfield41.setColumns(41);
			
			add(textfield41);
			textfield42 = new TextField("");
			textfield42.setColumns(42);
			
			add(textfield42);
			textfield43 = new TextField("");
			textfield43.setColumns(43);
			textfield43.setBackground(c);
			add(textfield43);
			textfield44 = new TextField("5");
			textfield44.setColumns(44);
			textfield44.setEditable(false);
			textfield44.setBackground(c);
			add(textfield44);
			textfield45 = new TextField("");
			textfield45.setColumns(45);
			textfield45.setBackground(c);
			add(textfield45);
			textfield46 = new TextField("7");
			textfield46.setColumns(46);
			textfield46.setEditable(false);
			textfield46.setBackground(c);
			add(textfield46);
			textfield47 = new TextField("");
			textfield47.setColumns(47);
			textfield47.setBackground(c);
			add(textfield47);
			textfield48 = new TextField("");
			textfield48.setColumns(48);
			textfield48.setBackground(c);
			add(textfield48);
			textfield49 = new TextField("8");
			textfield49.setColumns(49);
			textfield49.setEditable(false);
			
			add(textfield49);
			textfield50 = new TextField("");
			textfield50.setColumns(50);
			
			add(textfield50);
			textfield51 = new TextField("3");
			textfield51.setColumns(51);
			textfield51.setEditable(false);
			
			add(textfield51);
			textfield52 = new TextField("1");
			textfield52.setColumns(52);
			textfield52.setEditable(false);
			textfield52.setBackground(c);
			add(textfield52);
			textfield53 = new TextField("");
			textfield53.setColumns(53);
			textfield53.setBackground(c);
			add(textfield53);
			textfield54 = new TextField("");
			textfield54.setColumns(54);
			textfield54.setBackground(c);
			add(textfield54);
			textfield55 = new TextField("");
			textfield55.setColumns(55);
			add(textfield55);
			textfield56 = new TextField("");
			textfield56.setColumns(56);
			add(textfield56);
			textfield57 = new TextField("1");
			textfield57.setColumns(57);
			textfield57.setEditable(false);
			add(textfield57);
			textfield58 = new TextField("7");
			textfield58.setColumns(58);
			textfield58.setEditable(false);
			textfield58.setBackground(c);
			add(textfield58);
			textfield59 = new TextField("");
			textfield59.setColumns(59);
			textfield59.setBackground(c);
			add(textfield59);
			textfield60 = new TextField("");
			textfield60.setColumns(60);
			textfield60.setBackground(c);
			add(textfield60);
			textfield61 = new TextField("9");
			textfield61.setColumns(61);
			textfield61.setEditable(false);
			add(textfield61);
			textfield62 = new TextField("");
			textfield62.setColumns(62);
			add(textfield62);
			textfield63 = new TextField("6");
			textfield63.setColumns(63);
			textfield63.setEditable(false);
			add(textfield63);
			textfield64 = new TextField("");
			textfield64.setColumns(64);
			add(textfield64);
			textfield65 = new TextField("8");
			textfield65.setColumns(65);
			textfield65.setEditable(false);
			add(textfield65);
			textfield66 = new TextField("");
			textfield66.setColumns(66);

			add(textfield66);
			textfield67 = new TextField("");
			textfield67.setColumns(67);
			textfield67.setBackground(c);
			add(textfield67);
			textfield68 = new TextField("3");
			textfield68.setColumns(68);
			textfield68.setEditable(false);
			textfield68.setBackground(c);
			add(textfield68);
			textfield69 = new TextField("");
			textfield69.setColumns(69);
			textfield69.setBackground(c);
			add(textfield69);
			textfield70 = new TextField("");
			textfield70.setColumns(70);
			add(textfield70);
			textfield71 = new TextField("2");
			textfield71.setColumns(71);
			textfield71.setEditable(false);
			add(textfield71);
			textfield72 = new TextField("");
			textfield72.setColumns(72);
			add(textfield72);
			textfield73 = new TextField("3");
			textfield73.setColumns(73);
			textfield73.setEditable(false);
			add(textfield73);
			textfield74 = new TextField("");
			textfield74.setColumns(74);
			add(textfield74);
			textfield75 = new TextField("2");
			textfield75.setColumns(75);
			textfield75.setEditable(false);
			add(textfield75);
			textfield76 = new TextField("9");
			textfield76.setColumns(76);
			textfield76.setEditable(false);
			textfield76.setBackground(c);
			add(textfield76);
			textfield77 = new TextField("");
			textfield77.setColumns(77);
			textfield77.setBackground(c);
			add(textfield77);
			textfield78 = new TextField("4");
			textfield78.setColumns(78);
			textfield78.setEditable(false);
			textfield78.setBackground(c);
			add(textfield78);
			textfield79 = new TextField("");
			textfield79.setColumns(79);
			add(textfield79);
			textfield80 = new TextField("");
			textfield80.setColumns(80);
			add(textfield80);
			textfield81 = new TextField("5");
			textfield81.setColumns(81);
			textfield81.setEditable(false);
			add(textfield81);
			

			//adding textlistener to all the textfields so that any text change event will be handled through textValueChanged method
			textfield1.addTextListener(this);
			textfield2.addTextListener(this);
			textfield3.addTextListener(this);
			textfield4.addTextListener(this);

			textfield5.addTextListener(this);
			textfield6.addTextListener(this);
			textfield7.addTextListener(this);
			textfield8.addTextListener(this);

			textfield9.addTextListener(this);
			textfield10.addTextListener(this);
			textfield11.addTextListener(this);
			textfield12.addTextListener(this);

			textfield13.addTextListener(this);
			textfield14.addTextListener(this);
			textfield15.addTextListener(this);
			textfield16.addTextListener(this);

			textfield17.addTextListener(this);
			textfield18.addTextListener(this);
			textfield19.addTextListener(this);
			textfield20.addTextListener(this);

			textfield21.addTextListener(this);
			textfield22.addTextListener(this);
			textfield23.addTextListener(this);
			textfield24.addTextListener(this);

			textfield25.addTextListener(this);
			textfield26.addTextListener(this);
			textfield27.addTextListener(this);

			textfield28.addTextListener(this);
			textfield29.addTextListener(this);
			textfield30.addTextListener(this);

			textfield31.addTextListener(this);
			textfield32.addTextListener(this);
			textfield33.addTextListener(this);

			textfield34.addTextListener(this);
			textfield35.addTextListener(this);
			textfield36.addTextListener(this);

			textfield37.addTextListener(this);
			textfield38.addTextListener(this);
			textfield39.addTextListener(this);

			textfield40.addTextListener(this);
			textfield41.addTextListener(this);
			textfield42.addTextListener(this);
			textfield43.addTextListener(this);
			textfield44.addTextListener(this);
			textfield45.addTextListener(this);
			textfield46.addTextListener(this);
			textfield47.addTextListener(this);
			textfield48.addTextListener(this);
			textfield49.addTextListener(this);
			textfield50.addTextListener(this);
			textfield51.addTextListener(this);
			textfield52.addTextListener(this);
			textfield53.addTextListener(this);
			textfield54.addTextListener(this);
			textfield55.addTextListener(this);
			textfield56.addTextListener(this);
			textfield57.addTextListener(this);
			textfield58.addTextListener(this);
			textfield59.addTextListener(this);
			textfield60.addTextListener(this);
			textfield61.addTextListener(this);
			textfield62.addTextListener(this);
			textfield63.addTextListener(this);
			textfield64.addTextListener(this);
			textfield65.addTextListener(this);
			textfield66.addTextListener(this);
			textfield67.addTextListener(this);
			textfield68.addTextListener(this);
			textfield69.addTextListener(this);
			textfield70.addTextListener(this);
			textfield71.addTextListener(this);
			textfield72.addTextListener(this);
			textfield73.addTextListener(this);
			textfield74.addTextListener(this);
			textfield75.addTextListener(this);
			textfield76.addTextListener(this);
			textfield77.addTextListener(this);
			textfield78.addTextListener(this);
			textfield79.addTextListener(this);
			textfield80.addTextListener(this);
			textfield81.addTextListener(this);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
}
	public void paint(Graphics g)
	{
		g.drawString("SUDOKU", 10, 100);
	}
		

	//handling the text change event here

	
	public void textValueChanged(TextEvent te)
	{ //this field is always true to check for entering of numbers only
		boolean checknumbers=true;
		
		//the actual solution of the sudoku
		String values = "645198273127346598893275461514627389238419657769853142451782936986531724372964815";
		//getting the textfield no which generated textValueChanged event through getColumns
		int cellno=((TextField)te.getSource()).getColumns();
		System.out.println(cellno);
		//extracting the correct value for that field
		String matchingVal = values.substring(cellno - 1, cellno);
		System.out.println(matchingVal);
		//retrieving the value entered by the user
		String urVal = ((TextField)te.getSource()).getText();
		System.out.println(urVal);
		//informing if more than 1 digit is entered
		if (urVal.length() != 1)
		{
			JOptionPane.showMessageDialog(null,"only single digit allowed");
			
		}

		else if(checknumbers)
		{//informing if anything other than numbers is entered
			try
			{
				int val=Integer.parseInt(urVal);

			}
		catch(Exception e)
			{//this will give information that only numbers are to be entered and clears the textfield

			JOptionPane.showMessageDialog(null,"only numbers allowed");
			
		}}
		 if (urVal.equals(matchingVal))
		{//if the value matches the background changes to green
			if (((TextField)te.getSource()).getBackground() == Color.green)
			{//if it was already green nothing to do
			}

			else
			{//if it was not green change to green and increment the correctly answered variable
				((TextField)te.getSource()).setBackground(Color.green);
				green++;
			}
			
		}
		else
		{//if value doesn't matches change it to red and if the color previously was green decrement the correctly answered variable 
			if (((TextField)te.getSource()).getBackground() == Color.green)
				green--;
			((TextField)te.getSource()).setBackground(Color.red);
			
		}

		//if all are correctly answered inform the player
		if (green == 47)
		{
			JOptionPane.showMessageDialog(null, "You Won");
			showStatus("You Won");
		}
		else   //else tell him how many more he need correct
			showStatus("need " + (47 - green) + " more right");
		}



}

