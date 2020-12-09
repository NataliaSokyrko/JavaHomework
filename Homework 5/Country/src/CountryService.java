public class CountryService {

    public void addCity(City city, District district) {
        city.setDistrict(district);
    }

    public void addDistrict(District district, Region region) {
        district.setRegion(region);
    }

    public void addRegion(Region region, Country country) {
        region.setCountry(country);
        country.getRegions().add(region);
    }

    public void showCountryArea(Country country) {
        double area = countCountryArea(country);
        System.out.printf("The country area = %.2f km2.\n", area);
    }

    private double countCountryArea(Country country) {
        double countryArea = 0;

        for (Region region : country.getRegions()) {
            if (region.getCountry().getName().equalsIgnoreCase(country.getName())) ;
            countryArea += region.getArea();
        }
        return countryArea;
    }

    public void showRegionsAmount(Country country) {
        int count = countRegionsAmount(country);
        System.out.println(country.getName() + " has " + count + " regions");
    }

    private int countRegionsAmount(Country country) {
        int count = 0;

        for (Region region : country.getRegions()) {
            if (region.getCountry().getName().equalsIgnoreCase(country.getName())) ;
            count++;
        }
        return count;
    }

    public void showCapital(Country country) {
        if (country.getCapital() == null) {
            System.out.println("No capital yet");
        } else {
            System.out.println("The capital of " + country.getName() + " is " + country.getCapital().getName());
        }
    }

    public void showRegionalCenters(Country country) {
        for (Region region : country.getRegions()) {
            if (region.getCountry().getName().equalsIgnoreCase(country.getName())) {
                if (region.getRegionalCenter() == null) {
                    System.out.println("No regional center yet for " + region.getName());
                } else {
                    System.out.println("The city " + region.getRegionalCenter().getName()
                            + " is the regional center of the " + region.getName());
                }
            }
        }
    }
}