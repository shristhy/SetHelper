/**
 * Created by shristhynaidu on 1/22/15.
 */
public class Movie {
    //has things (fields, instance variables)
    private String name;
    private int year;



    //can do things
    public Movie(String name, int year) {
        this.name = name;
        this.year = year;

    }

    public String getName(){
        return name;
    }

    public int getYear(){
        return year;
    }

    //This allows a movie to be printed to the console
    public String toString() {

        String results = this.name + " (" + this.year + ")";
        return results;
    }

    public boolean equals(Movie otherMovie){
        if (this.name.equals(otherMovie.name) &&
                this.year == otherMovie.year)
        {
            return true;
        }
        return false;
    }
}
