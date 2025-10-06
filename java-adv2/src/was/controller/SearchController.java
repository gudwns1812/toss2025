package was.controller;

import was.myannotation.Controller;
import was.myannotation.GetMapping;
import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;

@Controller
public class SearchController {
    @GetMapping("/search")
    public void search(HttpRequest request, HttpResponse response) {
        String query = request.getParameter("q");
        response.writeBody("<h1>search</h1>");
        response.writeBody("<ul>");
        response.writeBody("<li>query: " + query + "</li>");
        response.writeBody("</ul>");
    }
}
