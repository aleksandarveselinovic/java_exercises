/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaexams;

/**
 *
 * @author aveselinovic
 */
public class Movie {
    
    private String title;
    private String genre;
    private int rating ;

    public Movie() {
        
    }

    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }
    
    public Movie(Movie m){
        this.title=m.getTitle();
        this.rating=m.getRating();
        this.genre=m.getGenre();
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    @Override
    public String toString(){
        return title + " " +rating+" "+genre;
    }
    
}
