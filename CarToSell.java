
/**
 * Author: Nikhil Shah
 * ID Number: 11061376
 * Car To Sell Sub Class
 */
public class CarToSell extends Car
{
    /**
     * Attributes for the objects of class CarsToSell.
     */
    // The price at which the car sells for
    private int price;
    // the year the car is registered
    private int yearOfRegistration;
    // the amount of mileage the car has done
    private int mileage;
    // Whether the Car is sold or not
    private boolean sold;
    /**
     * This method enables the user to add a Car to sell to the Car Company.
     */
    public CarToSell(String CarDescription, int CarPrice, int CarYearOfRegistration, int CarMileage)
    {
      super(CarDescription);
      price = CarPrice;
      yearOfRegistration = CarYearOfRegistration;
      mileage = CarMileage;
      sold = false;
    }
    /**
     * This method returns the price of the car.
     */
    public int getPrice()
    {
        return price;      
    }
     /**
     * This method returns the year of registration of the car.
     */
    public int getyearOfRegistration()
    {
        return yearOfRegistration;
    }
    /**
     * This method returns the mileage of the car.
     */
    public int getMileage()
    {
        return mileage;
    }
    /**
     * This method shows whether the car is sold or not to a customer.
     */
    public boolean isCarSold()
    {
        return sold;
    }
    /**
     * This method enables the user to set price of car to a new car price.
     */
    public void setPrice (int newCarPrice)
    {
         if (sold==true)
    {
		  System.out.println ("This car has already been sold to a customer");
    }
    else
    {
        price = newCarPrice;
    }
   }
    /**
     * This method sells a car to a customer. 
     * If the condition of the car sold is true then the user will have to choose another car.
     */
   public void sellCar(String newCustomer)
   
   {
     if (sold==true)
   {
		  System.out.println ("This car is sold please choose another car to buy");
   }    
	else
   {        
       setCustomer(newCustomer);
       sold = true;
   }
   }
   /**
    * The description and customer is pulled from the car super class.
    * If Car is not sold then the price, year of registration and mileage of the car is shown as an output.
    */
       public void displayCar()
    {
        super.displayCar();
    
        if (sold==false)
        {
            System.out.println("The price of the car is " + "£" + price);
            System.out.println("The year of registration of this car is " + yearOfRegistration);
            System.out.println("The mileage of this car is " + mileage);
        }
    
    }
}