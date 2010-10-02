/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviesortntag;

import com.sun.corba.se.impl.encoding.WrapperInputStream;
import com.sun.org.apache.bcel.internal.util.ByteSequence;
import com.sun.org.apache.bcel.internal.util.JavaWrapper;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andi
 */
public class moviedb {

    public static final String apikey = "e154c7431a246c9030268275b4e81b8e";




//    public static String movieSearch(String name)
//    {
//        String xml = movieSearchXml(name);
//
//
//    }

    public static String movieSearchXml(String name)
    {
        return request("Movie.search",name);
    }

    public static String movieGetInfo(int id)
    {
        return request("Movie.getInfo", String.valueOf(id));
    }


    public static String request(String method, String args)
    {
        try {
            InputStream s = getStream(method, args);

            BufferedInputStream r = new BufferedInputStream(s);


            InputStreamReader isr = new InputStreamReader(s);

            BufferedReader br = new BufferedReader(isr);



            String text = "";
            String line = null;
            while(null != (line = br.readLine()))
            {
                text += line + "\n";
            }

            return text;

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;

    }

    public static InputStream getStream(String method, String args)
    {
        try {
            URL url = new URL("http://api.themoviedb.org/2.1/" + method + "/en/xml/" + apikey + "/" + args);
            URLConnection conn = url.openConnection();
            return conn.getInputStream();
        } catch (Exception ex) {
            Logger.getLogger(moviedb.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
