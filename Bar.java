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
