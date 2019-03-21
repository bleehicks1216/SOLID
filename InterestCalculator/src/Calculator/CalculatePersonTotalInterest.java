package Calculator;
import Wallet.Wallet;
import java.util.*;
public class CalculatePersonTotalInterest {

	public CalculatePersonTotalInterest() {
		
	}
	
	public double calculatePersonTotalInterest(List<Wallet> wallets) {
		double interest = 0.0;
		for(Wallet wallet : wallets) {
			interest += wallet.interest;
		}
		return interest;
	}
}
