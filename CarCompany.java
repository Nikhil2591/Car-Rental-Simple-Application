
/**
 * Nikhil Shah
 * Student ID: 11061376
 * CarCompany Class
 */
import java.awt. *;
import java.awt.event. *;
import javax.swing. *;
import java.util.ArrayList;

public class CarCompany implements ActionListener
{
  private ArrayList <Car> cars;  
  private JTextField DescriptionTextField;
  private JTextField DownPaymentTextField;
  private JTextField DailyRateTextField;
  private JTextField ThePriceTextField;
  private JTextField YearOfRegistrationTextField;
  private JTextField MileageTextField;
  private JTextField CustomerNameTextField;
  private JTextField DateOfHireTextField;
  private JTextField DateOfReturnTextField;
  private JTextField NumberOfDaysTextField;
  private JTextField CarNumberTextField;
  private JLabel EmptyStringLabel1;
  private JLabel EmptyStringLabel2;
  private JLabel DescriptionLabel;
  private JLabel DownPaymentLabel;
  private JLabel DailyRateLabel;
  private JLabel ThePriceLabel;
  private JLabel YearOfRegistrationLabel;
  private JLabel MileageLabel;
  private JLabel CustomerNameLabel;
  private JLabel DateOfHireLabel;
  private JLabel DateOfReturnLabel;
  private JLabel NumberOfDaysLabel;
  private JLabel CarNumberLabel;
  private JButton AddCarToRentButton;
  private JButton AddCarToSellButton;
  private JButton RentACarButton;
  private JButton ReturnACarButton;
  private JButton SellACarButton;
  private JButton DisplayAllButton;
  private JButton ClearButton;
 
  private JFrame frame;
  
  /**
   * This constructor will set the GUI layout of the programme. The GUI layout is a grid layout with 8 columns and 4 rows. 
   * The GUI layout will have all of the relevent buttons, text fields and labels.
   * The user should be able to select an appropriate command through the GUI.
   */
  public CarCompany()
  {
    cars = new ArrayList<Car>();  
    frame = new JFrame("CarCompanyGridLayOut");
    
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new GridLayout(8,4));
        
        DescriptionLabel = new JLabel("Description");
        contentPane.add( DescriptionLabel);
        
        DownPaymentLabel = new JLabel("Down Payment");
        contentPane.add(DownPaymentLabel);
        
        DailyRateLabel = new JLabel("Daily Rate");
        contentPane.add(DailyRateLabel);
        
        EmptyStringLabel1 = new JLabel("");
        contentPane.add(EmptyStringLabel1);
        
        DescriptionTextField = new JTextField();
        contentPane.add(DescriptionTextField);
        
        DownPaymentTextField = new JTextField();
        contentPane.add(DownPaymentTextField);
        
        DailyRateTextField = new JTextField();
        contentPane.add(DailyRateTextField);
        
        AddCarToRentButton = new JButton("Add Car To Rent");
        contentPane.add(AddCarToRentButton);
        AddCarToRentButton.addActionListener(this);
       
        ThePriceLabel = new JLabel("The Price");
        contentPane.add(ThePriceLabel);
       
        YearOfRegistrationLabel = new JLabel("Year Of Registration");
        contentPane.add(YearOfRegistrationLabel);
        
        MileageLabel = new JLabel("Mileage");
        contentPane.add(MileageLabel);
        
        EmptyStringLabel2 = new JLabel("");
        contentPane.add(EmptyStringLabel2);
        
        ThePriceTextField = new JTextField();
        contentPane.add(ThePriceTextField);
        
        YearOfRegistrationTextField = new JTextField();
        contentPane.add(YearOfRegistrationTextField);
        
        MileageTextField = new JTextField();
        contentPane.add(MileageTextField);
        
        AddCarToSellButton = new JButton("Add Car To Sell");
        contentPane.add(AddCarToSellButton);
        AddCarToSellButton.addActionListener(this);
        
        CustomerNameLabel = new JLabel("Customer Name");
        contentPane.add(CustomerNameLabel);
        
        DateOfHireLabel = new JLabel("Date Of Hire");
        contentPane.add(DateOfHireLabel);
       
        DateOfReturnLabel = new JLabel("Date Of Return");
        contentPane.add(DateOfReturnLabel);
        
        NumberOfDaysLabel = new JLabel("Number Of Days");
        contentPane.add(NumberOfDaysLabel);
        
        CustomerNameTextField = new JTextField();
        contentPane.add(CustomerNameTextField);
        
        DateOfHireTextField = new JTextField();
        contentPane.add(DateOfHireTextField);
        
        DateOfReturnTextField = new JTextField();
        contentPane.add(DateOfReturnTextField);
        
        NumberOfDaysTextField = new JTextField();
        contentPane.add(NumberOfDaysTextField);
       
        CarNumberLabel = new JLabel ("Car Number");
        contentPane.add(CarNumberLabel);
        
        RentACarButton = new JButton("Rent A Car");
        contentPane.add(RentACarButton);
        RentACarButton.addActionListener(this);
        
        ReturnACarButton = new JButton("Return A Car");
        contentPane.add(ReturnACarButton);
        ReturnACarButton.addActionListener(this);
        
        SellACarButton = new JButton("Sell A Car");
        contentPane.add(SellACarButton);
        SellACarButton.addActionListener(this);
        
        CarNumberTextField = new JTextField();
        contentPane.add(CarNumberTextField);
       
        DisplayAllButton = new JButton("Display All");
        contentPane.add(DisplayAllButton);
        DisplayAllButton.addActionListener(this);
        
