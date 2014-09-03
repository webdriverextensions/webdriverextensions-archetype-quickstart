#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId};

import ${groupId}.page.MainPage;
import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import org.junit.runner.RunWith;

@RunWith(WebDriverRunner.class)
@Firefox
@Chrome
@InternetExplorer
public class ${siteName}SiteTest {

    // Site
    public ${siteName}Site site;

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

}
