package producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.Future;


public class BrokerThread implements Runnable {
    private static final Logger logger = LogManager.getLogger();
    private KafkaProducer<Integer, String> producer;
    private String topicName;
    private String fileLocation;

    BrokerThread(KafkaProducer<Integer, String> producer, String topicName, String fileLocation) {
        this.producer = producer;
        this.topicName = topicName;
        this.fileLocation = fileLocation;
    }

    private static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void run() {
        logger.info("Start processing " + fileLocation);
        File file = new File(fileLocation);
        int counter = 0;

        try(Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                logger.info("Processing " + fileLocation + " - " + counter);
                String line = scanner.nextLine();
                producer.send(new ProducerRecord(topicName, null, line));
                counter++;
                wait(AppConfigs.messageMillisecondsDelay);
            }
            logger.info("Finished sending " + counter + " messages from " + fileLocation);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
