package homework5GameManagerDay4;

public class NewGamerMemberManager implements NewGamerMemberService {

	NewGamerCheckService newGamerCheckService;

	public NewGamerMemberManager(NewGamerCheckService newGamerCheckService) {
		this.newGamerCheckService = newGamerCheckService;
	}

	@Override
	public void addNewGamerMember(NewGamerMember newGamerMember) {
		if (newGamerCheckService.CheckIfRealPerson(newGamerMember)) {
			System.out.println("Add Successful: New Gamer is " + newGamerMember.firstName + " "
					+ newGamerMember.lastName + " " + newGamerMember.nationalityId + " " + newGamerMember.age
					+ " and has " + newGamerMember.wallet + "$");

		} else {
			System.out.println("Not a valid person");
		}

	}

	@Override
	public void updateNewGamerMember(NewGamerMember newGamerMember, double addedMoney) {
		if (newGamerCheckService.CheckIfRealPerson(newGamerMember)) {
			double newWallet = newGamerMember.getWallet() + addedMoney;
			newGamerMember.setDiscount(newWallet);
			System.out.println("Member Updated" + " " + Math.round(newWallet) + "$");
		} else {
			System.out.println("Member did not updated");
		}

	}

	@Override
	public void deleteNewGamerMember(NewGamerMember newGamerMember) {
		System.out.println("Member Deleted");

	}

}
