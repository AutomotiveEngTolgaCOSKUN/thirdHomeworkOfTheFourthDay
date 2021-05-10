package homework5GameManagerDay4;

public class CampaignManager implements CampaignService {
	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("New Campaign : " + campaign.campaignName + " Campaign Discount Is : %" + campaign.discount
				+ " Campaign Last Day : " + campaign.thePeriodOfValidity);

	}

	@Override
	public void updateCampaign(Campaign campaign) {

		System.out.println("New Update Version : " + campaign.campaignName + " : Update Is Successful");

	}

	@Override
	public void deleteCampgaign(Campaign campaign) {
		System.out.println(campaign.campaignName + " : Delete Is Successful");

	}

}
