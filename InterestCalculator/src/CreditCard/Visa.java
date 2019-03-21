package CreditCard;
import Calculator.ICalculateCreditCardInterest;
public class Visa extends CreditCard implements ICalculateCreditCardInterest {

	@Override
	public double calculate(double balance) {
		return balance * .1;
	}
	
}
