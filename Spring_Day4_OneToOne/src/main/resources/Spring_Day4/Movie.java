package Spring_Day4;

public class Movie {
	private String movieName;
	private float movieBudget;
	private double movieDuration;
	private String movieHero1;
	private String movieHero2;
	private String movieHero3;
	private String movieHeroine;

	public Movie(String movieName, float movieBudget, double movieDuration, String movieHero1, String movieHero2,
			String movieHero3, String movieHeroine) {
		super();
		this.movieName = movieName;
		this.movieBudget = movieBudget;
		this.movieDuration = movieDuration;
		this.movieHero1 = movieHero1;
		this.movieHero2 = movieHero2;
		this.movieHero3 = movieHero3;
		this.movieHeroine = movieHeroine;
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieBudget=" + movieBudget + ", movieDuration=" + movieDuration
				+ ", movieHero1=" + movieHero1 + ", movieHero2=" + movieHero2 + ", movieHero3=" + movieHero3
				+ ", movieHeroine=" + movieHeroine + "]";
	}

}
