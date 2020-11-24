package org.car;

abstract public class CarData 
{
      public String CarName;
      public int CarNumber;
      public String CarBrand;
      protected int CarPrice;
      abstract public void CarOperation(String CarName,int CarNumber,String CarBrand,int CarPrice);
}
