package domein;
package domein;

import java.security.SecureRandom;

public class Product
{
    private String soort;
    private double adviesprijs;
    
    public Product(String soort, double adviesprijs)
    {
        this.soort = soort;
        this.adviesprijs = adviesprijs;
    }
    
    public final double getAdviesprijs()
    {
        return adviesprijs;
    }

    public double bepaalKostprijs()
    {
        SecureRandom sr = new SecureRandom();
        int korting = sr.nextInt(25) + 1;
        return adviesprijs * (1 - korting/100.0);
    }
    
    @Override
    public String toString()
    {
        return String.format("%s kost in de winkel %.2f euro", soort, bepaalKostprijs());
    }
}