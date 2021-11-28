package utilities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

  @Step("Read From CSV")
  @Description("Read CSV from file path")
  public static List<List<String>> readCSV(String filePath) {
    List<List<String>> records = new ArrayList<>();
    try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
      String[] values;
      while ((values = csvReader.readNext()) != null) {
        records.add(Arrays.asList(values));
      }
    } catch (IOException | CsvValidationException e) {
      e.printStackTrace();
    }
    return records;
  }

}
