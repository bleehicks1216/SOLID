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

class TestCase2 {

	@Test
	void test() {
		Person p = new Person();
		Wallet w1 = new Wallet();
		Wallet w2 = new Wallet();
		Visa v = new Visa();
		MasterCard mc = new MasterCard();
		Discover d = new Discover();
		
		w1.cards.add(v);
		w1.cards.add(d);
		w2.cards.add(mc);
		assertEquals(10.0, v.calculate(v.balance));
		v.interest = v.calculate(v.balance);
		assertEquals(5.0, mc.calculate(mc.balance));
		mc.interest = mc.calculate(mc.balance);
		assertEquals(1.0, d.calculate(d.balance));
		d.interest = d.calculate(d.balance);
		w1.interest = new CalculateWalletTotalInterest().calculateWalletTotalInterest(w1.cards);
		assertEquals(11.0, w1.interest);
		w2.interest = new CalculateWalletTotalInterest().calculateWalletTotalInterest(w2.cards);
		assertEquals(5.0, w2.interest);
		p.wallets.add(w1);
		p.wallets.add(w2);
		p.interest = new CalculatePersonTotalInterest().calculatePersonTotalInterest(p.wallets);
		assertEquals(16.0, p.interest);
	}

}
