
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}


	double gpa(double gpa){
		if(gpa>90){
			return gpa*1.1;
		}else{
			return gpa;
		}
	}
	
	boolean isGraduating(double grade, double credits){
		if(grade==4&&credits>=44){
			return true;
		}else{
			return false;
		}
		
	}

	String BMI(double weight, double height){
		double bmi=(weight/Math.pow(height,2))*703.0;
		if(bmi<=18.4){
			return "underweight";
		}else if(bmi>18.4&&bmi<=24.9){
			return "normal";
		}else if(bmi>24.9&&bmi<=39.9){
			return "overweight";
		}else{
			return "obese";
		}
	}

	double shippingCost(double w){
		if(w<10){
			return 0.00;
		}else if(w>=10&&w<15){
			return 5.00;
		}else if(w>=15&&w<25){
			return 10.00;
		}else{
			return 10 + 0.02*w;
		}
	}

	boolean blueOrViolet(double freq){
		if(freq>=600&&freq<=670){
			return true;
		}else if(freq>=700&&freq<750){
			return true;
		}else{
			return false;
		}
	}
			

	void init(){
		System.out.println(gpa(95));
		System.out.println(isGraduating(3,45));
		System.out.println(BMI(60,120));
		System.out.println(shippingCost(20));
		System.out.println(blueOrViolet(725));

   

  }

 
  
}