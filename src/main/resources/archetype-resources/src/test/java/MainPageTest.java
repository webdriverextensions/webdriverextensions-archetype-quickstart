#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${groupId};

import org.junit.Test;
import static org.andidev.webdriverextension.Bot.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPageTest extends ${siteName}SiteTest {

    // Logger
    private static final Logger log = LoggerFactory.getLogger(MainPageTest.class);

    @Test
    public void openMainPageTest() throws Exception {
        open(site);
        assertIsOpen(mainPage);
    }
}

