package customReports;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestNGMethod;
import org.testng.xml.XmlSuite;

public class customReporter implements IReporter {

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
	
		System.out.println("*************Inside CUSTOM Reports**************");
		for(int suitenum=0;suitenum<suites.size();suitenum++) {
			ISuite currenttestsuite=suites.get(suitenum);
			System.out.println("Test suite name : " +currenttestsuite.getName());
		Map<String, ISuiteResult> suiteresult=currenttestsuite.getResults();
		Set<String> Keys=suiteresult.keySet();
		Iterator<String> KeyIt=Keys.iterator();
		while(KeyIt.hasNext()) {
			String Testname=KeyIt.next();
			System.out.println("Testname is : " + Testname);
			 ISuiteResult  testnameresult=suiteresult.get(Testname);
			 IResultMap failedtests= testnameresult.getTestContext().getFailedTests();
			 IResultMap passedtests= testnameresult.getTestContext().getPassedTests();
			 IResultMap skippedtests=testnameresult.getTestContext().getSkippedTests();
			 ITestNGMethod[] alltest= testnameresult.getTestContext().getAllTestMethods();
			 
			 System.out.println("Method Names:");
			 
			 for(int testnum=0;testnum<alltest.length;testnum++) {
				 
				if(failedtests.getAllMethods().contains(alltest[testnum])) {
					System.out.println("Failed  : "+alltest[testnum].getMethodName());
				} else if (passedtests.getAllMethods().contains(alltest[testnum])) {
					System.out.println("passed  : "+alltest[testnum].getMethodName());
				} else if(skippedtests.getAllMethods().contains(alltest[testnum])) {
					System.out.println("skipped  : "+alltest[testnum].getMethodName());
				}
			 }
		}
		
			
			
		}
	}

}
