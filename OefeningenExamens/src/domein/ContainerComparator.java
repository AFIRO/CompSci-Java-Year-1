package domein;

import java.util.Comparator;

public class ContainerComparator implements Comparator<Container> {

	@Override
	public int compare(Container o1, Container o2) {
		return Integer.valueOf(o1.getMassa()).compareTo(Integer.valueOf(o2.getMassa()));
	}
	

}
