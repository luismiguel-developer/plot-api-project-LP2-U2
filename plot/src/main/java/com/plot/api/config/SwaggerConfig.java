package com.plot.api.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI plotOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Plot API")
                        .description("Documentação técnica do motor de gamificação de leitura.")
                        .version("1.0.0"));
    }
}