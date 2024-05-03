import java.io.*;
class CountFiles{
	int directoriesCount=0;
	int filesCount=0;
	int javaCount=0;
	int cFiles=0;
	int txtfile1=0;
	int imgFile=0;
	/*void setCountDirectories(String path)throws Exception{
		try{
			File fr=new File(path);
			File[] strarr=fr.listFiles();
			//System.out.println(strarr.length);
			for(int i=0;i<strarr.length;i++){
				boolean res=strarr[i].isDirectory();
				String s=strarr[i].getAbsolutePath();
				if(res==true){
					//System.out.println("directories-->"+strarr[i]);
					setCountDirectories(s);
					directoriesCount++;	
				}
				else{
					
					System.out.println("files-->"+strarr[i]);
					filesCount++;
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}*/
	void checkFiles(String path)throws Exception{
		File fr=new File(path);
		File[] strarr=fr.listFiles();
		for(int i=0;i<strarr.length;i++){ 
			
			//String s=strarr[i].getAbsolutePath();
			String str=strarr[i].getAbsolutePath();
			boolean isfile=strarr[i].isFile();
			boolean isdir=strarr[i].isDirectory();
			boolean javaFile=str.endsWith(".java");
			boolean classfile=str.endsWith(".class");
			boolean txtfile=str.endsWith(".txt");
			boolean imgfile=str.endsWith(".jpg");
			boolean imgfile2=str.endsWith(".png");
			if(isdir==true){
				directoriesCount++;	
				checkFiles(str);
				
			}
			else{
				if(javaFile==true){
					javaCount++;
					filesCount++;		
				}
				else if(classfile==true){
					cFiles++;
					filesCount++;	
				}
				else if(txtfile==true){
					txtfile1++;
					filesCount++;	
				}
				else if(imgfile==true || imgfile2==true ){
					imgFile++;
					filesCount++;	
				}
			}
			
			
			
		}
	}
	public static void main(String args[])throws Exception{
		CountFiles cf=new CountFiles();
		String path="/home/shruti/Desktop/git demo files";
		cf.checkFiles(path);
		System.out.println("Folder Count-->"+cf.directoriesCount);
		System.out.println("File Count-->"+cf.filesCount);
		System.out.println("java files are--->"+cf.javaCount);
		System.out.println("image files are--->"+cf.imgFile);
		System.out.println("txt files are--->"+cf.txtfile1);
		System.out.println("class files are--->"+cf.cFiles);
	}

}

