import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import org.w3c.dom.*;
public class DocParser {
    public static void main(String[] args) {


        try{
            File inputFile=new File("sample.txt");
            DocumentBuilderFactory dbFactory =DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            org.w3c.dom.Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :"+doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("food");
            System.out.println(".................");


            for (int temp=0;temp<nList.getLength();temp++){
                Node nNode = nList.item(temp);
                System.out.println("\nCurrentElement:" + nNode.getNodeName());
                if(nNode.getNodeType() == Node.ELEMENT_NODE){
                    Element eElement =(Element) nNode;
                    System.out.println("food label :" + eElement.getAttribute("label"));
                    System.out.println("First Name :"+ eElement.getElementsByTagName("name").item(0).getTextContent());
                }

            }
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }



}
