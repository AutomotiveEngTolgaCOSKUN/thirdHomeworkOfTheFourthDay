package homework5GameManagerDay4;

public interface GameBuyingService {

	public void buyWithCampaign(NewGamerMember newGamerMember, Game game, Campaign campaign);

	void buyWithoutCampaign(NewGamerMember newGamerMember, Game game);

}
