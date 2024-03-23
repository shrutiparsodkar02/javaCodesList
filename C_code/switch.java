 import java.util.Scanner;
 class Switchcase {
        public static void main(String[] args) {
            
        
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number which value you want o search");
        int n=sc.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("value is 1");
                
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:
            System.out.println("value is 3");
            break;
        
            default:
                System.out.println("value is greater then 3");
                break;
        }
    

    }

    
}
