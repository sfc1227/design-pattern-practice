package practice.abstractFactory;

interface MovieFactory {
	Movie getMovie(String type);
}

class HollyWoodMovieFactory implements MovieFactory {
	public Movie getMovie(String type) {
		if (type.equalsIgnoreCase("action")) {
			return new HollyWoodActionMovie();
		} else if (type.equalsIgnoreCase("comedy")) {
			return new HollyWoodComedyMovie();
		}
		return null;
	}
}

class BollyWoodMovieFactory implements MovieFactory {

	public Movie getMovie(String type) {
		if (type.equalsIgnoreCase("action")) {
			return new BollyWoodActionMovie();
		} else if (type.equalsIgnoreCase("comedy")) {
			return new BollyWoodComedyMovie();
		}
		return null;
	}
}
