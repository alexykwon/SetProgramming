import java.io.*;
import java.util.*;

/**
 * Created by Demian on 1/22/15.
 */
public class MovieDriver {

    public static void main(String[] args) {
        /*
        String fileName = "notIMDB.csv";
        BufferedReader reader;
        Set<Movie> library = new HashSet<Movie>();
        String line = "";
        try {
        reader = new BufferedReader(new FileReader(fileName));
        while ((line = reader.readLine()) != null){
        library.add(new Movie(line.substring(0,line.indexOf(",")), Integer.parseInt(line.substring(line.indexOf(",")+ 1))));
        }
        /*
        for (Movie i : library){
        System.out.println(i);
        }
        
        
        }
        catch(FileNotFoundException e){
        e.printStackTrace();
        }
        catch(IOException e){
        e.printStackTrace();
        }
        
        
        
        // print pwd
        //System.out.println(new File(".").getAbsoluteFile());
        */
        System.out.println("Welcome to Moviefone");

        Movie m1 = new Movie("Frozen", 2014);
        Movie m2 = new Movie("Star Trek", 1979);
        Movie m3 = new Movie("Rumble in the Bronx", 1995);
        Movie m4 = new Movie("The Lion King", 1993);
        Movie m5 = new Movie("Flashdance", 1989);
        Movie m6 = new Movie("The Godfather", 1972);
        Movie m7 = new Movie("Fight Club", 1999);
        Movie m8 = new Movie("The Matrix", 1999);
        Movie m9 = new Movie("The Green Mile", 1999);
        Movie m10 = new Movie("Snatch", 2000);


        Set<Movie> library = new HashSet<Movie>();
        Set<Movie> favorites = new HashSet<Movie>();
        Set<Movie> watched = new HashSet<Movie>();
        Set<Movie> recentlyWatched = new HashSet<Movie>();
        Set<Movie> comedy = new HashSet<Movie>();
        Set<Movie> drama = new HashSet<Movie>();


        library.add(m1);
        library.add(m2);
        library.add(m3);
        library.add(m4);
        library.add(m5);
        library.add(m6);
        library.add(m7);
        library.add(m8);
        library.add(m9);
        library.add(m10);

        favorites.add(m3);
        favorites.add(m4);
        favorites.add(m6);
        favorites.add(m10);

        Iterator<Movie> currentFav = favorites.iterator();
        System.out.println(currentFav.next());
        System.out.println(currentFav.next());
        //System.out.println(currentFav.next());

        watched.add(m1);
        watched.add(m2);
        watched.add(m4);

        recentlyWatched.add(m5);
        recentlyWatched.add(m10);

        comedy.add(m3);

        drama.add(m2);
        drama.add(m5);
        drama.add(m7);
        drama.add(m9);
        drama.add(m10);



        System.out.println("Library is " + library);

        //

        SetHelper helper = new SetHelper();
        // watched dramas
        Set<Movie> watchedDramas = helper.intersect(watched, drama);
        // unwatched movies
        Set<Movie> unwatched = helper.difference(library, watched);
        // unwatched comedies
        Set<Movie> unwatchedComs = helper.difference(watched, comedy);





        Set<Movie> unwatchedNewReleases = new HashSet<Movie>();
        Iterator<Movie> currMovie = unwatched.iterator();
        while (currMovie.hasNext()) {
            Movie temp = currMovie.next();
            if (temp.getYear() >= 2010) {
                unwatchedNewReleases.add(temp);

            }
        }

        System.out.println("Watched Dramas: " + watchedDramas);
        System.out.println("Unwatched: " + unwatched);
        System.out.println("Unwatched Comedies :" + unwatchedComs);


        Map<Movie, Integer> watchedCount = new HashMap<Movie, Integer>();
        watchedCount.put(m3, 5);
        watchedCount.put(m1, 1);
        watchedCount.put(m2, 4);
        System.out.println("Watched Count: " + watchedCount);

        Queue<Movie> playList = new LinkedList<Movie>();
        playList.add(m1);
        System.out.println("Peek at head of queue: " + playList.element());


        playList.add(m3);
        playList.add(m4);
        playList.add(m5);
        playList.remove();
        playList.remove();
        System.out.println("Peek at head of queue: " + playList.element());


    }
}
