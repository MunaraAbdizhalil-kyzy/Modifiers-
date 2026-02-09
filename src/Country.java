public class Country {
    private String name;
    private String population;
    private double square;
    private String language;

    public Country(String name, String population, double square, String language) {
        this.name = name;
        this.population = population;
        this.square = square;
        this.language = language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static Country getSquare(Country[] square){
       Country largest = square[0];
       for(Country c : square){
           if(c.getSquare()> largest.getSquare()){
               largest=c;
           }
       }return largest;
    }

    @Override
    public String toString() {
        return "Country:" +
                "Name='" + name + "\n" +
                "Population='" + population + "\n" +
                "Square=" + square + "\n"+
                "Language='" + language;
    }
}
