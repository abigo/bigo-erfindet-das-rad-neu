/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviesortntag;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author andi
 */
public class SearchResult {

    public static void parse(InputStream inputStream)
    {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            org.w3c.dom.Document doc = db.parse(inputStream);
            doc.getDocumentElement().normalize();
            System.out.println("Root element " + doc.getDocumentElement().getNodeName());
            //System.out.println("Information of all employees");
            //System.out.println("Information of all employees");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
