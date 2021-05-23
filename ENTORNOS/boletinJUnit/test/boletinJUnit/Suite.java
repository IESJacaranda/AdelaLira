package boletinJUnit;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
//import org.junit.runners.Suite; BORRAR
// import org.junit.runners.Suite.SuiteClasses; BORRAR

@RunWith(JUnitPlatform.class)
@SelectPackages("boletinJUnit")
//@SelectClasses(BoaTest.class) //comprueba solo esta clase
//@SelectClasses({BoaTest.class, FridgeTest.class}) //comprueba ests clases
//@SuiteClasses({})
public class Suite {

}
