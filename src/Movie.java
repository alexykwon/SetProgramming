/**
 * Created by Demian on 1/22/15.
 */
public class Movie {
    // fields
    private String name;
    private int year;

    // methods
    public Movie(String name, int year){
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    // this allows Movie to be printed to the console
    public String toString() {
        String result = name + " (" + year + ")";
        return result;
    }

    public boolean equals(Movie otherMovie) {
        if (this.name.equals(otherMovie.name) &&
            this.year == otherMovie.year) {
            return true;
        }
        return false;
    }
}
