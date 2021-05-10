package homework5GameManagerDay4;

public class GameBuyingManager implements GameBuyingService {

	NewGamerCheckService newGamerCheckService;

	public GameBuyingManager(NewGamerCheckService newGamerCheckService) {
		this.newGamerCheckService = newGamerCheckService;
	}

	@Override
	public void buyWithCampaign(NewGamerMember newGamerMember, Game game, Campaign campaign) {

		if (newGamerMember.wallet > game.gameCost && newGamerCheckService.CheckIfRealPerson(newGamerMember)) {
			newGamerMember.setDiscount(newGamerMember.getWallet() - game.gameCost * (campaign.discount / 100));
			newGamerMember.setGamesOwned(newGamerMember.getGamesOwned() + 1);

			System.out.println(newGamerMember.firstName + newGamerMember.lastName + " " + game.gameName
					+ "Added Your Games With " + (game.gameCost * (campaign.discount / 100)) + "$ Now has "
					+ newGamerMember.getGamesOwned() + " Piece Games");
		} else if (newGamerMember.wallet < game.gameCost) {
			System.out.println("Purchase Failed. Your Wallet Has Not Enough Money For " + game.gameName);

		} else {
			System.out.println("Incorrect Operation!!!");
		}

	}

	@Override
	public void buyWithoutCampaign(NewGamerMember newGamerMember, Game game) {
		if (newGamerMember.wallet > game.gameCost && newGamerCheckService.CheckIfRealPerson(newGamerMember)) {
			newGamerMember.setDiscount(newGamerMember.getWallet() - game.gameCost);
			newGamerMember.setGamesOwned(newGamerMember.getGamesOwned() + 1);
			System.out.println(
					newGamerMember.firstName + newGamerMember.lastName + " " + game.gameName + "Added Your Games With "
							+ game.gameCost + "$ Now has " + newGamerMember.getGamesOwned() + " Piece Games");
		} else if (newGamerMember.wallet < game.gameCost) {
			System.out.println("Purchase Failed. Your Wallet Has Not Enough Money For " + game.gameName);

		} else {
			System.out.println("Incorrect Operation!!!");
		}
	}

}
