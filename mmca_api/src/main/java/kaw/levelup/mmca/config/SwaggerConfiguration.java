package kaw.levelup.mmca.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(apiInfo());
    }
 
    private Info apiInfo() {
        return new Info()
                .title("MMCA")
                .description("국립현대미술관 프로젝트 API")
                .version("1.0.0");
    }
}