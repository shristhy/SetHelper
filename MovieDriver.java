import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by shristhynaidu on 1/22/15.
 */
public class MovieDriver {

    public static void main(String[]args) {
        System.out.println("Welcome to Moviefone");

        Movie m1 = new Movie ("Frozen", 2014);
        Movie m2 = new Movie ("Star Trek", 1979);
        Movie m3 = new Movie ("Out of the Woods",2014);
        Movie m4 = new Movie ("Rainman", 1989);
        Movie m5 = new Movie ("SnowWhite", 1996);

        Set<Movie> library = new HashSet<Movie>();
        Set<Movie> favorites = new HashSet<Movie>();
        Set<Movie> watched = new HashSet<Movie>();
        Set<Movie> comedy = new HashSet<Movie>();
        Set<Movie> drama = new HashSet<Movie>();


        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);
        library.add(m5);

        favorites.add(m2);
        favorites.add(m3);

        Iterator<Movie> currentFav = favorites.iterator();
        System.out.println(currentFav.next());
        System.out.println(currentFav.next());
        //System.out.println(currentFav.next());

        watched.add(m1);
        watched.add(m3);
        watched.add(m4);

        comedy.add(m1);
        comedy.add(m3);

        drama.add(m2);
        drama.add(m4);

        favorites.clear(); // empty out the favorites set

        System.out.println("Library is " + library);
        System.out.println("Favorites is " + favorites);

        SetHelper helper = new SetHelper();

        // calc the intersection of watched and dramas
        Set<Movie> watchedDramas = helper.intersect(watched, drama);
        Set<Movie> unwatched = helper.difference(library, watched);

        // comedies that I haven't seen
        Set<Movie> unwatchedComs = helper.difference(unwatched, comedy);

        // movies after 2010 that I haven't watched
        Set<Movie> unwatchedNewReleases = new HashSet<Movie>();
        Iterator<Movie> currMovie = unwatched.iterator();
        while (currMovie.hasNext()) {
            Movie temp = currMovie.next();
            if (temp.getYear() >= 2010) {
                unwatchedNewReleases.add(temp);
            }
        }



    }

}