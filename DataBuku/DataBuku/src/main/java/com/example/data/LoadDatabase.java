package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(9772434561006L, "One Piece", "Eiichiro Oda", "1999", 4300000L )));
            log.info("Preloading" + repository.save(new Data(9772434561008L, "One Punch Man", "Shueisha", "2013", 5300000L )));
            log.info("Preloading" + repository.save(new Data(9772434561009L, "Naruto Shipuden", " Masashi Kishimoto ", "1999", 6300000L )));
        };
    }
}
