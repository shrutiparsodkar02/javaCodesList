import java.io.*;
class FilesWriting{
	public static void main(String args[])throws Exception{
		FileWriter fw=new FileWriter("text.txt");
		String str="dhanshri has eaten food and also took bath once in week";
		for(int i=0;i<str.length();i++){
			fw.write(str.charAt(i));
		}
		fw.close();
	}

}
