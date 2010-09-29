/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviesortntag;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author andi
 */
public class MovieFilter implements FileFilter {

    public boolean accept(File pathname) {
        return pathname.getAbsolutePath().endsWith(".avi");
    }

}
