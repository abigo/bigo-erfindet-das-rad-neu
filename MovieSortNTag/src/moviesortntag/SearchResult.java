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
import org.w3c.dom.Node;

/**
 *
 * @author andi
 */
public class SearchResult {


    private XmlTag movies;

    public SearchResult(Node moviesNode)
    {
        movies = new XmlTag(moviesNode);
    }

    public static SearchResult parse(InputStream inputStream)
    {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            org.w3c.dom.Document doc = db.parse(inputStream);
            doc.getDocumentElement().normalize();
            //System.out.println(doc.getFirstChild().getTextContent());
            //System.out.println(doc.getFirstChild().getNodeName());
            SearchResult result = new SearchResult(doc.getDocumentElement().getElementsByTagName("movies").item(0));

            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;

    }

    public XmlTag getMovie(int i)
    {
        return movies.get(i);
    }

}