        ClearButton = new JButton("Clear");
        contentPane.add(ClearButton);
        ClearButton.addActionListener(this);
        
        frame.pack();
        frame.setVisible(true);
           
       
    
    }
    
  public String getDescription()
  {
      return DescriptionTextField.getText();
  }
 
   
   public int getDownPayment()
  {
    int downPayment = Integer.parseInt (DownPaymentTextField.getText());
    return downPayment;
  }
    
  public int getDailyRate()
  {
       int dailyRate = Integer.parseInt (DailyRateTextField.getText());
       return dailyRate;
  }
   
  public int getPrice()
  {
      int Price = Integer.parseInt (ThePriceTextField.getText());
      return Price;
  }
  
  public int getYearOfRegistration()
  {
     int YearOfRegistration = Integer.parseInt (YearOfRegistrationTextField.getText());
     return YearOfRegistration;
  }
  
  public int getMileage()
  {
      int Mileage = Integer.parseInt (MileageTextField.getText());
      return Mileage;
  }
  
  public String getCustomerName()
  {
      return CustomerNameTextField.getText();
  }
  
  public String getDateOfHire()
  {
      return DateOfHireTextField.getText();
  }
  
  public String getDateOfReturn()
  {
      return DateOfReturnTextField.getText();
  }
  
  public int getNumberOfDays()
  {
      int NumberOfDays = Integer.parseInt (NumberOfDaysTextField.getText());
      return NumberOfDays;
  }
  
  public int getCarNumber()
  {
      int CarNumber = Integer.parseInt (CarNumberTextField.getText());
      return CarNumber;
  }
  
  /**
  * This method will enable the user to add a car to rent through the GUI. 
  * This method will require the user to input the description, downpayment and daily rate into the GUI.
  */
  public void AddCarToRent()
  {
      CarToRent ACarToRent = new CarToRent(getDescription(),getDownPayment(),getDailyRate());
      cars.add(ACarToRent); 
  }

  /**
  * This method will enable the user to add a car to sell through the GUI.
  * This method will require the user to input the description, price, year of registration and mileage into the GUI.
  */
  public void AddCarToSell()
  {
      CarToSell ACarToSell = new CarToSell(getDescription(),getPrice(),getYearOfRegistration(),getMileage());
      cars.add(ACarToSell);
  }
  
  /**
  * This method will enable the user to rent out a car to a customer through the GUI.
  * The method will require the user to assign a car number to the customer the car is rented out to.
  */
  public void RentingACar()
  {
      int CarNumber = getCarNumber();
            
      if (CarNumber<0 || CarNumber>=cars.size())
     {  
       System.out.println("Sorry but we do not have that car number.");
     }
     else
     {
      CarToRent aCar = (CarToRent)cars.get(CarNumber);
      aCar.rentCar(getCustomerName(),getDateOfHire(),getDateOfReturn(),getNumberOfDays());
    }
  }
    
  /**
   * This method will enable the user to return a car from the customer through the GUI.
   * This method will require the user to input the car number to return car back to car company.
   */
  public void ReturningACar()
  {
      int CarNumber = getCarNumber();
      
      CarToRent aCar = (CarToRent)cars.get(CarNumber);
      aCar.returnCar();
  }
   
  /**
   * This method enables the user to sell a car to the customer through the GUI.
   * The user will have to input Car number and customer name to sell the car to the customer.
   */
  public void SellingACar()
  {
     int CarNumber = getCarNumber();
      
     if (CarNumber<0 || CarNumber>=cars.size())
  {  
     System.out.println("Sorry but we do not have that car number.");
  }
     else
   {   
    CarToSell aCar = (CarToSell)cars.get(CarNumber);
    aCar.sellCar(getCustomerName());
   }
}

/**
 * This method will display all of the cars rented or sold to a customer by getting the car number.
 */    

public void displayAllCars()
{
 int CarNumber = 0;
 for (Car car:cars)
 {
     System.out.println("The Number of this Car is " + CarNumber);
     car.displayCar();
     CarNumber++;
 }
}

/**
 * This method will clear all of the text fields on the terminal.
 */
public void clearAll()
{
 DescriptionTextField.setText("");  
 DownPaymentTextField.setText("");
 DailyRateTextField.setText("");
 ThePriceTextField.setText("");
 YearOfRegistrationTextField.setText("");
 MileageTextField.setText("");
 CustomerNameTextField.setText("");
 DateOfHireTextField.setText("");
 DateOfReturnTextField.setText("");
 NumberOfDaysTextField.setText("");
 CarNumberTextField.setText("");
}

/**
 * This method assigns each button with an action command to their relevant method.
 */ 
public void actionPerformed(ActionEvent event)
    {
        String ButtonCommand = event.getActionCommand();
        
        if (ButtonCommand.equals("Add Car To Rent"))
        {
           AddCarToRent();
        }

        if (ButtonCommand.equals("Add Car To Sell"))
        {
            AddCarToSell();
        }
        
       if (ButtonCommand.equals("Rent A Car"))
       {
            RentingACar();
       }
       
       if (ButtonCommand.equals("Return A Car"))
       {
            ReturningACar();
       }
       
      if (ButtonCommand.equals("Sell A Car"))
       {
            SellingACar();
       }
        
      if (ButtonCommand.equals("Display All"))
       {
            displayAllCars();
       }
       
       if (ButtonCommand.equals("Clear"))
       {
           clearAll();
       }
    }

}  
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    