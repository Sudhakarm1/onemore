package org.car;

public class CarMain 
{

	public static void main(String[] args) 
	{
	CarPrint Car=new CarPrint();
	Car.CarOperation("AUDI",1234,"Honda",1200000);
	System.out.println("--------------------------------");
	Car.PrintCar();
	Car.CarOperation("FERARI",4321,"SUZUKI",4200000);
	System.out.println("--------------------------------");
	Car.PrintCar();
	Car.CarOperation("LAMBORGANI",6784,"HERO",6200000);
	System.out.println("--------------------------------");
	Car.PrintCar();
	System.out.println("--------------------------------");
	Car.CarOperation("MARUTHI",9874,"TATA",5200000);
	Car.PrintCar();
	System.out.println("--------------------------------");

	}

}
