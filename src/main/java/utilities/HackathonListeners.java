package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class HackathonListeners extends CommonOps implements ITestListener {
  @Override
  public void onStart(ITestContext execution) {
    System.out.println("------- Starting testing execution -------");
  }

  @Override
  public void onFinish(ITestContext execution) {
    System.out.println("------- Finished testing execution -------");
  }

  @Override
  public void onTestStart(ITestResult test) {
    System.out.printf("------- Starting recording for test %s -------\n", test.getName());
    try {
      MonteScreenRecorder.startRecord(test.getName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void onTestSuccess(ITestResult test) {
    System.out.printf("------- Test: '%s' - passed -------\n", test.getName());

    try {
      MonteScreenRecorder.stopRecord();
    } catch (Exception e) {
      e.printStackTrace();
    }

    File file = new File("./test-recordings/" + test.getName() + ".avi");

    if (file.delete()) {
      System.out.printf("------- Recording of test %s was deleted -------\n", test.getName());
    }
  }

  @Override
  public void onTestFailure(ITestResult test) {
    System.out.printf("------- Test: '%s' - failed -------\n", test.getName());
    try {
      MonteScreenRecorder.stopRecord();
      saveScreenshot();
      System.out.printf("------- Finished Recording test %s -------\n", test.getName());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult test) {
    // TODO Auto-generated method stub
  }

  @Override
  public void onTestSkipped(ITestResult test) {
    System.out.printf("------- Test: '%s' - skipped -------\n", test.getName());

    try {
      MonteScreenRecorder.stopRecord();
    } catch (Exception e) {
      e.printStackTrace();
    }

    File file = new File("./test-recordings/" + test.getName() + ".avi");

    if (file.delete()) {
      System.out.printf("------- Recording of test %s was deleted -------\n", test.getName());
    }
  }
}
