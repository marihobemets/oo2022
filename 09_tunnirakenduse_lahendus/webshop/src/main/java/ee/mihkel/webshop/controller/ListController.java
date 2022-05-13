package ee.mihkel.webshop.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ListController {
    List<String> strings = new ArrayList<>(Arrays.asList("Scooby Doo", "Mickey Mouse", "Donald Duck"));

    @GetMapping("strings")//localhost:8008/strings/ GET
    public List<String> getStrings(){
        return strings;
    }

    @GetMapping("strings/{index}") //localhost:8008/strings/1 GET
    public List<String> getStrings(@PathVariable int index){
        return strings.get(index);
    }

    @DeleteMapping("strings/{index}")//localhost:8008/strings/1 DELETE
    public List<String> deleteStrings(@PathVariable int index){
        return strings.remove(index);
    }

    @DeleteMapping("strings/{index}")//localhost:8008/strings/ POST
    public String deleteAllStrings(){
        for (int i = 0; i < strings.size(); i++) {
            strings.clear();
            return "Kõik tooted kustutatud.";
        }
    }
    @PostMapping("strings")//localhost:8008/strings/ POST
    public void addString(@RequestBody String string) {
        strings.add(string);
    }
    @PutMapping("string/{index}")//localhost:8008/strings/1
    public void editString(@PathVariable int index, @RequestBody String string) {
        strings.set(index, string);
    }

}
