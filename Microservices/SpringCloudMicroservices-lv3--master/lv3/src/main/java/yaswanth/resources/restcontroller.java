package yaswanth.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import yaswanth.Model.app;

import java.util.List;

@RestController
public class restcontroller {

    @Value("${greet}")
    private String m;

    @Value("${list.values}")
    private List l ;

    @Autowired
    private app app;

    @GetMapping("/greet")
    public String greet(){
        return m+"<br>"+l+"<br>"+app.toString();
    }

}
