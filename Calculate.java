package calculator;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculate {
	static String numberOne = "";
	String numberTwo = "";
	String answer;
	STATE stringState = STATE.BEFORE;
	OPERATION intState;
	public enum OPERATION {
		ADD, SUBTRACT, MULTIPLY, DIVIDE;
	}
	public enum STATE {
		BEFORE, AFTER;
	}
	
	public static void main(String[] args){
		Calculate calc = new Calculate();
		calc.buildCalc(numberOne);
		
	}
	public void buildCalc(String tempAnswer){
		answer = tempAnswer;
		JFrame frame = new JFrame();
		final JLabel jlbOutput = new JLabel("0");
		jlbOutput.setBackground(Color.WHITE);
		JPanel buttonPanel = new JPanel();
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton zero = new JButton("0");
		JButton clear = new JButton("clear");
		JButton add = new JButton("+");
		JButton sub = new JButton("-");
		JButton mul = new JButton("*");
		JButton div = new JButton("/");
		JButton equ = new JButton("=");
		buttonPanel.setLayout(new GridLayout(6,3,1,1));
		buttonPanel.add(one);
		buttonPanel.add(two);
		buttonPanel.add(three);
		buttonPanel.add(four);
		buttonPanel.add(five);
		buttonPanel.add(six);
		buttonPanel.add(seven);
		buttonPanel.add(eight);
		buttonPanel.add(nine);
		buttonPanel.add(zero);
		buttonPanel.add(clear);
		buttonPanel.add(add);
		buttonPanel.add(sub);
		buttonPanel.add(mul);
		buttonPanel.add(div);
		buttonPanel.add(equ);
		frame.add(jlbOutput, BorderLayout.NORTH);
		frame.add(buttonPanel, BorderLayout.SOUTH);
		frame.setVisible(true);
		frame.pack();		
		one.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					setThis("1");
					setOutput(jlbOutput);
					
			
			}
		}
		);
		two.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setThis("2");
				setOutput(jlbOutput);
			}
			}
		);
		three.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setThis("3");
				setOutput(jlbOutput);
			}
			}
		);
		four.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setThis("4");
				setOutput(jlbOutput);
			}
			}
		);
		five.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setThis("5");
				setOutput(jlbOutput);
			}
			}
		);
		six.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setThis("6");
				setOutput(jlbOutput);
			}
			}
		);
		seven.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setThis("7");
				setOutput(jlbOutput);
			}
			}
		);
		eight.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setThis("8");
				setOutput(jlbOutput);
			}
			}
		);
		nine.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setThis("9");
				setOutput(jlbOutput);
			}
			}
		);
		zero.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setThis("0");
				setOutput(jlbOutput);
			}
			}
		);
		add.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					jlbOutput.setText("0");
					intState = OPERATION.ADD;
					stringState = STATE.AFTER;
			}
			}
		);
		sub.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jlbOutput.setText("0");
				intState = OPERATION.SUBTRACT;
					stringState = STATE.AFTER;
			}
			}
		);
		mul.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jlbOutput.setText("0");
					intState = OPERATION.MULTIPLY;
					stringState = STATE.AFTER;
			}
			}
		);
		div.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jlbOutput.setText("0");
					intState = OPERATION.DIVIDE;
					stringState = STATE.AFTER;
			}
			}
		);
		clear.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					numberOne = "";
					numberTwo = "";
					jlbOutput.setText("0");
					stringState = STATE.BEFORE;
			}
			}
		);
		equ.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				performOperation(jlbOutput);
			}
		}
		);
		
		
			
		}
		
	public void setOutput(JLabel output){
		if (stringState.equals(STATE.BEFORE)){
			output.setText(numberOne);
			
		}
		else {
			output.setText(numberTwo);
			}
	}
	
	public void setThis(String printThis){
		if (stringState.equals("Before")){
			numberOne += printThis;
			
		}
		else {
			numberTwo += printThis;
		}
	}
	
	public void performOperation(JLabel output){
		if (intState == OPERATION.ADD){
			int firstNumb = Integer.parseInt(numberOne);
			int secondNumb = Integer.parseInt(numberTwo);
			int sum = firstNumb + secondNumb;
			numberOne = Integer.toString(sum);
			numberTwo = "";
			stringState = STATE.BEFORE;
			setOutput(output);
		}
		else if (intState == OPERATION.SUBTRACT){
			int firstNumb = Integer.parseInt(numberOne);
			int secondNumb = Integer.parseInt(numberTwo);
			int sub = firstNumb - secondNumb;
			numberOne = Integer.toString(sub);
			numberTwo = "";
			stringState = STATE.BEFORE;
			setOutput(output);
		}
		else if (intState == OPERATION.MULTIPLY){
			int firstNumb = Integer.parseInt(numberOne);
			int secondNumb = Integer.parseInt(numberTwo);
			int mul = firstNumb * secondNumb;
			numberOne = Integer.toString(mul);
			numberTwo = "";
			stringState = STATE.BEFORE
			setOutput(output);
		}
		else if (intState == OPERATION.DIVIDE){
			int firstNumb = Integer.parseInt(numberOne);
			int secondNumb = Integer.parseInt(numberTwo);
			int div = firstNumb / secondNumb;
			numberOne = Integer.toString(div);
			numberTwo = "";
			stringState = STATE.BEFORE;
			setOutput(output);
		}
	}
}
