
public class Converter {
	double usd_rate;
	double euro_rate;
	Converter(double usd_rate, double euro_rate){
		this.usd_rate=usd_rate;
		this.euro_rate=euro_rate;
	}
	double hrn_to_usd(double hrn_sum) {
		return hrn_sum/usd_rate;
	}
	double hrn_to_euro(double hrn_sum) {
		return hrn_sum/euro_rate;
	}
	double usd_to_hrn(double usd_sum) {
		return usd_sum*usd_rate;
	}
	double euro_to_hrn(double euro_sum) {
		return euro_sum*euro_sum;
	}
	
}
