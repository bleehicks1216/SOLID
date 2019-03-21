package UnitTesting;
import Person.Person;
import Wallet.Wallet;
import CreditCard.Visa;
import CreditCard.Discover;
import CreditCard.MasterCard;
import Calculator.CalculateWalletTotalInterest;
import Calculator.CalculatePersonTotalInterest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase1 {

	@Test
	void test() {
		Person p = new Person();
		Wallet w = new Wallet();
		MasterCard mc = new MasterCard();
		Visa v = new Visa();
		Discover d = new Discover();
		w.cards.add(mc);
		w.cards.add(v);
		w.cards.add(d);
		assertEquals(10.0, v.calculate(v.balance));
		v.interest = v.calculate(v.balance);
		assertEquals(5.0, mc.calculate(mc.balance));
		mc.interest = mc.calculate(mc.balance);
		assertEquals(1.0, d.calculate(d.balance));
		d.interest = d.calculate(d.balance);
		w.interest = new CalculateWalletTotalInterest().calculateWalletTotalInterest(w.cards);
		p.wallets.add(w);
		p.interest = new CalculatePersonTotalInterest().calculatePersonTotalInterest(p.wallets);
		assertEquals(16.0, p.interest);
		
	}

}
