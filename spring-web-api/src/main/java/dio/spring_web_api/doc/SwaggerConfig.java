package dio.spring_web_api.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;

import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

// Marca esta classe como uma classe de configuração do Spring.
// Ela será carregada automaticamente quando a aplicação iniciar.
@Configuration

// Define as informações globais da documentação Swagger
@OpenAPIDefinition(info = @Info(title = "DevRenan API", version = "1.0",
        description = "API de estudos com Spring Boot 3 e Swagger"))
public class SwaggerConfig {// classe de config. para o SWAGGER


}
