package com.davidticona.apiblog.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author David Tomas Ticona Saravia
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API REST - Gestión de Blogs")
                        .version("1.0.0")
                        .description("API REST para una aplicación de gestión de blogs. Esta aplicación permite crear, actualizar y obtener blogs, asimismo registrar comentarios en los blogs.")
                        .contact(new Contact()
                                .name("David Tomas Ticona Saravia")
                                .url("https://www.linkedin.com/in/david-ticona-saravia/"))
                        .license(new License().name("MIT").url("https://github.com/davicotico/api-rest-blog?tab=MIT-1-ov-file#readme"))
                );
    }
}
