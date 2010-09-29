/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviesortntag;

import java.io.File;

/**
 *
 * @author andi
 */
public class Helper {

    public File[] getMovieFiles(String path)
    {
        File dir = new File(path);

        File files [] = dir.listFiles(new MovieFilter());

        return files;
    }

    public String[] getFileNames(File[] files)
    {
        String[] filenames = new String[files.length];

        for(int i=0;i<files.length;i++)
        {
            filenames[i] = files[i].getName();
        }

        return filenames;
    }

}
