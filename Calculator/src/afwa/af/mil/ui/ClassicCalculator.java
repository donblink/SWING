package afwa.af.mil.ui;

import javax.swing.*;

import afwa.af.mil.controller.EventHandler;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Insets;
import java.awt.Menu;
import java.awt.MenuBar;

public class ClassicCalculator extends JPanel {

	private JFrame frame;
	private JTextField displayfield;
	private JButton buttonMC;
	private JButton buttonMR;
	private JButton buttonMS;
	private JButton buttonMPlus;
	private JButton buttonMMinus;
	private JButton buttonBackspace;
	private JButton buttonCE;
	private JButton buttonC;
	private JButton buttonSign;
	private JButton buttonRootSquare;
	private JButton buttonDivide;
	private JButton buttonPercent;
	private JButton buttonTime;
	private JButton buttonInverse;
	private JButton buttonMinus;
	private JButton buttonEqualSign;
	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonPoint;
	private JButton buttonPlus;
	

	public ClassicCalculator() {
		this.frame = new JFrame();
		this.displayfield = new JTextField();
		
		MenuBar mbar = new MenuBar();
		this.frame.setMenuBar(mbar);
		
		Menu view = new Menu("View");
		Menu edit = new Menu("Edit");
		Menu help = new Menu("Help");
		
		mbar.add(view);
		mbar.add(edit);
		mbar.add(help);

		this.buttonMC = new JButton("MC");
		this.buttonMR = new JButton("MR");
		this.buttonMS = new JButton("MS");
		this.buttonMPlus = new JButton("M+");
		this.buttonMMinus = new JButton("M-");
		this.buttonBackspace = new JButton("\u232b");
		this.buttonCE = new JButton("CE");
		this.buttonC = new JButton("C");
		this.buttonSign = new JButton("+/-");
		this.buttonDivide = new JButton("/");
		this.buttonPercent = new JButton("%");
		this.buttonTime = new JButton("*");
		this.buttonInverse = new JButton("1/x");
		this.buttonRootSquare = new JButton("\u221a");
		this.buttonMC = new JButton("MC");
		this.buttonMR = new JButton("MR");
		this.buttonMinus = new JButton("-");
		this.buttonPlus = new JButton("+");

		this.button0 = new JButton("0");
		this.button1 = new JButton("1");
		this.button2 = new JButton("2");
		this.button3 = new JButton("3");
		this.button4 = new JButton("4");
		this.button5 = new JButton("5");
		this.button6 = new JButton("6");
		this.button7 = new JButton("7");
		this.button8 = new JButton("8");
		this.button9 = new JButton("9");
		this.buttonPoint = new JButton(".");
		this.buttonEqualSign = new JButton("=");

		GridBagLayout bagLayout = new GridBagLayout();
		this.setLayout(bagLayout);

		// create constraint 1
		GridBagConstraints constr = new GridBagConstraints();
		constr.insets = new Insets(5, 5, 5, 5);
		// coordonate of the x,y grid
		constr.gridx = 0;
		constr.gridy = 0;

		// first cell display text field
		constr.gridheight = 1;
		constr.gridwidth = 5;
		constr.fill = constr.BOTH;
		constr.anchor = constr.LINE_END;
		bagLayout.setConstraints(displayfield, constr);

		// 1 row
		constr.gridx = 0;
		constr.gridy = 1;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		bagLayout.setConstraints(buttonMC, constr);

		constr.gridx = 1;
		constr.gridy = 1;
		bagLayout.setConstraints(buttonMR, constr);

		constr.gridx = 2;
		constr.gridy = 1;
		bagLayout.setConstraints(buttonMS, constr);

		constr.gridx = 3;
		constr.gridy = 1;
		bagLayout.setConstraints(buttonMPlus, constr);

		constr.gridx = 4;
		constr.gridy = 1;
		bagLayout.setConstraints(buttonMMinus, constr);

		// 2 row
		constr.gridx = 0;
		constr.gridy = 2;
		bagLayout.setConstraints(buttonBackspace, constr);

		constr.gridx = 1;
		constr.gridy = 2;
		bagLayout.setConstraints(buttonCE, constr);

		constr.gridx = 2;
		constr.gridy = 2;
		bagLayout.setConstraints(buttonC, constr);

		constr.gridx = 3;
		constr.gridy = 2;
		bagLayout.setConstraints(buttonSign, constr);

		constr.gridx = 4;
		constr.gridy = 2;
		bagLayout.setConstraints(buttonRootSquare, constr);

		// 3 row
		constr.gridx = 0;
		constr.gridy = 3;
		bagLayout.setConstraints(button7, constr);

		constr.gridx = 1;
		constr.gridy = 3;
		bagLayout.setConstraints(button8, constr);

		constr.gridx = 2;
		constr.gridy = 3;
		bagLayout.setConstraints(button9, constr);

		constr.gridx = 3;
		constr.gridy = 3;
		bagLayout.setConstraints(buttonDivide, constr);

		constr.gridx = 4;
		constr.gridy = 3;
		bagLayout.setConstraints(buttonPercent, constr);

		// row 4
		constr.gridx = 0;
		constr.gridy = 4;
		bagLayout.setConstraints(button4, constr);

		constr.gridx = 1;
		constr.gridy = 4;
		bagLayout.setConstraints(button5, constr);

		constr.gridx = 2;
		constr.gridy = 4;
		bagLayout.setConstraints(button6, constr);

		constr.gridx = 3;
		constr.gridy = 4;
		bagLayout.setConstraints(buttonTime, constr);

		constr.gridx = 4;
		constr.gridy = 4;
		bagLayout.setConstraints(buttonInverse, constr);

		// row 5

		constr.gridx = 0;
		constr.gridy = 5;
		bagLayout.setConstraints(button1, constr);

		constr.gridx = 1;
		constr.gridy = 5;
		bagLayout.setConstraints(button2, constr);

		constr.gridx = 2;
		constr.gridy = 5;
		bagLayout.setConstraints(button3, constr);

		constr.gridx = 3;
		constr.gridy = 5;
		bagLayout.setConstraints(buttonMinus, constr);

		constr.gridx = 4;
		constr.gridy = 5;
		constr.gridheight = 2;
		constr.gridwidth = 1;
		bagLayout.setConstraints(buttonEqualSign, constr);

		// row 5

		constr.gridx = 0;
		constr.gridy = 6;
		constr.gridheight = 1;
		constr.gridwidth = 2;
		bagLayout.setConstraints(button0, constr);

		constr.gridx = 2;
		constr.gridy = 6;
		constr.gridheight = 1;
		constr.gridwidth = 1;
		bagLayout.setConstraints(buttonPoint, constr);

		constr.gridx = 3;
		constr.gridy = 6;
		bagLayout.setConstraints(buttonPlus, constr);

		// add display into window pane

		this.add(displayfield);
		this.add(buttonMC);
		this.add(buttonMR);
		this.add(buttonMS);
		this.add(buttonMPlus);
		this.add(buttonMMinus);

		// row 2
		this.add(buttonBackspace);
		this.add(buttonCE);
		this.add(buttonC);
		this.add(buttonSign);
		this.add(buttonRootSquare);
		// row 3
		this.add(button7);
		this.add(button8);
		this.add(button9);
		this.add(buttonDivide);
		this.add(buttonPercent);
		// row 4
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(buttonTime);
		this.add(buttonInverse);
		// row 5
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(buttonMinus);
		this.add(buttonEqualSign);
		
		//row 6
		this.add(button0);
		this.add(buttonPoint);
		this.add(buttonPlus);

		// set layout
		this.setLayout(bagLayout);
		frame.add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 600);
		frame.setTitle("Classic Claculator");
		frame.setVisible(true);
		
