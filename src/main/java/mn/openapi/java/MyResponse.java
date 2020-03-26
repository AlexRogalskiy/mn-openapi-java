package mn.openapi.java;

import io.swagger.v3.oas.annotations.media.Schema;

public class MyResponse {

    @Schema(oneOf = {PayloadFoo.class, PayloadBar.class})
    Payload payload;
}
