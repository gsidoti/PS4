package CalcGUI;

import CalcEngine.FValue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JToggleButton;

import java.awt.GridLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JDesktopPane;
import javax.swing.DropMode;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcGUI {

	private JFrame frame;
	private JTextField txtInterestRate;
	private JTextField txtYears;
	private JTextField txtPValue;
	private JTextField txtFValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double PValue = Double.parseDouble(txtPValue.getText());
				double Years = Double.parseDouble(txtYears.getText());
				double InterestRate = Double.parseDouble(txtInterestRate.getText());
				FValue proto = new FValue();
				double Final = proto.returnFValue(PValue, InterestRate, Years);
			    double FinalRnd = Math.round(Final*100.0)/100.0;
				txtFValue.setText("$" + FinalRnd);
				
			}
		});
		btnCalculate.setBounds(166, 13, 234, 143);
		frame.getContentPane().add(btnCalculate);
		
		txtInterestRate = new JTextField();
		txtInterestRate.setBounds(22, 187, 116, 22);
		frame.getContentPane().add(txtInterestRate);
		txtInterestRate.setColumns(10);
		
		JLabel lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setBounds(12, 31, 116, 16);
		frame.getContentPane().add(lblInvestmentAmount);
		
		txtYears = new JTextField();
		txtYears.setBounds(22, 124, 116, 22);
		frame.getContentPane().add(txtYears);
		txtYears.setColumns(10);
		
		JLabel lblYears = new JLabel("Years");
		lblYears.setBounds(12, 95, 56, 16);
		frame.getContentPane().add(lblYears);
		
		txtPValue = new JTextField();
		txtPValue.setBounds(22, 60, 116, 22);
		frame.getContentPane().add(txtPValue);
		txtPValue.setColumns(10);
		
		JLabel lblRateOfReturn = new JLabel("Rate of Return");
		lblRateOfReturn.setBounds(12, 159, 116, 16);
		frame.getContentPane().add(lblRateOfReturn);
		
		txtFValue = new JTextField();
		txtFValue.setEditable(false);
		txtFValue.setBounds(188, 183, 187, 30);
		frame.getContentPane().add(txtFValue);
		txtFValue.setColumns(10);
	}
}
