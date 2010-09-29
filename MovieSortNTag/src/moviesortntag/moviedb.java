/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviesortntag;

import com.sun.corba.se.impl.encoding.WrapperInputStream;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andi
 */
public class moviedb {

    public String movieGetInfo(String name)
    {
        try {
            FileReader r = new FileReader("http://www.google.de");
            FileInputStream fis = new FileInputStream("http://www.google.de");

            BufferedReader b = new BufferedReader(r);

            String text = "";
            String line = null;
            while(null != (line = b.readLine()))
            {
                text += line;
            }
            
            return text;

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;


    }

}
