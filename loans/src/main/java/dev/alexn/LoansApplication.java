package dev.alexn;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.alexbank.loans.controller") })
@EnableJpaRepositories("com.alexbank.loans.repository")
@EntityScan("com.alexbank.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Loans microservice REST API Documentation",
                description = "AlexBank Loans microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Alex",
                        email = "alex@alexbank.com",
                        url = "https://www.alexbank.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.alexbank.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "AlexBank Loans microservice REST API Documentation",
                url = "https://www.alexbank.com/swagger-ui.html"
        )
)
public class LoansApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
    }
}