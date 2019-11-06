import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestBar {

	Cliente c1 = new Cliente("Roberto1", "Rodriguez", 11111111);
	Cliente c2 = new Cliente("Roberto2", "Rodriguez", 22222222);
	Cliente c3 = new Cliente("Matias3", "Fernandez", 444444444);
	Cliente c4 = new Cliente("Roberto4", "Rodriguez", 33333333);
	Bar b1 = new Bar();
	
	@Test
	public void agregarClienteDos() {
		b1.agregarCliente(c1);
		b1.agregarCliente(c2);
		b1.agregarCliente(c3);
		b1.agregarCliente(c4);
		
		assertEquals(b1.getClientes().size(), 4);
		
		for(Cliente v : b1.getClientes()) {
			System.out.println(v);
		}
		
	}

}

---Despues del recreo /Orden Nombre y apellido/ --->
	


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestBar {

	Cliente c1 = new Cliente("Roberto", "Rodriguez", 11111111);
	Cliente c2 = new Cliente("Roberto", "Rodrigues", 22222222);
	Cliente c3 = new Cliente("Matias3", "Fernandez", 444444444);
	Cliente c4 = new Cliente("Roberto4", "Aaaaodriguez", 33333333);
	
	OrdenNyA onya = new OrdenNyA();
	
	Bar b1 = new Bar(onya);
	
	@Test
	public void agregarClienteDos() {
		b1.agregarCliente(c1);
		b1.agregarCliente(c2);
		b1.agregarCliente(c3);
		b1.agregarCliente(c4);
		
		assertEquals(b1.getClientes().size(), 4);
		
		for(Cliente v : b1.getClientes()) {
			System.out.println(v);
		}
		
	}

}
