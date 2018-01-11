/**
 * Nikhil Shah 
 * Car To Rent Sub Class
 * ID Number: 11061376
 */

public class CarToRent extends Car
{


    // amount of payment before car rented out
    private int downPayment;
    // number of days car is rented out
    private int days;
    // the daily rental rate of the car
    private int rate;
    // the start date of when the car is hired
    private String dateOfHire;
    // the date in which the car is due for return
    private String dateOfReturn;
    // the total rent accumalated for the car
    private int totalrent;
    // whether the car is on loan or not
    private boolean onLoan;
    
    /**
     * I have made sure that i added the car description car downpayment and Car Rate Parameters
     * These parameters will enable the user to enter the description, downpayment and rate to the Car Class
     */

   public CarToRent(String CarDescription,int CarDownPayment,int CarRate)
    {
       super(CarDescription);
       downPayment = CarDownPayment;
       rate = CarRate;
       days = 0;
       dateOfHire = "";
       dateOfReturn = "";
       totalrent = 0;
       onLoan = false;
    }
    
  
    /**
     * Return the down payment
     */
    public int getDownPayment()
    {
        return downPayment;
    }
    
    
    /**
     * return the daily rate of the car
     */
    public int getRate()
    {
        return rate;
    }
    
    /**
     *  The number of days the car is rented out
     */
    public int getDays()
    {
        return days;
    }
    
    /**
     * The Date of when the car is rented out to customer
    */
    public String getdateOfHire()
    {
        return dateOfHire;
    }    
 
    /**
     * The Date of when the car is returned to the company by the customer
     */
    public String getdateOfReturn()
    {
        return dateOfReturn;
    }
    /**
     * Returns the total rent accumulated for the car
     */
    public int getTotalRent()
    {
        return totalrent;
    }
    /**
     * Checks whether car is on loan or not
     */
    public boolean isCarOnLoan()
    {
        return onLoan;
    }
    
    /**
     *  This method will change the value of the daily rate to a new rate
     */
    public void changeRate (int newRate)
    {
      rate = newRate ;
    }
    
    /**
     * This method will change the downpayment of the car to a new downpayment
     */
    public void changedownPayment (int newdownPayment)
    {
        downPayment = newdownPayment ;
    }
    
  /**
  * This method to rent car will ask the user for the customer name, date required, dateofhire and the number of days the car is rented out for.
  * If the car is on Loan then a an output message will appear showing the user that the car is on loan until return date
  * Else if car is not on Loan user will enter in the required details
  * The total rent will be accumalated for each car rented out everytime
  * 
  */
    public void rentCar(String newCustomer, String NewDateRequired, String NewDateOfReturn, int NumberOfDays)
    {
     if (onLoan==true)
    {
          System.out.println ("This car is already on loan until the return date" + dateOfReturn);

    }    
    else
    {
        setCustomer(newCustomer);
        dateOfHire = NewDateRequired;
        dateOfReturn = NewDateOfReturn;
        days = NumberOfDays;
        onLoan = true;
        
    totalrent = totalrent + downPayment + (rate * days);
   }
   }


/**
 * This method will enable the user to returncar to rental company.
 * Once car is returned to  rental company the On Loan status will change from true to false
 */
    public void returnCar() 
    {
    if (onLoan==false)
    {
    System.out.println ("this car is not on loan as it is available to rent"); 
    }
    else
    {
       setCustomer ("");
       dateOfHire = "";
       dateOfReturn = "";
       days = 0;
       onLoan = false;
               
    }

    }
 /**
    * The description of the car rented out is shown as an output
    * The Total Rent money accumulated for the car is also shown as an output
    */

    public void displayCarRented()
    {
     System.out.println("The description of the car rented out is " + getdescription() + ".");
     System.out.println("The Total money accumalated for the car is " + "£" + totalrent);
     System.out.println();
    
    // update total rent accumalated
    }
/**
 * The Descrption and Customer name will be called throught the Car super class
 * DownPayment and Rate is shown as a print line output
 * If Car is on loan the date or hire, date of return and number of days on loan is shown as an output
 */
 public void displayCar()
   {
        super.displayCar();
        System.out.println("The down payment of this car is " + "£" + downPayment);
        System.out.println("The daily rate of this car is " + "£" + rate);
        
        if (onLoan==true)
        {
           System.out.println("The date of hire of this car is " + dateOfHire);
           System.out.println("The date of return of this car is " + dateOfReturn);
           System.out.println("The number of days this car is rented out for is " + days);
        }
    
   }
}
