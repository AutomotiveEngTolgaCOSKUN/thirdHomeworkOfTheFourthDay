package homework5GameManagerDay4;

public class NewGamerMember {

	int id;
	String firstName;
	String lastName;
	String nationalityId;
	int age;
	double wallet;
	int gamesOwned;

	public NewGamerMember() {

	}

	public NewGamerMember(int id, String firstName, String lastName, String nationalityId, int age, double wallet,
			int gamesOwned) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.age = age;
		this.wallet = wallet;
		this.gamesOwned = gamesOwned;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWallet() {
		return wallet;
	}

	public void setDiscount(double wallet) {
		this.wallet = wallet;
	}

	public int getGamesOwned() {
		return gamesOwned;
	}

	public void setGamesOwned(int gamesOwned) {
		this.gamesOwned = gamesOwned;
	}

}
