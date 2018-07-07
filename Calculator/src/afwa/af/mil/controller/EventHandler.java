package afwa.af.mil.controller;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import java.util.StringTokenizer;

import javax.swing.JButton;

import afwa.af.mil.ui.ClassicCalculator;

public class EventHandler implements ActionListener {

	private ClassicCalculator calc;
	private int operand1;
	private int operand2;
	private int result;
	private String snapshot;

	// private Operator operator;

	public EventHandler(ClassicCalculator calc) {
		this.calc = calc;
	}

	public void actionPerformed(ActionEvent ae) {
		int leftOperand = 0;

		Object evtSrc = ae.getSource();
		if (evtSrc == this.calc.getButtonPlus()) {
			String number = this.calc.getDisplayfield().getText();
			leftOperand = Integer.parseInt(number);
			this.operand1 = leftOperand;
			System.out.println("operand1:"+ this.operand1);
			this.calc.getDisplayfield().setText(number + "+");
		}
		if (evtSrc == this.calc.getButtonTime()) {
			String number = this.calc.getDisplayfield().getText();
			leftOperand = Integer.parseInt(number);
			this.calc.getDisplayfield().setText(number + "*");
			this.operand1 = leftOperand;

		}
		if (evtSrc == this.calc.getButtonMinus()) {
			String number = this.calc.getDisplayfield().getText();
			leftOperand = Integer.parseInt(number);
			this.calc.getDisplayfield().setText(number + "-");
			this.operand1 = leftOperand;

		}
		if (evtSrc == this.calc.getButtonDivide()) {
			String number = this.calc.getDisplayfield().getText();
			leftOperand = Integer.parseInt(number);
			this.calc.getDisplayfield().setText(number + "/");
			this.operand1 = leftOperand;

		}
		if (evtSrc == this.calc.getButtonEqualSign()) {

			String textField = new String(this.calc.getDisplayfield().getText());
			String second = textField.substring(textField.indexOf('+')+1);
		
			
			System.out.println("operator: "+ second);
			int rightOperand = Integer.parseInt(second);
			this.operand2 = rightOperand;
			System.out.println("operand2:"+this.operand2);
			this.snapshot = this.calc.getDisplayfield().getText() + "=";
			if (this.calc.getDisplayfield().getText().contains("+")) {
				result = this.operand1 + this.operand2;
				String total = String.valueOf(result);
				this.calc.getDisplayfield().setText(this.snapshot + total);
			}

		}
		if (evtSrc == this.calc.getButton0()
				|| evtSrc == this.calc.getButton1()
				|| evtSrc == this.calc.getButton2()
				|| evtSrc == this.calc.getButton3()
				|| evtSrc == this.calc.getButton4()
				|| evtSrc == this.calc.getButton5()
				|| evtSrc == this.calc.getButton6()
				|| evtSrc == this.calc.getButton7()
				|| evtSrc == this.calc.getButton8()
				|| evtSrc == this.calc.getButton9())

		{
			JButton clickedButton = (JButton) ae.getSource();
			String displayText = calc.getDisplayfield().getText();
			String clickedButtonLabel = clickedButton.getText();

			calc.getDisplayfield().setText(displayText + clickedButtonLabel);
		}
		
		if (evtSrc == this.calc.getButtonC()){
			resetDisplay();
			this.snapshot ="";
			this.result = 0;
		}
		
		if (evtSrc == this.calc.getButtonCE()){
			this.calc.getDisplayfield().setText("");
		}
		
			
	}
	
	private void resetDisplay(){
		this.calc.getDisplayfield().setText("");
		this.operand2 = 0;
		this.operand1 = 0;
		
	}

}
