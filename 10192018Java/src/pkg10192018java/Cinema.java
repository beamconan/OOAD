package pkg10192018java;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pisit
 */
public class Cinema {
    private static Cinema instance = new Cinema();
    private List<String> test = new ArrayList<String>();
    private List<User> userList = new ArrayList<User>();
    private List<Movie> movieList = new ArrayList<Movie>();
    private List<Promotion> promotionList = new ArrayList<Promotion>();
    private List<Showtime> showtimeList = new ArrayList<Showtime>();
    private Theatre theatre;
    
    private Cinema() {
        
    }
    
    public static Cinema getInstance() {
        return instance;
    }
    //------------------------------------------------------------------- Method

    public List<User> getUserList() {
        return userList;
    }
    
    public void addTest(String s) {
        this.test.add(s);
    }
    
    public List<String> getTest() {
        return test;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Promotion> getPromotionList() {
        return promotionList;
    }

    public void setPromotionList(List<Promotion> promotionList) {
        this.promotionList = promotionList;
    }

    public List<Showtime> getShowtimeList() {
        return showtimeList;
    }

    public void setShowtimeList(List<Showtime> showtimeList) {
        this.showtimeList = showtimeList;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }
    
    //---------------------------------------------------------- Update Method
    public void updateList() {
        // ดึงข้อมูลจาก db ส่วน User
    }
    public void updateUserList() {
        // ดึงข้อมูลจาก db ส่วน User
    }
    public void updateMovieList() {
        
    }
    public void updatePromotionList() {
        
    }
    public void updateShowtimeList() {
        
    }
    public void updateTheatre() {
        
    }
    
    //---------------------------------------------------------- Function Method
    
    
}
