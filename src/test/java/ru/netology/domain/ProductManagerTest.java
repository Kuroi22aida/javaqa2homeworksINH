package ru.netology.domain;

import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    @Test
    public void shouldExecuteRequest() {
        ProductManager manager = new ProductManager();
        manager.add(new Book(1))

    }
}
