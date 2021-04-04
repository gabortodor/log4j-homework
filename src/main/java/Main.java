import org.apache.logging.log4j.*;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    private static final Marker THREE_WORDS = MarkerManager.getMarker("THREE_WORDS");
    private static final Marker FOUR_WORDS = MarkerManager.getMarker("FOUR_WORDS");

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            ThreadContext.put("iterationNumber", String.valueOf(i));

            logger.info(THREE_WORDS, "Locsolkodni vicces dolog,");
            logger.trace(FOUR_WORDS, "mert ilyenkor vödröt fogok,");
            logger.debug(THREE_WORDS, "hideg vízzel megtöltöm,");
            logger.warn(THREE_WORDS, "a lányok fejére öntöm!");
            logger.error(FOUR_WORDS, "Veled ilyet nem teszek,");
            logger.fatal("Inkább kölnit veszek.");

            Thread.sleep(2000);
        }
    }
}
