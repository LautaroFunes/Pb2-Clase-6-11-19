import java.util.Comparator;

public class OrdenNyA  implements Comparator <Cliente>{

	@Override
	public int compare(Cliente o1, Cliente o2) {
		if((o1.getNombre().compareTo(o2.getNombre()) == 0)) {
			return o1.getApellido().compareTo(o2.getApellido());
		}
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
