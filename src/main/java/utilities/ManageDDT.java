package utilities;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ManageDDT extends CommonOps{

  @Step("Read From XML")
  @Description("Read XML from file path")
  public String getData (String nodeName) {
    DocumentBuilder dBuilder;
    Document doc = null;
    File fXmlFile = new File("config.xml");
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    try {
      dBuilder = dbFactory.newDocumentBuilder();
      doc = dBuilder.parse(fXmlFile);
    }
    catch(Exception e) {
      System.out.println("Exception in reading XML file: " + e);
    }
    doc.getDocumentElement().normalize();
    return doc.getElementsByTagName(nodeName).item(0).getTextContent();
  }

}
