/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviesortntag;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

/**
 *
 * @author andi
 */
public class Helper {

    public static ArrayList<File> getMovieFiles(String path)
    {
;

        ArrayList<File> files = new ArrayList<File>();

        File dir = new File(path);

        File[] allfiles = dir.listFiles();

        for(int i=0;i<allfiles.length;i++)
        {
            if(isMovieFile(allfiles[i]))
                files.add(allfiles[i]);
            else if(allfiles[i].isDirectory())
                files.addAll(getMovieFiles(allfiles[i].getAbsolutePath()));

        }

        return files;
    }

    public static String[] getFileNames(ArrayList<File> files)
    {
        String[] filenames = new String[files.size()];

        for(int i=0;i<files.size();i++)
        {
            filenames[i] = files.get(i).getName();
        }

        return filenames;
    }

    public static boolean isMovieFile(File f)
    {
        String[] movieFileExtensions = new String[]{".avi"};

        for(int i=0;i<movieFileExtensions.length;i++)
        {
            if(f.getName().endsWith(movieFileExtensions[i]))
                return true;
        }

        return false;
    }

}
