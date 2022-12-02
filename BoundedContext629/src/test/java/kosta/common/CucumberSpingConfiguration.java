package kosta.common;


import kosta.BoundedContext629Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext629Application.class })
public class CucumberSpingConfiguration {
    
}
