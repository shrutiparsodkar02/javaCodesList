import javax.swing.*;
import java.awt.*;
class Calsi extends JFrame{
	JLabel num1Lable,num2Lable,resultLabel;
	JButton AdditionBtn;
	JTextField num1TF,num2TF,resultTF;
	public Calsi(){
		num1Lable=new JLabel("Num1-->");
		num2Lable=new JLabel("Num2-->");
		resultLabel=new JLabel("Result-->");
		num1TF=new JTextField(10);
		num2TF=new JTextField(10);
		resultTF=new JTextField(11);
		AdditionBtn=new JButton();
		//setVisible(true);
		add(num1Lable);add(num1TF);
		add(num2Lable);add(num2TF);
		add(AdditionBtn);
		add(resultLabel);add(resultTF);
		
		setLayout(new FlowLayout(FlowLayout.CENTER,40,40));
		setVisible(true);
	        setSize(400,400);
	        setVisible(true);
		
	}
	public static void main(String args[]){
		Calsi mycalsi =new Calsi();
		
	}
	

}
