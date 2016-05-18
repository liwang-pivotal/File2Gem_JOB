package io.pivotal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class File2GemApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(File2GemApplication.class);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config/File2Gem.xml");
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("File2Gem");

		try {

			JobExecution execution = jobLauncher.run(job, new JobParameters());
			logger.info("Job Execution Exit Status : " + execution.getStatus());

		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.info("Job Execution Complete.");
		System.exit(0);
	}
}
