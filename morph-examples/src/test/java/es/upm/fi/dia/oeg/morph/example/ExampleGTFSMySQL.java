package es.upm.fi.dia.oeg.morph.example;

import es.upm.fi.dia.oeg.morph.base.engine.MorphBaseRunner;
import es.upm.fi.dia.oeg.morph.r2rml.rdb.engine.MorphRDBRunner;
import es.upm.fi.dia.oeg.morph.r2rml.rdb.engine.MorphRDBRunnerFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

import static org.junit.Assert.assertTrue;


public class ExampleGTFSMySQL {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//static { PropertyConfigurator.configure("log4j.properties"); }
	String configurationDirectory = System.getProperty("user.dir") + File.separator + "examples-gtfs-mysql";

    @Test
    public void testGTFS1_batch_mysql() {
		String configurationFile = "gtfs1-batch-mysql.morph.properties";
		try {
			MorphRDBRunnerFactory runnerFactory = new MorphRDBRunnerFactory();
			MorphBaseRunner runner = runnerFactory.createRunner(configurationDirectory, configurationFile);
			runner.run();
			logger.info("Batch process DONE------\n\n");
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("Batch process FAILED------\n\n");
			assertTrue(e.getMessage(), false);
		}
	}

    @Test
    public void testGTFS5_batch_mysql() {
        String configurationFile = "gtfs5-batch-mysql.morph.properties";
        try {
            MorphRDBRunnerFactory runnerFactory = new MorphRDBRunnerFactory();
            MorphBaseRunner runner = runnerFactory.createRunner(configurationDirectory, configurationFile);
            runner.run();
            logger.info("Batch process DONE------\n\n");
        } catch (Exception e) {
            e.printStackTrace();
            logger.info("Batch process FAILED------\n\n");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS1_q1a_mysql() {
        //2 instances
        String configurationFile = "gtfs1-q1a-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS5_q1a_mysql() {
        //2 instances
        String configurationFile = "gtfs5-q1a-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS1_q1b_mysql() {
        //2 instances
        String configurationFile = "gtfs1-q1b-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS5_q1b_mysql() {
        //2 instances
        String configurationFile = "gtfs5-q1b-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS1_q1c_mysql() {
        //2 instances
        String configurationFile = "gtfs1-q1c-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS5_q1c_mysql() {
        //2 instances
        String configurationFile = "gtfs5-q1c-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

	@Test
	public void testGTFS1_q2a_mysql() {
		//2 instances
		String configurationFile = "gtfs1-q2a-mysql.morph.properties";
		try {
			String[] args = {configurationDirectory, configurationFile};
			MorphRDBRunner.main(args);
			System.out.println("Query process DONE------");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error : " + e.getMessage());
			System.out.println("Query process FAILED------");
			assertTrue(e.getMessage(), false);
		}
	}

    @Test
    public void testGTFS5_q2a_mysql() {
        //2 instances
        String configurationFile = "gtfs5-q2a-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS1_q2b_mysql() {
        //2 instances
        String configurationFile = "gtfs1-q2b-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS5_q2b_mysql() {
        //2 instances
        String configurationFile = "gtfs5-q2b-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS1_q2c_mysql() {
        //2 instances
        String configurationFile = "gtfs1-q2c-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS5_q2c_mysql() {
        //2 instances
        String configurationFile = "gtfs5-q2c-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS1_q3a_mysql() {
        //2 instances
        String configurationFile = "gtfs1-q3a-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS5_q3a_mysql() {
        //2 instances
        String configurationFile = "gtfs5-q3a-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS1_q3b_mysql() {
        //2 instances
        String configurationFile = "gtfs1-q3b-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS5_q3b_mysql() {
        //2 instances
        String configurationFile = "gtfs5-q3b-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS1_q3c_mysql() {
        //2 instances
        String configurationFile = "gtfs1-q3c-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS5_q3c_mysql() {
        //2 instances
        String configurationFile = "gtfs5-q3c-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS1_q3d_mysql() {
        //2 instances
        String configurationFile = "gtfs1-q3d-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }

    @Test
    public void testGTFS5_q3d_mysql() {
        //2 instances
        String configurationFile = "gtfs5-q3d-mysql.morph.properties";
        try {
            String[] args = {configurationDirectory, configurationFile};
            MorphRDBRunner.main(args);
            System.out.println("Query process DONE------");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error : " + e.getMessage());
            System.out.println("Query process FAILED------");
            assertTrue(e.getMessage(), false);
        }
    }
}
