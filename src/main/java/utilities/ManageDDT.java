package utilities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.testng.annotations.DataProvider;
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

  private static String filePath = "C:\\automation\\JavaHackathon\\src\\main\\java\\utilities\\DataDrivenTesting.csv";

  @DataProvider(name = "data-provider")
  @Description("DataProvider: Get Object 'table' from CSV file")
  public static Object[][] getDataObject ()
  {
    return getDataFromCSV(filePath);
  }
  @Description("Convert CSV into Object 'table'")
  public static Object[][] getDataFromCSV (String filePath)
  {
    List<List<String>> csvData = readCSV(filePath);
    int rowSize = csvData.size();
    int columnSize = csvData.get(0).size();
    Object[][] data = new Object[rowSize][columnSize];
    for (int i = 0; i < rowSize; i++) {
      for (int j = 0; j < columnSize; j++) {
        data[i][j] = csvData.get(i).get(j);
      }
    }
    return data;
  }
  @Description("Read CSV from file path")
  public static List<List<String>> readCSV (String filePath)
  {
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
