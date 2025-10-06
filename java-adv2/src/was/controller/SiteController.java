package was.controller;

import was.myannotation.Controller;
import was.myannotation.GetMapping;
import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;

@Controller
public class SiteController {

    @GetMapping("/site1")
    public void site1(HttpRequest request, HttpResponse response) {
        response.writeBody("<h1>site1</h1>");
    }

    @GetMapping("/site2")
    public void site2(HttpRequest request, HttpResponse response) {
        response.writeBody("<h1>site2</h1>");
    }
}
