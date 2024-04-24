import java.util.Scanner;
class MatrixAddition{
	int[][] matrixAddition(int[][]mat1 ,int[][]mat2){
		int[][] arr3=new int[3][3];
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat2.length;j++){
				arr3[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		return arr3;
	}
	public static void main(String args[]){
		MatrixAddition ma=new MatrixAddition();
		Scanner sc=new Scanner(System.in);
		int[][] mat1=new int[3][3];
		int[][] mat2=new int[3][3];
		System.out.println("enter values in matrix 1--->");
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat2.length;j++){
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter values in matrix 2--->");
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat2.length;j++){
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix addition is--->");
		int[][] mat3=new int[3][3];
		mat3=ma.matrixAddition(mat1,mat2);
		for(int i=0;i<mat1.length;i++){
			for(int j=0;j<mat2.length;j++){
				System.out.print("  "+mat3[i][j]);
			}
			System.out.println();
		}
	}
}
