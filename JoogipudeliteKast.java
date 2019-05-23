import java.util.*;
import java.util.ArrayList;

class JoogipudeliteKast {
	public KastiTyyp kastiTyyp;
	public double kastiHind;
	public double kastiMassKg;
	public int pesadeArv;
	public ArrayList<Joogipudel> pudelid = new ArrayList<Joogipudel>();

	public JoogipudeliteKast(KastiTyyp kTyyp, double hind, double mass, int pesad) {
		this.kastiTyyp = kTyyp;
		this.kastiHind = hind;
		this.kastiMassKg = mass;
		this.pesadeArv = pesad;
	}

	public double getTotalMass() {
		double val = this.kastiMassKg;

		for (int i = 0; i < pudelid.size(); i++) {
			val += pudelid.get(i).getMass();
		}
		return val;
	}

	public double getTotalPrice() {
		double val = this.kastiHind;

		for (int i = 0; i < pudelid.size(); i++) {
			val += pudelid.get(i).getOmahind();
		}
		return val;
	}

	public void fillBottles(Joogivaat vaat) {
		this.pudelid.forEach((pudel) -> vaat.taidaPudel(pudel));
	}
}