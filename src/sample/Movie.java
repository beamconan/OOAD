package sample;

public class Movie {
    private int id;
    private String period;
    private String name;
    private String details;

    public Movie(int id,String name,String details,String period){
        this.id = id;
        this.period = period;
        this.name = name;
        this.details = details;
    }

    public String getMovieDetails( ) {
        return  period+" "+name+" "+details;
    }

    public void updateMovieDetails(String period  ,String details,String name){
        if (period != null){
            this.period = period;
        }
        if (name != null){
            this.name = name;
        }
        if (details != null){
            this.details = details;
        }


    }

}
