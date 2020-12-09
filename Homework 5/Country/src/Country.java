import java.util.HashSet;
import java.util.Set;

public class Country {

    private String name;
    private City capital;
    private final Set<Region> regions;

    public Country(String name) {
        this.name = name;
        this.regions = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Set<Region> getRegions() {
        return regions;
    }
}