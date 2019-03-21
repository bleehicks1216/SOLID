package UnitTesting;
import Person.Person;
import Wallet.Wallet;
import CreditCard.Visa;
import CreditCard.MasterCard;
import Calculator.CalculateWalletTotalInterest;
import Calculator.CalculatePersonTotalInterest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase3 {

	@Test
	void test() {
		Person p1 = new Person();
		Person p2 = new Person();
		Wallet w1 = new Wallet();
		Wallet w2 = new Wallet();
		Visa v1 = new Visa();
		Visa v2 = new Visa();
		MasterCard mc1 = new MasterCard();
		MasterCard mc2 = new MasterCard();
		v1.interest = v1.calculate(v1.balance);
		v2.interest = v2.calculate(v2.balance);
		mc1.interest = mc1.calculate(mc1.balance);
		mc2.interest = mc2.calculate(mc2.balance);
		w1.cards.add(v1);
		w1.cards.add(mc1);
		w2.cards.add(v2);
		w2.cards.add(mc2);
		w1.interest = new CalculateWalletTotalInterest().calculateWalletTotalInterest(w1.cards);
		assertEquals(15.0, w1.interest);
		p1.wallets.add(w1);
		p1.interest = new CalculatePersonTotalInterest().calculatePersonTotalInterest(p1.wallets);
		assertEquals(15.0, p1.interest);
		p2.wallets.add(w2);
		w2.interest = new CalculateWalletTotalInterest().calculateWalletTotalInterest(w2.cards);
		assertEquals(15.0, w2.interest);
		p2.interest = new CalculatePersonTotalInterest().calculatePersonTotalInterest(p2.wallets);
	}

}
