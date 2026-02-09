//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

Country country1 = new Country("Kyrgyzstan","7.3 million",199.9,"Kyrgyz");
Country country2 = new Country("Germany","83.6 million",357.6,"German");
Country country3 = new Country("Italy","59.283 million",302.7,"Italian");
    Country [] countries = {country1,country2,country3};
    System.out.println();
    System.out.println(country1);
    System.out.println(country2);
    System.out.println(country3);
    System.out.println("The largest country:");
    System.out.println(Country.getSquare(countries));
}
