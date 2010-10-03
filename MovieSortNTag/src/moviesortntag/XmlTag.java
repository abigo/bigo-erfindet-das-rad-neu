/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package moviesortntag;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.NodeType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 *
 * @author andi
 */
public class XmlTag {

    private XmlTag[] elements;
    private Node domNode;


    public XmlTag(Node domNode)
    {
        this.domNode = domNode;

        NodeList children = domNode.getChildNodes();
        elements = new XmlTag[children.getLength()];

        for(int i=0;i<children.getLength();i++)
        {
            elements[i] = new XmlTag(children.item(i));
        }

    }



    public XmlTag get(String tag)
    {
        for(int i=0;i<elements.length;i++)
        {
            if(elements[i].getName().equals(tag))
                return elements[i];
        }
        return null;
    }

    public XmlTag get(int i)
    {
        for(int j=0;j<elements.length;j++)
        {
            if(elements[j].getNode().getNodeType() == Node.ELEMENT_NODE)
            {
                if(i==0)
                    return elements[j];
                else
                    i--;
            }
        }
        return null;
    }

    public String getName()
    {
        return domNode.getNodeName();
    }

    public String getValue()
    {
        return domNode.getTextContent();
    }

    public Node getNode()
    {
        return domNode;
    }
}
