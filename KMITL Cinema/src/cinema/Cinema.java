package cinema;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author pisit
 */
public class Cinema {
    private static Cinema instance = new Cinema();
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
        this.updateUserList();
        return userList;
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
    
    public boolean checkValidUser(String username,String password){
        this.updateUserList();
        User u = new User();
        String pass = u.encryptPassword(password);
        
        for (User user : this.userList) {
            if(user.getUsername().equals(username) && user.getPassword().equals(pass)){
                return true;
            }
        } 
        return false;  
    }
    
    public boolean checkExistEmail(String email){
        this.updateUserList();
            for (User u : this.userList) {
                if (u.getEmail().equals(email)) {
                    return true;
                }
            }
        return false;
    }
    
    public boolean checkExistUsername(String username){
        this.updateUserList();
            for (User u : this.userList) {
                if (u.getUsername().equals(username)) {
                    return true;
                }
            }
        return false;
    }
    
    public void updateUserList() {
        // ดึงข้อมูลจาก db ส่วน User
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db/user.odb"); // Select file to store database	
	EntityManager em = emf.createEntityManager();
        em.getTransaction().begin(); // start connection
        Query q6 = em.createQuery("SELECT u FROM User u");
        List<User> users = q6.getResultList(); // get user
        this.userList = users;
        em.close();
        emf.close();
    }
    
    public void addUser(User user){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("db/user.odb"); // connect to object database file	
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin(); // start connection
        em.persist(user); // add user to persist
        em.getTransaction().commit(); // add all persist to database
        em.close();
        emf.close();
        // update list after add
        this.updateUserList();
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
