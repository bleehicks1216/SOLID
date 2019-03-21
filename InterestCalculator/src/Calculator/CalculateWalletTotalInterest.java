package Calculator;
import CreditCard.CreditCard;
import java.util.*;
public class CalculateWalletTotalInterest {
	
	public CalculateWalletTotalInterest() {
		
	}
	
	public double calculateWalletTotalInterest(List<CreditCard> cards) {
		double interest = 0.0;
		for(CreditCard card : cards) {
			interest += card.interest;
		}
		return interest;
	}
}
