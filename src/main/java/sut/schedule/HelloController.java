package sut.schedule;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * localhost:8080/api/say/hello/pond_kung
 * {
 *     "message: "string"
 * }
 */
@RestController
@RequestMapping("/say")
public class HelloController {

    @GetMapping("/hello/{name}")
    public ResponseEntity<SayHello> sayHello(@PathVariable String name){
//        name = pond_kung
        SayHello responseMessage = new SayHello();
        responseMessage.setMessage(name);

        return ResponseEntity.ok(responseMessage);
    }
}
