package Controller;
import Model.Animal;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/mensaje")
public class Mensaje {
    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public Animal getXml() {
        return new Animal(13, "cabo", 143, 76.5);
    }
}
