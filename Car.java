
/**
 * Author: Nikhil Shah
 * ID Number 11061376
 * Car Super Class
 */
public class Car
   {
   // the name of the customer
   private String description;
   // the name of the customer
   private String customer;
   
   public Car (String CarDescription)
   {
       description = CarDescription;
       customer = ""; 
   }
   
   /**
     * The description of the Car
     */
    public String getdescription()
    
    {
        return description;
    }
    
   /**
     * The name of the customer
     */
    public String getcustomer()
    {
       return customer;
    }
    
   /**
     *  This method will enable the user to change the customer name to a new customer name.
     */
    public void setCustomer (String newCustomer)
    {
      customer = newCustomer;
    }
  /**
   * The description and customer is shown as an output for when the car is sold or rented out.
   */
  public void displayCar()
  {
      System.out.println("The car description is " + description);
     
      if (customer != "")
      {
          System.out.println("The name of the customer is " + customer);
      }
   }
    
      
}