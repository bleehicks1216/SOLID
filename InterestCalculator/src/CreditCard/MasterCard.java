package CreditCard;
import Calculator.ICalculateCreditCardInterest;
public class MasterCard extends CreditCard implements ICalculateCreditCardInterest {

	@Override
	public double calculate(double balance) {
		return balance * .05;
	}

}
