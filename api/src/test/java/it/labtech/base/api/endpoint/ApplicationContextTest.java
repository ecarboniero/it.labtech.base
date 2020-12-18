package it.labtech.base.api.endpoint;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;

@SpringBootTest
public class ApplicationContextTest {
    private ApplicationContext applicationContext;

    public ApplicationContextTest(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Test
    public void contextLoads() {
        Assert.notNull(applicationContext, "Spring Application Context not null ... good job :-D");
    }
}
