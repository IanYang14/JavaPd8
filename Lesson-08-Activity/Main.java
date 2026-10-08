class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void print(String p){
	System.out.println(p);
	}

	double FtoC(double f){
		return (f-32)*5/9;
	}

	double sphereVolume(double r){
		return 4.0/3.0*Math.PI*Math.pow(r,3);
	}

	double coneVolume(double R,double h){
		return 1.0/3.0*Math.PI*h*Math.pow(R,2);
	}	

	double distance(double x1, double y1, double x2, double y2){
		return Math.sqrt(Math.pow((x2-x1),2)-Math.pow((y2-y1),2));
	}		

  void init(){
	print("Hello World");
	System.out.println(FtoC(90));
	System.out.println(sphereVolume(3));
	System.out.println(coneVolume(5,4));
	System.out.println(distance(1,3,5,6));
	}



  
 
}