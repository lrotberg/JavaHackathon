package utilities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import io.qameta.allure.Description;
import io.qameta.allure.Step;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManageDDT extends CommonOps{

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
