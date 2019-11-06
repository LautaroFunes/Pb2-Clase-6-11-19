import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Bar {

	Set<Cliente> clientes = new TreeSet<Cliente>();

	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}

---Despues del recreo /Orden Nombre y apellido/ --->
	
	

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Bar {

	Set<Cliente> clientes = new TreeSet<Cliente>();

	public Bar(Comparator orden) {
		clientes = new TreeSet<Cliente>(orden);
	}

	public void cambiarOrdenamiento(Comparator orden) {
		Set<Cliente> clientesOrdenados = new TreeSet(orden);
			clientesOrdenados.addAll(clientes);
			clientes = clientesOrdenados;
	}
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}

}
