package marche.traitement.production;

import marche.traitement.produits.Cochon;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class EnclosCochonTest {

    @Test
    public void testCreerCochon () {
        EnclosCochon enclos = new EnclosCochon(100, "PACA");
        Cochon cochon = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 245, "cochon");

        assert (cochon != null);
    }

    @Test
    public void testCreerCochon_verifIdCochon () {
        EnclosCochon enclos = new EnclosCochon(100, "PACA");
        Cochon cochon1 = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 245, "cochon");
        Cochon cochon2 = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 300, "cochon");

        assert (cochon1.getIdCochon() != cochon2.getIdCochon());
    }

    @Test
    public void testCreerCochon_inventaireIsNotNull () {
        EnclosCochon enclos = new EnclosCochon(100, "PACA");
        Cochon cochon1 = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 245, "cochon");
        Cochon cochon2 = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 300, "cochon");

        assert (enclos.getInventaireUniteDeProduction() != null);
    }

    @Test
    public void testCreerCochon_tailleInventaireEgal2 () {
        EnclosCochon enclos = new EnclosCochon(100, "PACA");
        Cochon cochon1 = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 245, "cochon");
        Cochon cochon2 = enclos.creerCochon(110, LocalDate.of(2100, Month.SEPTEMBER, 12), (short)96, 300, "cochon");

        assert (enclos.getInventaireUniteDeProduction().size() == 2);
    }
}