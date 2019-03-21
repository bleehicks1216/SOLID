package CreditCard;
import Calculator.ICalculateCreditCardInterest;
public class Discover extends CreditCard implements ICalculateCreditCardInterest{

	@Override
	public double calculate(double balance) {
		return balance * .01;
	}

}
