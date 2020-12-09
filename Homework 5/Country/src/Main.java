public class Main {

	public static void main(String[] args) {
        Country ukraine = new Country("Ukraine");

        Region kyivRegion = new Region("Kyiv Region", 32_790.68, ukraine);
        Region lvivRegion = new Region("Lviv Region", 39_912.35, ukraine);
        Region ternopilRegion = new Region("Ternopil Region", 40_361.66, ukraine);

        District kyivDistrict = new District("Kyiv District", kyivRegion);
        District lvivDistrict = new District("Lviv District", lvivRegion);
        District ternopilDistrict = new District("Ternopil District", ternopilRegion);

        City kyiv = new City("Kyiv", kyivDistrict);
        City lviv = new City("Lviv", lvivDistrict);
        City ternopil = new City("Ternopil", ternopilDistrict);
        City drogobych = new City("Drogobych", lvivDistrict);

        ukraine.setCapital(kyiv);
        kyivRegion.setRegionalCenter(kyiv);
        lvivRegion.setRegionalCenter(lviv);
        ternopilRegion.setRegionalCenter(ternopil);

        CountryService countryService = new CountryService();
        countryService.addRegion(kyivRegion,ukraine);


        countryService.showCapital(ukraine);
        countryService.showRegionsAmount(ukraine);
        countryService.showCountryArea(ukraine);
        countryService.showRegionalCenters(ukraine);

    }
}

