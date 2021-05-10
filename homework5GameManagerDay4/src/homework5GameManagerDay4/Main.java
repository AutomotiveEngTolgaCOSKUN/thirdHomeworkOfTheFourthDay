package homework5GameManagerDay4;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game(1, "Euro Truck Simulator ", "25.07.1998 ", "15 GB ", 55);
		Game game2 = new Game(2, "Car Mechanic Simulator 2018 ", "07.03.2018 ", "32 GB ", 117);
		Game game3 = new Game(3, "Sniper Ghost Warrior 3 ", "05.21.2019 ", "45 GB ", 183);
		Game game4 = new Game(4, "Rise of The Tom Reider ", "19.08.2005 ", "60 GB ", 71);

		GameBuyingManager gameBuyingManager = new GameBuyingManager(new MernisServiceAdapter());
		CampaignManager campaignManager = new CampaignManager();

		Campaign campaign1 = new Campaign(1, "Steam Chiristmas Campaign ", "05.01.2022 ", 70);
		campaignManager.addCampaign(campaign1);
		Campaign campaign2 = new Campaign(2, "Epic Games Dark Friday ", "17.12.2021", 80);
		campaignManager.addCampaign(campaign2);

		NewGamerMemberManager newGamerMemberManager = new NewGamerMemberManager(new MernisServiceAdapter());
		NewGamerMember newGamerMember = new NewGamerMember(1, "Tolga", "ÇOÞKUN", "25049193520", 1992, 1000, 35);
		NewGamerMember newGamerMember1 = new NewGamerMember(2, "Özkan", "TEKE", "61141306024", 1993, 500, 0);
		newGamerMemberManager.addNewGamerMember(newGamerMember);
		newGamerMemberManager.addNewGamerMember(newGamerMember1);

		gameBuyingManager.buyWithoutCampaign(newGamerMember, game1);
		gameBuyingManager.buyWithCampaign(newGamerMember1, game2, campaign1);
		gameBuyingManager.buyWithoutCampaign(newGamerMember, game3);
		gameBuyingManager.buyWithoutCampaign(newGamerMember1, game4);

		newGamerMemberManager.updateNewGamerMember(newGamerMember, 40);

	}

}
