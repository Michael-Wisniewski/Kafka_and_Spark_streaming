package producer;

public class AppConfigs {
    final static String producerConfigFileLocation = "producer.properties";
    final static String applicationID = "Producer";
    final static String bootstrapServers = "localhost:29092"; // "broker:9092";
    final static String topicName = "test-topic";
    final static Integer messageMillisecondsDelay = 2000;
    final static String[] eventFiles = {"data/NS1.csv", "data/NS2.csv"};
}