		EventHandler handler = new EventHandler(this);
		
		button0.addActionListener(handler);
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
		button5.addActionListener(handler);
		button6.addActionListener(handler);
		button7.addActionListener(handler);
		button8.addActionListener(handler);
		button9.addActionListener(handler);
		
		buttonPlus.addActionListener(handler);
		buttonMinus.addActionListener(handler);
		buttonTime.addActionListener(handler);
		buttonDivide.addActionListener(handler);
		buttonEqualSign.addActionListener(handler);
		buttonC.addActionListener(handler);
		buttonCE.addActionListener(handler);
		
		
		

	}

	public JFrame getFrame() {
		return frame;
	}

	public JButton getButtonMC() {
		return buttonMC;
	}

	public JButton getButtonMR() {
		return buttonMR;
	}

	public JButton getButtonMS() {
		return buttonMS;
	}

	public JButton getButtonMPlus() {
		return buttonMPlus;
	}

	public JButton getButtonMMinus() {
		return buttonMMinus;
	}

	public JButton getButtonBackspace() {
		return buttonBackspace;
	}

	public JButton getButtonCE() {
		return buttonCE;
	}

	public JButton getButtonC() {
		return buttonC;
	}

	public JButton getButtonSign() {
		return buttonSign;
	}

	public JButton getButtonRootSquare() {
		return buttonRootSquare;
	}

	public JButton getButtonDivide() {
		return buttonDivide;
	}

	public JButton getButtonPercent() {
		return buttonPercent;
	}

	public JButton getButtonTime() {
		return buttonTime;
	}

	public JButton getButtonInverse() {
		return buttonInverse;
	}

	public JButton getButtonMinus() {
		return buttonMinus;
	}

	public JButton getButtonEqualSign() {
		return buttonEqualSign;
	}

	public JButton getButton0() {
		return button0;
	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton2() {
		return button2;
	}

	public JButton getButton3() {
		return button3;
	}

	public JButton getButton4() {
		return button4;
	}

	public JButton getButton5() {
		return button5;
	}

	public JButton getButton6() {
		return button6;
	}

	public JButton getButton7() {
		return button7;
	}

	public JButton getButton8() {
		return button8;
	}

	public JButton getButton9() {
		return button9;
	}

	public JButton getButtonPoint() {
		return buttonPoint;
	}

	public JButton getButtonPlus() {
		return buttonPlus;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public void setDisplayfield(JTextField displayfield) {
		this.displayfield = displayfield;
	}

	public void setButtonMC(JButton buttonMC) {
		this.buttonMC = buttonMC;
	}

	public void setButtonMR(JButton buttonMR) {
		this.buttonMR = buttonMR;
	}

	public void setButtonMS(JButton buttonMS) {
		this.buttonMS = buttonMS;
	}

	public void setButtonMPlus(JButton buttonMPlus) {
		this.buttonMPlus = buttonMPlus;
	}

	public void setButtonMMinus(JButton buttonMMinus) {
		this.buttonMMinus = buttonMMinus;
	}

	public void setButtonBackspace(JButton buttonBackspace) {
		this.buttonBackspace = buttonBackspace;
	}

	public void setButtonCE(JButton buttonCE) {
		this.buttonCE = buttonCE;
	}

	public void setButtonC(JButton buttonC) {
		this.buttonC = buttonC;
	}

	public void setButtonSign(JButton buttonSign) {
		this.buttonSign = buttonSign;
	}

	public void setButtonRootSquare(JButton buttonRootSquare) {
		this.buttonRootSquare = buttonRootSquare;
	}

	public void setButtonDivide(JButton buttonDivide) {
		this.buttonDivide = buttonDivide;
	}

	public void setButtonPercent(JButton buttonPercent) {
		this.buttonPercent = buttonPercent;
	}

	public void setButtonTime(JButton buttonTime) {
		this.buttonTime = buttonTime;
	}

	public void setButtonInverse(JButton buttonInverse) {
		this.buttonInverse = buttonInverse;
	}

	public void setButtonMinus(JButton buttonMinus) {
		this.buttonMinus = buttonMinus;
	}

	public void setButtonEqualSign(JButton buttonEqualSign) {
		this.buttonEqualSign = buttonEqualSign;
	}

	public void setButton0(JButton button0) {
		this.button0 = button0;
	}

	public void setButton1(JButton button1) {
		this.button1 = button1;
	}

	public void setButton2(JButton button2) {
		this.button2 = button2;
	}

	public void setButton3(JButton button3) {
		this.button3 = button3;
	}

	public void setButton4(JButton button4) {
		this.button4 = button4;
	}

	public void setButton5(JButton button5) {
		this.button5 = button5;
	}

	public void setButton6(JButton button6) {
		this.button6 = button6;
	}

	public void setButton7(JButton button7) {
		this.button7 = button7;
	}

	public void setButton8(JButton button8) {
		this.button8 = button8;
	}

	public void setButton9(JButton button9) {
		this.button9 = button9;
	}

	public void setButtonPoint(JButton buttonPoint) {
		this.buttonPoint = buttonPoint;
	}

	public void setButtonPlus(JButton buttonPlus) {
		this.buttonPlus = buttonPlus;
	}

	public JTextField getDisplayfield() {
		return displayfield;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ClassicCalculator();
			}
		});

	}

}
