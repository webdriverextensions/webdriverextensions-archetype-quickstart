#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId};

import ${groupId}.page.MainPage;
import org.andidev.webdriverextension.WebRepository;
import org.andidev.webdriverextension.junitrunner.SeleniumGridRunner;
import org.andidev.webdriverextension.junitrunner.annotations.Chrome;
import org.andidev.webdriverextension.junitrunner.annotations.Firefox;
import org.andidev.webdriverextension.junitrunner.annotations.InternetExplorer;
import org.andidev.webdriverextension.junitrunner.annotations.RemoteAddress;
import org.junit.Before;
import org.junit.runner.RunWith;

@RunWith(SeleniumGridRunner.class)
@RemoteAddress("http://andidev:80b7768e-dc06-4d5b-b793-5b3b83f0e24c@ondemand.saucelabs.com:80/wd/hub")
@Firefox
@Chrome
@InternetExplorer
public class ${siteName}SiteTest extends WebRepository {

    // Site
    public ${siteName}Site site;

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

    @Before
    public void setUp() {
        initElements();
    }


//    @After
//    public void tearDown() {
//        ThreadDriver.getDriver().quit();
//        ThreadDriver.removeDriver();
//    }
}
