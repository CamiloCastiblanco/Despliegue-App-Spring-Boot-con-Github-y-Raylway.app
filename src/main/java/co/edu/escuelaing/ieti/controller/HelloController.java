package co.edu.escuelaing.ieti.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Camilo Castiblanco
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> GetResource() {
        return new ResponseEntity<>("Hello Camilo Castiblanco!", HttpStatus.ACCEPTED);
    }

}