package com.gride29.inventoryservice;

import com.gride29.inventoryservice.model.Inventory;
import com.gride29.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Value("${inventory.data.loading.enabled}")
	private boolean inventoryDataLoadingEnabled;

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return (args) -> {
			if (inventoryDataLoadingEnabled) {
				inventoryRepository.save(new Inventory("ABC123", 100));
				inventoryRepository.save(new Inventory("DEF456", 200));
				inventoryRepository.save(new Inventory("GHI789", 300));
			} else {
				System.out.println("Data loading is disabled.");
			}
		};
	}
}
