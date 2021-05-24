package pl.tabor.api.appi;

import org.springframework.web.client.RestTemplate;
import pl.tabor.api.client.AnimalFact;

public class CatController {

    public CatController() {

        RestTemplate restTemplate = new RestTemplate();

        AnimalFact forObject = restTemplate.getForObject("https://cat-fact.herokuapp.com/facts/random",
                AnimalFact.class);

        System.out.println(forObject);

    }
}