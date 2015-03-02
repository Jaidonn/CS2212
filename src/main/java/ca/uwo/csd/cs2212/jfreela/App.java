package ca.uwo.csd.uwo.cs2212.jfreela;
import org.apache.logging.log4j.LogManager; 
import org.apache.logging.log4j.Logger; 

public class App{
	static Logger logger = LogManager.getLogger (App.class.getName());
	public static void main ( String [] args ) {
		logger.trace("Entering main");
		logger.trace("Hello Maven/log4j World");
		logger.trace("My username is jfreela");
		logger.trace("Exiting main");
	}
}