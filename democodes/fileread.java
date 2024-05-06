import java.io.*;
class FileReadingOperation{
	public static void main(String args[])throws Exception{
		FileInputStream frs=new FileInputStream("createfileeg.java");
		int ch;
		while((ch=frs.read())!=-1){
			System.out.print((char)ch);
		}
	}
}
