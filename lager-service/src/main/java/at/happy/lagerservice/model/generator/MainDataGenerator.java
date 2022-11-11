package at.happy.lagerservice.model.generator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"LOCAL", "DEV"})
@Component
public class MainDataGenerator {
    final Logger logger = LoggerFactory.getLogger(MainDataGenerator.class);


   ItemDataGenerator itemDataGenerator;

    @Autowired
    public MainDataGenerator(ItemDataGenerator itemDataGenerator) {
        this.itemDataGenerator = itemDataGenerator;

        generateData();
    }

    public void generateData(){
        logger.info("--- Start Data Loading ---");
        itemDataGenerator.genarateItems();
        logger.info("--- End Data Loading ---");

    }
}
