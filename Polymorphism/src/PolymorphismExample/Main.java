package PolymorphismExample;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Star Wars");
        doActivity(movie);
        Adventure adventure = new Adventure("Star Wars");
        doActivity(adventure);
        ScienceFiction sciFi = new ScienceFiction("Independence Day");
        doActivity(sciFi);
        Comedy comedy = new Comedy("TED");
        doActivity(comedy);

        Movie movie1 = Movie.getMovie("Adventure","Star Wars");
        doActivity(movie1);
        Movie movie2 = Movie.getMovie("Comedy","Ted");
        doActivity(movie2);
        Movie movie3 = Movie.getMovie("ScienceFiction","Independence Day");
        doActivity(movie3);
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please the following options: " +
                    "\n A for adventure, C for comedy, S for science fiction, Q for quit");
            String type = input.nextLine().trim();
            if (type.isBlank() || type.isEmpty()) {
                continue;
            } else if (!"ACSQ".contains(type)) {
                System.out.println("Invalid input...");
                continue;
            } else if ("qQ".contains(type)) {
                break;
            } else if (!type.isBlank() || !type.isEmpty()) {
                while (true) {
                    System.out.println("Please enter the movie title...or enter Q to quit");
                    String title = input.nextLine().trim();
                    if (title.isBlank() || title.isEmpty()) {
                        continue;
                    } else if ("Qq".contains(title)) {
                        break;
                    } else if (!title.isBlank() || !title.isEmpty()) {
                        Movie movieData = Movie.getMovie(type, title);
                        doActivity(movieData);
                    }
                }
            }
        }

        // Casting of classes from one to another
        Object film = new Movie("Coco");
        Movie films = (Movie) film;
        doActivity(films);

        Adventure movie5 = (Adventure) Movie.getMovie("A","Star Wars");
        doActivity(movie5);

//        Adventure movie6 = (Adventure) Movie.getMovie("C","Star Wars"); // Class Cast Exception
//        doActivity(movie6);

        Object filmM = Movie.getMovie("C","Baby's Day out!");
        doActivity((Movie) filmM);

        Object filmM1 = Movie.getMovie("C","Baby's Day out!");
        doActivity((Comedy) filmM1);
        Comedy filmedit = (Comedy) filmM1;
        doActivity(filmedit);
        filmedit.watchComedy();

        var comedyMovie = Movie.getMovie("C","Baby's Day out!");
        doActivity(comedyMovie);

        var thriller = new Adventure("Jungle Book");
        doActivity(thriller);
        thriller.watchAdventure();

        Object unknownObject = Movie.getMovie("S", "Aliens");
        if (unknownObject.getClass().getSimpleName().equals("ScienceFiction")) {
            ScienceFiction sciFiMovie = (ScienceFiction) unknownObject;
            sciFiMovie.watchScienceFiction();
        } else if (unknownObject instanceof Adventure) {
            Adventure adventureMovie = (Adventure) unknownObject;
            adventureMovie.watchAdventure();
        } else if (unknownObject instanceof Comedy comedyMovies)  {
            comedyMovies.watchComedy();
        }

    }

    public static void doActivity (Movie movie) {
        movie.watchMovie();
        System.out.println("!-----COMPLETED-----!\n");
    }
}
