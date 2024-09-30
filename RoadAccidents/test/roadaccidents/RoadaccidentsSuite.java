/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package roadaccidents;

import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author 27691
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({roadaccidents.RoadAccidentReportTest.class, roadaccidents.RoadAccidentsTest.class, roadaccidents.IRoadAccidentsTest.class})
public class RoadaccidentsSuite {

    @After
    public void tearDown() throws Exception {
    }
    
}
