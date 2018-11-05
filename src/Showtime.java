package pkg10192018java;

/**
 *
 * @author pisit
 */
public class Showtime {
    private Movie movie;
    private double increaseSeatPrice = 0;
    private String soundtrack = "Thai";
    private String subtitle = "None";
    private String period = "00:00";
    
    public Showtime(Movie movie) {
        this.movie = movie;
    }
    //------------------------------------------------------------------- Method
    public boolean checkValidShowtime(String check) {
        return check.equalsIgnoreCase(period);
    }
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    public String getMovie() {
        return movie.getEnglishName();
    }
    public String getMovieThai() {
        return movie.getThaiName();
    }
    
    private String getPeriod() {
        return this.period;
    }
    
    private String getSoundtrack() {
        return this.soundtrack;
    }
    
    private String getSubtitle() {
        return this.subtitle;
    }
    
    public String getShowtime() {
        return (this.getMovie() + " : " + this.getPeriod() +
                "\nSoundtrack : "+ this.getSoundtrack() + "\nSubtitle : " + this.subtitle);
    }
    @Override
    public String toString() {
        return (this.getMovie() + " : " + this.getPeriod() +
                "\nSoundtrack : "+ this.getSoundtrack() + "\nSubtitle : " + this.subtitle);
    }
    
}
