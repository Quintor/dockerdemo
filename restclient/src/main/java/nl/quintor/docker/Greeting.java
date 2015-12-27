package nl.quintor.docker;

public class Greeting {
    private String service;

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

