package homework5GameManagerDay4;

public class Campaign {

	int id;
	String campaignName;
	String thePeriodOfValidity;
	double discount;

	public Campaign() {

	}

	public Campaign(int id, String campaignName, String thePeriodOfValidity, double discount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.thePeriodOfValidity = thePeriodOfValidity;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public String getThePeriodOfValidity() {
		return thePeriodOfValidity;
	}

	public void setThePeriodOfValidity(String thePeriodOfValidity) {
		this.thePeriodOfValidity = thePeriodOfValidity;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

}
