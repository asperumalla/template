package com.search.ai;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

@Testcontainers
@SpringBootTest
class AiApplicationTests {


    @ServiceConnection
    private static PostgreSQLContainer<?> sqlContainer = new PostgreSQLContainer("pgvector/pgvector:pg16");

    @Test
    void contextLoads () {
    }

}
