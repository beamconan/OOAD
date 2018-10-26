package sample;

class Showtime {
    private String movieName;
    private int theatreNumber;
    private String soundtrack;
    private String subtitle;
    private double increaseSeatPrice;
    private String time;
            
    public String getMovieName() {
        return movieName;
    }
    public int getTheatreNumber() {
        return theatreNumber;
    }
    public String getSoundtrack() {
        return soundtrack;
    }
    public String getSubtitle() {
        return subtitle;
    }
    public double getIncreaseSeatPrice() {
        return increaseSeatPrice;
    }
    public String getTime() {
        return time;
    }
    public void setMovieName(String name) {
        movieName = name;
    }
    public void setTheatreNumber(int number) {
        theatreNumber = number;
    }
    public void getSoundtrack(String lang) {
        soundtrack = lang;
    }
    public void setSubtitle(String sub) {
        subtitle = sub;
    }
    public void setIncreaseSeatPrice(double incPrice) {
        increaseSeatPrice = incPrice;
    }
    public void getTime(String times) {
        time = times;
    }
}
