package com.maan.eway;

import javax.sql.DataSource;

//import org.jobrunr.configuration.JobRunr;
//import org.jobrunr.scheduling.JobScheduler;
//import org.jobrunr.server.BackgroundJobServerConfiguration;
//import org.jobrunr.server.JobActivator;
//import org.jobrunr.server.configuration.BackgroundJobServerWorkerPolicy;
//import org.jobrunr.server.configuration.FixedSizeBackgroundJobServerWorkerPolicy;
//import org.jobrunr.storage.sql.common.SqlStorageProviderFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
@EnableCaching
@SpringBootApplication
@EnableAsync
public class EwayPaymentApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EwayPaymentApiApplication.class, args);
	}
	
	 

}
