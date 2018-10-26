package sample;


public class promotion {
    private String description;
    private String name;
    private int discount;

    public promotion(String name ,int discount  ,String description){
        this.name = name;
        this.discount = discount;
        this.description = description;

    }

    public String getPromotion() {
        return name+"/"+description+"/"+discount;
    }

   public void updatePromotionDetails(String name ,int discount  ,String description){
       this.name = name;
       this.discount = discount;
       this.description = description;
   }

}
