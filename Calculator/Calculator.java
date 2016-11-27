import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.math.*;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

/*
 * created by: rocelle cadavos
 * 10/27/2016
 */
//side note: this calculator does not compute for percentage and cannot accept decimal numbers

public class Calculator extends JFrame implements ActionListener{
		
		JFrame frame = new JFrame("CALCULATOR");
		JPanel buttonPanels = new JPanel();
		JTextField textfield = new JTextField(10);

		BigInteger b1, b2, result;
		
		private int operators = 0;

		public static final String[][] BUTTONS = {
			{"AC", "+/-", "%", "/"},
			{"7", "8", "9", "+"},
			{"4", "5", "6", "-"},
			{"1", "2", "3", "*"},
			{"0", "", ".", "="}
		};

		public static final Font BUTTON_FONT = new Font(Font.SANS_SERIF, Font.PLAIN, 23);

		public Calculator() {

			//some small details and design for the textfield
			Font font = new Font("Calibri", Font.BOLD, 26);
			textfield.setFont(BUTTON_FONT.deriveFont(Font.PLAIN));
			textfield.setEditable(false);
			textfield.setBackground(Color.GRAY);
			textfield.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.WHITE));
			textfield.setFont(font);
			textfield.setPreferredSize(new Dimension(100,60));
			textfield.setHorizontalAlignment(SwingConstants.RIGHT);
			textfield.setForeground(Color.WHITE);
			//textfield.setBorderPainted(false);

			frame.setLayout(new GridLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setSize(300, 400);
			frame.setLocation(600, 300);

			//color swatches I chose that were similar to the color theme of Apple's
			//translated hex values since java doesnt read them raw
			Color greyColor = Color.decode("#cbd2d1");
			Color orangeColor = Color.decode("#f09348");

			buttonPanels.setLayout(new GridLayout(BUTTONS.length, BUTTONS[0].length, 3, 3));
			buttonPanels.setBackground(Color.GRAY);

			//for each index, add button, set color, background and foreground
			for (int i = 0; i < BUTTONS.length; i++) {
					for (int j = 0; j < BUTTONS[i].length; j++) {
						JButton button = new JButton(BUTTONS[i][j]);
							if(j == 3 || j == 6 || j == 9 || j == 12) {
								//set the color left most buttons to be orange
								button.setBackground(orangeColor);
								button.setForeground(Color.WHITE);
							} else {
								button.setBackground(greyColor);
							}
						button.addActionListener(this);
						button.setBorderPainted(false);
						button.setFont(BUTTON_FONT);
						button.setOpaque(true);
						buttonPanels.add(button);

						button.addActionListener(new ActionListener() {
							@Override

							//button listeners
							public void actionPerformed(ActionEvent a) {
								if ((a.getActionCommand() == BUTTONS[1][0])
									|| (a.getActionCommand() == BUTTONS[1][1])
									|| (a.getActionCommand() == BUTTONS[1][2])
									|| (a.getActionCommand() == BUTTONS[2][0])
									|| (a.getActionCommand() == BUTTONS[2][1])
									|| (a.getActionCommand() == BUTTONS[2][2])
									|| (a.getActionCommand() == BUTTONS[3][0])
									|| (a.getActionCommand() == BUTTONS[3][1])
									|| (a.getActionCommand() == BUTTONS[3][2])
									|| (a.getActionCommand() == BUTTONS[4][0])) {

									String digit = a.getActionCommand();
									textfield.setText(textfield.getText() + digit);
								} else {
									//clear screen/text field
									if(a.getActionCommand() == BUTTONS[0][0]){
										textfield.setText("");
										b1 = new BigInteger("0");
					               b2 = new BigInteger("0");
					               result = new BigInteger("0");
									}
									//positive/negative
									if(a.getActionCommand() == BUTTONS[0][1]) {
										textfield.setText("-");
									}
									//percent
									if(a.getActionCommand() == BUTTONS[0][2]) {
										//dunno mehn don't know what the percent button's supposed to do
									}
									//division
									if(a.getActionCommand() == BUTTONS[0][3]) {
										b1 = new BigInteger(textfield.getText());
										operators = 4;
										textfield.setText("");
									}
									//addition 
									if(a.getActionCommand() == BUTTONS[1][3]) {
										b1 = new BigInteger(textfield.getText());
										operators = 1;
										textfield.setText("");
									}
									//subtraction
									if(a.getActionCommand() == BUTTONS[2][3]) {
										b1 = new BigInteger(textfield.getText());
										operators = 2;
										textfield.setText("");
									}
									//multiplication
									if(a.getActionCommand() == BUTTONS[3][3]) {
										b1 = new BigInteger(textfield.getText());
										operators = 3;
										textfield.setText("");
									}
									//equals button
									if(a.getActionCommand() == BUTTONS[4][3]) {
										b2 = new BigInteger(textfield.getText());
										switch(operators) {
				                     case 1: 
				                        result = b1.add(b2);
				                        break;
				                     case 2:
				                        result = b1.subtract(b2);
				                        break;
				                     case 3:
				                        result = b1.multiply(b2);
				                        break;
				                     case 4:
				                        result = b1.divide(b2);
				                        break;
				                     default:
				                        break;
				                }
				               textfield.setText(""+ result);
									}
									//decimal point
									if(a.getActionCommand() == BUTTONS[4][2]) {
										textfield.setText(textfield.getText() + ".");
										//BigDecimal
									}
								}

							}
						});
				}
			}

		//add everything in the main panel
		JPanel mainPanel = new JPanel(new BorderLayout());
	   mainPanel.add(textfield, BorderLayout.PAGE_START);
	   mainPanel.add(buttonPanels, BorderLayout.CENTER);
	    
	   frame.getContentPane().add(mainPanel);
	   frame.setVisible(true);

		}

		@Override
		public void actionPerformed(ActionEvent e) {
		}

		public static void main(String[] args) {
			Calculator calcu = new Calculator();
		}
 }
