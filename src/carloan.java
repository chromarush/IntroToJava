public class carloan {
	public static void main(String[] args) {
    
    int carLoan = 10000;
    int loanLength = 3;
    int interestRate = 5;
    int downPayment = 2000;
    
    if ((loanLength <= 0) && (interestRate < 0)){
    	
      System.out.println("This is not a valid car loan!");
      
    } else if (downPayment >= carLoan){
    	
      System.out.println("Car is paid in full. Thank you!");
      
    } else{
    	
  int remainingBallance = carLoan - downPayment;
  int months = loanLength * 12;
  int monthlyBallance = remainingBallance/months;
  int interest = (interestRate * monthlyBallance)/100;
  int monthlyPayment = monthlyBallance + interest;

      
      System.out.println("Your monthly payment will be "+ "$" + monthlyPayment);
      
      System.out.println("Your remaining ballance is "+ "$" + remainingBallance);
    }
    

	}
}