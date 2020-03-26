package mn.openapi.java;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/fop")
class SimpleController {

    @Post("/")
    HttpResponse<MyResponse> foo(Long someId) {
        MyResponse resp = new MyResponse();
        resp.payload = new PayloadFoo();
        return HttpResponse.ok(resp);
    }
}
