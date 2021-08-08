package domein;

public class DomeinController
{
    private final KostenRepository kr;
	
    public DomeinController()
    {
            kr = new KostenRepository();
    }
        
    public String geefOverzichtAantalDocumenten()
    {
        return kr.geefOverzichtAantalDocumenten();
    }
    
     public String geefKostenLijst()
     {
         return kr.geefKostenLijst();
     }
     
     public void voegKostToe(Kosten kost) {
     	kr.voegKostToe(kost);
     	
 		
 	}
     
}
