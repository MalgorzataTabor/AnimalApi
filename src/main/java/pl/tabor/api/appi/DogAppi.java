package pl.tabor.api.appi;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dogs")
public class DogAppi {

    private List<Dog> dogList;


    public DogAppi() {
      this.dogList= new ArrayList<>();

      dogList.add(new Dog("Baksik", "Husky"));
      dogList.add(new Dog("Reksio", "Chuw chow"));
      dogList.add(new Dog("Burok", "Samoyed"));
    }
    @GetMapping
    public List<Dog> getDogs(@RequestHeader int amount){
        return dogList.subList(0, amount);
    }

    @PostMapping
    public void addDog(@RequestBody Dog dog){
         dogList.add(dog);
    }
}
