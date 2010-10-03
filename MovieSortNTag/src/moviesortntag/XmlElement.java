/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviesortntag;

/**
 *
 * @author andi
 */
public abstract class XmlElement {

    public String tag = null;
    public String value = null;

    public String getValue(){return value;}

    public boolean isValue(){return false;}

    public String getTag(){return tag;}

}
