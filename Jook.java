import java.util.*;

public class Jook {
    public String nimetus;
    public double liitriOmaHind;
    public double eriKaal;
    public JoogiTyyp joogiTyyp;

    public Jook(String nim, double liiter, double kaal, JoogiTyyp jTyyp) {
        this.nimetus = nim;
        this.liitriOmaHind = liiter;
        this.eriKaal = kaal;
        this.joogiTyyp = jTyyp;
    }
}