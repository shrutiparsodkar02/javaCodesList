class loop{
    /*loop(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }*/
    public static void main(String[] args) {
        int num1=8;
        int num2=8;
       // loop l1=new loop(8,8);
        if(num1==num2){
            System.out.println(num1+"<---both are equal---->"+num2);
        }
        else if(num1>num2){
            System.out.println("num1 is greater then num2---->"+num1);
        }
        else
        {
            System.out.println("num2 is greater------>"+num2);
        }
    }
}