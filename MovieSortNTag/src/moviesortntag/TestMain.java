/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviesortntag;

/**
 *
 * @author andi
 */
public class TestMain {

    public static void main(String[] args)
    {
        SearchResult.parse(moviedb.getStream("Movie.search", "Bloodsport"));


        String test = moviedb.movieSearchXml("Bloodsport+1988");

        System.out.println(test);
    }

}
