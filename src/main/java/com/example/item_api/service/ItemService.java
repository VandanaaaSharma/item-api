package com.example.item_api.service;

import com.example.item_api.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    private final List<Item> items = new ArrayList<>();
    private Long idCounter = 1L;

    // Add item
    public Item addItem(Item item) {
        item.setId(idCounter++);
        items.add(item);
        return item;
    }

    // Get item by ID
    public Optional<Item> getItemById(Long id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
}
