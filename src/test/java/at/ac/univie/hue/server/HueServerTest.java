package at.ac.univie.hue.server;

import com.sun.jersey.test.framework.JerseyTest;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class HueServerTest extends JerseyTest {
    
    public HueServerTest() {}
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//    @Override
//    protected Application configure() {
//        return new ResourceConfig(HueServer.class);
//    }
    
    @Test
    public void testUpdateLight() {
        
    }
}
