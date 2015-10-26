import geb.junit4.GebReportingTest

import pages.*
import org.junit.Test

class HelloWorldTests extends GebReportingTest {

    @Test
    void testHello() {
        to HelloPage
        assert firstDiv.text() == 'Hello World from Release!'
    }
}