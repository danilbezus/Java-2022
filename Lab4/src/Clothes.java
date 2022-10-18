public class Clothes{
    private final String name;
    private final String size;
    private final String season;
    private final String color;
    private final String country;

    public Clothes(String name, String size, String season, String color, String country) {
        this.name = name;
        this.size = size;
        this.season = season;
        this.color = color;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getSize(){
        return size;
    }

    public String getSeason(){
        return season;
    }

    public String getColor(){
        return color;
    }

    public String getCountry() {
        return country;
    }

}