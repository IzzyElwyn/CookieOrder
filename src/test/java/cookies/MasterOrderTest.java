
package cookies;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MasterOrderTest {

	@Test
	public void shouldReturnTotalBoxesAsOne() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder(" ", 1));
		int check = underTest.getTotalBoxes();
		assertEquals(1, check);
	}

	@Test
	public void shouldReturnTotalBoxesAsTwo() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder(" ", 1));
		underTest.addOrder(new CookieOrder(" ", 1));
		int check = underTest.getTotalBoxes();
		assertEquals(2, check);
	}

	@Test
	public void shouldReturnTotalBoxesAsThree() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder(" ", 1));
		underTest.addOrder(new CookieOrder(" ", 1));
		underTest.addOrder(new CookieOrder(" ", 1));
		int check = underTest.getTotalBoxes();
		assertEquals(3, check);
	}

	@Test
	public void shouldReturnTotalBoxesAsSix() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder(" ", 2));
		underTest.addOrder(new CookieOrder(" ", 2));
		underTest.addOrder(new CookieOrder(" ", 1));
		underTest.addOrder(new CookieOrder(" ", 1));
		int check = underTest.getTotalBoxes();
		assertEquals(6, check);
	}

	@Test
	public void shouldRemoveTagalongsFromOrder() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("tagalongs", 2));
		underTest.addOrder(new CookieOrder("samoas", 2));
		underTest.removeVariety("tagalongs");
		int check = underTest.getTotalBoxes();
		assertEquals(2, check);

	}

	@Test
	public void shouldRemoveAllTagalongsFromOrder() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("tagalongs", 2));
		underTest.addOrder(new CookieOrder("tagalongs", 2));
		underTest.addOrder(new CookieOrder("samoas", 2));
		underTest.removeVariety("tagalongs");
		int check = underTest.getTotalBoxes();
		assertEquals(2, check);

	}

	@Test
	public void shouldPrintMyListOfOrders() {
		MasterOrder underTest = new MasterOrder();
		underTest.addOrder(new CookieOrder("tagalongs", 2));
		underTest.addOrder(new CookieOrder("tagalongs", 2));
		underTest.addOrder(new CookieOrder("samoas", 2));
		underTest.showOrder();

	}
}
