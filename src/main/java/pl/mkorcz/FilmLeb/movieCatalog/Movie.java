package pl.mkorcz.FilmLeb.movieCatalog;

public class Movie {
    private int movieId;
    private String movieName;

    public Movie(int id, String title) {
        this.movieId = id;
        this.movieName = title;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
