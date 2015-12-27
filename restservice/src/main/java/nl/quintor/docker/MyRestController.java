package nl.quintor.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyRestController {

    @RequestMapping("/restdemo")
    @ResponseBody
    public Greeting restdemo() {
        return new Greeting();
    }

    class Greeting {
        private String service = "RestService";

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        @Override
        public String toString() {
            return "Greeting{" +
                    "service='" + service + '\'' +
                    '}';
        }
    }

}
