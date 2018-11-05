/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;
/**
 *
 * @author pisit
 */
public class Movie {
    // Instance Variable
    private int id;
    private String englishName = "None";
    private String thaiName = "None";
    private String director = "None";
    private String cast = "None";
    private String synopsis = "None";
    private String genre = "None";
    private String releaseDate = "None";
    private String time = "None";
    
    //----------------------------------------- Constructor Declaration of class
    public Movie(int id) {
        this.id = id;
    }
    
    public Movie(int id, String english, String thai) {
        this.id = id;
        this.englishName = english;
        this.thaiName = thai;
    }
    
    //----------------------------------------------------------- Get-Set Method
    public int getID() {
        return id;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public String getEnglishName() {
        return englishName;
    }
    
    public void setEnglishName(String name) {
        this.englishName = name;
    }
    
    public String getThaiName() {
        return thaiName;
    }
    
    public void setThaiName(String name) {
        this.thaiName = name;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String name) {
        this.director = name;
    }
    
    public String getCast() {
        return cast;
    }
    
    public void setCast(String name) {
        this.cast = name;
    }
    
    public String getSynopsis() {
        return synopsis;
    }
    
    public void setSynopsis(String name) {
        this.synopsis = name;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public void setGenre(String name) {
        this.genre = name;
    }
    
    public String getReleaseDate() {
        return releaseDate;
    }
    
    public void setReleaseDate(String date) {
        this.releaseDate = date;
    }
    
    public String getTime() {
        return time;
    }
    
    public void setTime(String time) {
        this.synopsis = time;
    }
    
    public void setMovieDetails(int id, String englishname, String thainame, 
                                    String director, String cast, String synopsis,
                                    String genre, String releaseDate, String time) 
    {
        this.id = id;
        this.englishName = englishname;
        this.thaiName = thainame;
        this.director = director;
        this.cast = cast;
        this.synopsis = synopsis;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.time = time;
        
    }
    
    //---------------------------------------------------------- Function Method
    @Override
    public String toString() 
    { 
        return ("Movie ID : "+ this.getID()+ "\nEnglish Name : " + this.getEnglishName() + 
                "\nThai Name : "+ this.getThaiName() + "\nDirector : " + this.getDirector() +
                "\nCast : " + this.getCast() + "\nSynopsis : " + this.getSynopsis() + " - Genre : " + this.getGenre() +
                "\nRelease Date : " + this.getReleaseDate()); 
    } 
    
}
