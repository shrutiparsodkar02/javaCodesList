class Triangle{
	float length;
	float height;
	void setLength(float l){
		this.length=l;
	}
	void setHeight(float h){
		this.height=h;
	}
	Triangle(float l,float h){
		double area=0.5*l*h;
		System.out.println("Area of triangle is--->"+area);
	}
	Triangle(){
		super();
		double area=0.5*length*height;
		System.out.println("area of triangle is--->"+area);
	}
	
	public static void main(String args[]){
		
		Triangle t1=new Triangle();
		t1.setLength(10);
		t1.setHeight(2);
		//Triangle t=new Triangle();
		
	}
}
