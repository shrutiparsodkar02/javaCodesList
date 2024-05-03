import java.io.*;
class CountFiles{
	int directoriesCount=0;
	int filesCount=0;
	int javaCount=0;
	int cFiles=0;
	int imgFile=0;
	void setCountDirectories(String path)throws Exception{
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
					
					//System.out.println("files-->"+strarr[i]);
					filesCount++;
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	void checkJavaFiles(String path)throws Exception{
		File fr=new File(path);
		File[] strarr=fr.listFiles();
		for(int i=0;i<strarr.length;i++){ 
			String s=strarr[i].getAbsolutePath();
			boolean javaFile=s.endsWith(".java");
			//System.out.println(s);
			/*boolean res1=strarr[i].isDirectory();
			boolean isfile=strarr[i].isFile();
			boolean javaFile=s.endsWith(".java");
			if(res1==true){
				//directoriesCount++;	
				setCountDirectories(s);
				String s1=strarr[i].getAbsolutePath();
				System.out.println(s1);
				if(javaFile==true){
					javaCount++;
				}
			}*/
			if(javaFile==true){
				//checkJavaFiles(s);
				javaCount++;
			}
			
			
			
		}
	}
	public static void main(String args[])throws Exception{
		CountFiles cf=new CountFiles();
		String path="/home/shruti/Desktop/git demo files/javaCodesList/democodes";
		cf.setCountDirectories(path);
		cf.checkJavaFiles(path);
		System.out.println("Folder Count-->"+cf.directoriesCount);
		System.out.println("File Count-->"+cf.filesCount);
		System.out.println("java files are--->"+cf.javaCount);
		//String s="sh.java";
		//System.out.println(s.endsWith(".java"));
		
		
	}

}

