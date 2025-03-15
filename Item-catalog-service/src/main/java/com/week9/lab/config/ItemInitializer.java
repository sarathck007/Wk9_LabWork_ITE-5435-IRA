package com.week9.lab.config;

import com.week9.lab.model.Item;
import com.week9.lab.repository.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

/**
 * Component for initializing the database with sample data
 * Implements CommandLineRunner to execute code after application starts
 */
@Component
public class ItemInitializer implements CommandLineRunner {
    // Repository dependency for database operations

    private final ItemRepository itemRepository;

    /**
     * Constructor injection of repository dependency
     */
    public ItemInitializer(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    
    /**
     * This method runs after the application starts
     * Populates the database with sample sports brands if empty
     */
    @Override
    public void run(String... args) throws Exception {
        // Check if repository is empty to avoid duplicate data on restart
        if (itemRepository.count() == 0) {
            // Create and save several popular sports brands

            Stream.of("Lining", "PUMA", "Bad Boy", "Air Jordan", "Nike", "Adidas", "Reebok")
                .forEach(item -> itemRepository.save(new Item(item)));
            
            // Print all items to console for verification
            System.out.println("Items initialized successfully:");
            itemRepository.findAll().forEach(System.out::println);
        }
    }
}