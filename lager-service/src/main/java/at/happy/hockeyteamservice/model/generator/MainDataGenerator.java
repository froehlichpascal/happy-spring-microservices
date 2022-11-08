package at.happy.hockeyteamservice.model.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MainDataGenerator {
    final Logger logger = LoggerFactory.getLogger(MainDataGenerator.class);

   ItemDataGenerator itemDataGenerator;

    @Autowired
    public MainDataGenerator(ItemDataGenerator itemDataGenerator) {
        generateData();
    }

    public void generateData(){
        logger.info("--- Start Data Loading ---");
        itemDataGenerator.genarateItems();
        logger.info("--- End Data Loading ---");

    }
}
