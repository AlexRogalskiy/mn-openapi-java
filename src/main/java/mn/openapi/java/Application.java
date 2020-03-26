package mn.openapi.java;


import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(
            title = "mn-openapi1",
            version = "0.0"
    )
)
public class Application {
    static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}
