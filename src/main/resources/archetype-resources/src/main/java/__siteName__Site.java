#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId};

import ${groupId}.page.MainPage;
import org.andidev.webdriverextension.WebSite;
import static org.andidev.webdriverextension.Bot.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ${siteName}Site extends WebSite {

    // Logger
    private static final Logger log = LoggerFactory.getLogger(${siteName}Site.class);

    // Url
    public static String url = "${siteUrl}";

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

    public void open() {
        open(url);
    }

    @Override
    public void assertIsOpen() throws Error {
        assertCurrentUrlStartsWith(url);
    }

}
