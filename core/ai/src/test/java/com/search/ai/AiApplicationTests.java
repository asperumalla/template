package com.search.ai;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@SpringBootTest
class AiApplicationTests {


    @Container
    @ServiceConnection
    static PostgreSQLContainer<?> sqlContainer = new PostgreSQLContainer<>("pgvector/pgvector:pg17")
            .withInitScript("init.sql");

    @Test
    void contextLoads () {
    }

}
