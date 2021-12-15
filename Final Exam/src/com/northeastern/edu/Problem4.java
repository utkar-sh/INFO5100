package com.northeastern.edu;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Problem4 {
    Netflix netflix;

    public Problem4(){
        netflix = createNetflix();
    }

    //region Adding (Classic)
    public void addClassic(){
        netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .forEach(movie -> {
                    Date date = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
                    if (movie.getReleaseDate().before(date)) {
                        System.out.println(movie.getTitle() + "(Classic)");
                    }
                });
    }
    //endregion

    //region Getting latest 3 movies
    public void getLatestThreeMovies(){

        List<Movie> latestThreeMovies = netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .sorted((movie1, movie2) -> movie2.getReleaseDate().compareTo(movie1.getReleaseDate()))
                .limit(3)
                .collect(Collectors.toList());

        for(Movie movie: latestThreeMovies){
            Date date = movie.getReleaseDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(movie.getTitle() + ": " + calendar.get(Calendar.YEAR));
        }
    }
    //endregion

    //region Predicate
    public void setPredicate(){
        Date twoThousand = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date ninteenNinty = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Predicate<Movie> befor2000 = movie -> movie.getReleaseDate().before(twoThousand);
        Predicate<Movie> after1990 = movie -> movie.getReleaseDate().after(ninteenNinty);

        netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .forEach(movie -> {
                    if(befor2000.and(after1990).test(movie)){
                        System.out.println(movie.getTitle() + ": "
                                + movie.getReleaseDate().toGMTString()
                        );
                    }
                });
    }
    //endregion

    //region Adding release year to title
    public void addReleaseYearToTitle(){

        List<Genre> list= netflix.genreList.stream()
                .map(genre -> {
                    genre.addReleaseYearToTitle();
                    return genre;
                })
                .collect(Collectors.toList());

        netflix.setGenreList(list);

        for(Genre genre: netflix.getGenreList()){
            for(Movie movie: genre.getMovieList()){
                System.out.println(movie.getTitle());
            }
        }
    }//endregion

    //region Sorting by title comparator
    public void sortUseComparator(){
        Comparator<Movie> movieTitleComparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie movie1, Movie movie2) {
                return movie1.getTitle().compareTo(movie2.getTitle());
            }
        };

        List<Movie> list = netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .sorted(movieTitleComparator)
                .collect(Collectors.toList());

        for(Movie movie: list){
            System.out.println(movie.getTitle());
        }
    }
    //endregion


    public Netflix createNetflix(){
        Netflix netflix = new Netflix();
        netflix.setGenreList(generateGenres());
        generateMoviesForFiction(netflix.getGenreList().get(0));
        generateMoviesForNonFiction(netflix.getGenreList().get(1));

        return netflix;
    }

    public ArrayList<Genre> generateGenres(){
        Genre fiction = new Genre();
        Genre nonFiction = new Genre();

        ArrayList<Genre> list = new ArrayList<>();
        list.add(fiction);
        list.add(nonFiction);

        return list;
    }

    public void generateMoviesForFiction(Genre fiction){

        Date date1 = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        Movie harryPotter = new Movie("Harry Potter", date1);
        Date date2 = new GregorianCalendar(1989, Calendar.JUNE, 4).getTime();
        Movie red = new Movie("Red", date2);
        Date date3 = new GregorianCalendar(1994, Calendar.JULY, 9).getTime();
        Movie green = new Movie("Green", date3);
        ArrayList<Movie> list = new ArrayList<>();
        list.add(harryPotter);
        list.add(red);
        list.add(green);

        fiction.setMovieList(list);
    }

    public void generateMoviesForNonFiction(Genre nonFiction){

        Date date1 = new GregorianCalendar(2006, Calendar.FEBRUARY, 11).getTime();
        Movie mercury = new Movie("Mercury", date1);
        Date date2 = new GregorianCalendar(1991, Calendar.JANUARY, 3).getTime();
        Movie venus = new Movie("Venus", date2);
        Date date3 = new GregorianCalendar(1962, Calendar.APRIL, 9).getTime();
        Movie earth = new Movie("Earth", date3);

        ArrayList<Movie> list = new ArrayList<>();
        list.add(mercury);
        list.add(venus);
        list.add(earth);

        nonFiction.setMovieList(list);
    }

    public static void main(String[] args){

        Problem4 problem4 = new Problem4();

        System.out.println("Adding (Classic)");
        problem4.addClassic();
        System.out.println();

        System.out.println("Latest 3 movies");
        problem4.getLatestThreeMovies();
        System.out.println();

        System.out.println("Setting predicates");
        problem4.setPredicate();
        System.out.println();

        System.out.println("Adding release year to title");
        problem4.addReleaseYearToTitle();
        System.out.println();

        System.out.println("Sort by Title Comparator");
        problem4.sortUseComparator();
        System.out.println();
    }
}
