import java.util.*;

class Joogivaat {
	public double ruumala = 0.0;
	public double joogiKogusLiitrites = 0.0;
	public Joogivaat(double r, double j){
		this.ruumala = r;
		this.joogiKogusLiitrites = j;
	}
	public boolean taidaPudel(Joogipudel pudel) {
		double canBeFilled = (pudel.mahtLiitrites - pudel.hetkeLiitrid);
		double filled = canBeFilled - this.joogiKogusLiitrites;

		if(filled < 0) {
			this.joogiKogusLiitrites = (filled * -1);
			filled = 0;
		}

		pudel.hetkeLiitrid += (canBeFilled - filled);
		return true;
	}
}