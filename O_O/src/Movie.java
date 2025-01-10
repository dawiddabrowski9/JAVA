public class Movie implements Comparable<Movie>{
    private String title;
    private String director;
    private String genre;

    public Movie(String title, String director, String genre) {
        this.title = title;
        this.director = director;
        this.genre = genre;
    }
    @Override
    public int compareTo(Movie other) {
        return Integer.compare(this.title.length(), other.title.length());
    }

}
