package nl.quintor.docker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyRestClient {

    public static final String URL = "http://restservice:8080/restdemo";

    @RequestMapping("/restdemo")
    public String restdemo() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Greeting> responseEntity =
                restTemplate.getForEntity(URL, Greeting.class);

        return String.format("RestService answers: [%s]", responseEntity.getBody().toString());
    }

}
