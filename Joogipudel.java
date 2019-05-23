import java.util.*;

public class Joogipudel {
    public double mahtLiitrites = 0.0;
    public double hetkeLiitrid = 0.0;
    public PudeliTyyp pudeliTyyp;
    public double massKg = 0.0;
    public double taaraMaksumus = 0.0;
    public Jook jook = null;

    public Joogipudel(double mahtL, double massInKg, double taaraMaks, Jook j, PudeliTyyp pTyyp) {
        this.mahtLiitrites = mahtL;
        this.pudeliTyyp = pTyyp;
        this.massKg = massInKg;
        this.taaraMaksumus = taaraMaks;
        this.jook = j;
    }

    public double getMass() {
        double val = this.massKg;

        if(this.jook != null) {
            val += this.jook.eriKaal * this.mahtLiitrites;
        }

        return val;
    }

    public double getOmahind() {
        double val = this.taaraMaksumus;

        if(this.jook != null) {
            val += this.jook.liitriOmaHind * this.mahtLiitrites;
        }

        return val;
    }
}