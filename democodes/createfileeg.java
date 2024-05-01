import java.io.*;
import javax.swing.*;
class Sample{
	void createFile(int[]arr){
		
		try{	
			java.util.Scanner sc=new java.util.Scanner(System.in);
			File name=new File("xyz.txt");
			name.createNewFile();
			System.out.println("sggs");
			System.out.println(arr[5]);
			
		}
		catch(Exception ex){
			System.out.println(ex);
			//throw ex;
		}
	}
	void showMessage(){
		JOptionPane.showMessageDialog(null,"Sample","message run properly",JOptionPane.INFORMATION_MESSAGE);
	}
	public static void main(String args[]){
		Sample s=new Sample();
		int[] arr={10,20};
		s.showMessage();
		/*try{
			//s.createFile(arr);
			s.showMessage();
			//System.out.println("file created");
		}
		catch(Exception ex){
			System.out.println("catching rethrown exception");
		}*/
	}
}
