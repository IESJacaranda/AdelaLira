import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import shoppingCart.Product;
import shoppingCart.ProductNotFoundException;
import shoppingCart.ShoppingCart;


class ShoppingCartTest {

	private ShoppingCart shoppingCart;
	@BeforeEach
	public void init() {
		shoppingCart = new ShoppingCart();
	}

	
	@Test
	void testShoppingCart() {
		ShoppingCart shoppingCart = new ShoppingCart();
		assertEquals(0, shoppingCart.getItemCount());
	}

	@Test
	void testGetBalance() {
		Product producto1 = new Product("Tostadora", 15.99);
		Product producto2 = new Product("Aspiradora", 89.99);
		Product producto3 = new Product("Plancha", 25.99);
		shoppingCart.addItem(producto1);
		shoppingCart.addItem(producto2);
		shoppingCart.addItem(producto3);
		assertEquals(131.97, shoppingCart.getBalance());	
	}

	@Test
	void testAddItem() {
		//Cuando se añade un producto, el número de elementos debe incrementarse.
		Product producto1 = new Product("Tostadora", 15.99);
		Product producto2 = new Product("Aspiradora", 89.99);
		shoppingCart.addItem(producto1);
		shoppingCart.addItem(producto2);
		assertEquals(2, shoppingCart.getItemCount());
	}

	@Test
	void testRemoveItem() {
		//Cuando se elimina un producto, el número de elementos debe decrementarse.
		Product producto1 = new Product("Tostadora", 15.99);
		Product producto2 = new Product("Aspiradora", 89.99);
		shoppingCart.addItem(producto1);
		shoppingCart.addItem(producto2);
		try {
			shoppingCart.removeItem(producto1);
		} catch (ProductNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1, shoppingCart.getItemCount());
	}

	@Test
	void testGetItemCount() {
		Product producto1 = new Product("Tostadora", 15.99);
		Product producto2 = new Product("Aspiradora", 89.99);
		Product producto3 = new Product("Plancha", 25.99);
		shoppingCart.addItem(producto1);
		shoppingCart.addItem(producto2);
		shoppingCart.addItem(producto3);
		assertEquals(3, shoppingCart.getItemCount());
	}

	@Test
	void testEmpty() {
		Product producto1 = new Product("Tostadora", 15.99);
		Product producto2 = new Product("Aspiradora", 89.99);
		Product producto3 = new Product("Plancha", 25.99);
		shoppingCart.addItem(producto1);
		shoppingCart.addItem(producto2);
		shoppingCart.addItem(producto3);
		shoppingCart.empty();
		assertEquals(0, shoppingCart.getItemCount());
	}

}
