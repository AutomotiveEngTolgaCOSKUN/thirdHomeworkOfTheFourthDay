package homework5GameManagerDay4;

public class Game {

	int id;
	String gameName;
	double gameCost;
	String gameSize;
	String releaseDate;

	public Game() {

	}

	public Game(int id, String gameName, String releaseDate, String gameSize, double gameCost) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.gameCost = gameCost;
		this.gameSize = gameSize;
		this.releaseDate = releaseDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGameCost() {
		return gameCost;
	}

	public void setGameCost(int gameCost) {
		this.gameCost = gameCost;
	}

	public String getGameSize() {
		return gameSize;
	}

	public void setGameSize(String gameSize) {
		this.gameSize = gameSize;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

}
