package com.navent.realestate.examples;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@SpringBootApplication(scanBasePackages = "com.navent.realestate.*")
@EnableSolrRepositories
public class ApiSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSearchApplication.class, args);
	}


	@Bean
	public SolrClient solrClient() {
		return new HttpSolrClient("http://192.168.22.57:5083/solr");
	}

	@Bean
	public SolrTemplate solrTemplate(){
		return new SolrTemplate(solrClient());
	}

}
