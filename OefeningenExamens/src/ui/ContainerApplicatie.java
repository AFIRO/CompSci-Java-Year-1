package ui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import domein.Container;
import domein.ContainerComparator;

public class ContainerApplicatie {

    public static void main(String[] args) {
    	List<Container> containers = new ArrayList<>();
        
        containers.add(new Container("Antwerpen", 60, 150, 1234));
        containers.add(new Container("Rotterdam", 70, 110, 2568));
        containers.add(new Container("Calais", 80, 90, 8569));
        containers.add(new Container("Brugge", 70, 100, 8564));
         
        // Stap 1
        System.out.println("Containers bij natuurlijke sortering: ");
        Collections.sort(containers);
        
        for (Container e : containers)
        	System.out.printf("%dm2 - %s - %dkg%n", e.getVolume(), e.getEigenaar(), e.getMassa());
        
        // Stap 2
        System.out.println();
        System.out.println("Containers bij sortering op massa: ");
       Collections.sort(containers, new Comparator<Container>() {

		@Override
		public int compare(Container o1, Container o2) {
			return Integer.valueOf(o1.getMassa()).compareTo(Integer.valueOf(o2.getMassa()));
		}
	});
        
        for (Container e : containers)
        	System.out.printf("%dm2 - %s - %dkg%n", e.getVolume(), e.getEigenaar(), e.getMassa());
        
        // Stap 3
        System.out.println();
        System.out.println("Containers bij sortering op eigenaar: ");
        Collections.sort(containers, (o1,o2) -> o1.getEigenaar().compareTo(o2.getEigenaar()));
			
        for (Container e : containers)
        	System.out.printf("%dm2 - %s - %dkg%n", e.getVolume(), e.getEigenaar(), e.getMassa());
        
        //step 4: op serienummer met method reference
        System.out.println();
        System.out.println("Containers bij sortering op serienummer: ");
        
        Collections.sort(containers, Container::compareSerial);
        for (Container e : containers)
        	System.out.printf("%d - %dm2 - %s - %dkg%n",e.getSerialNumber(), e.getVolume(), e.getEigenaar(), e.getMassa());
        
        
    }
}