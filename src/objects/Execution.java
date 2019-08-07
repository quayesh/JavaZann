package objects;

import astoria.Variables;

public class Execution {
	
	
public static void main(String[]args) {
	
	Laptop refVar = new Laptop();
	Variables var=new Variables();
	Car car=new Car();
	
	
	
	System.out.println(refVar.brand);
	System.out.println(var.lesson);
	System.out.println(car.car);
	System.out.println(car.color);
	System.out.println(car.year);
	
 }
}
