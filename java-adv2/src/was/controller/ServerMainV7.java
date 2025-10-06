package was.controller;

import was.myannotation.AnnotationServlet;
import was.httpserver.HttpServer;
import was.httpserver.ServletManager;
import was.httpserver.servlet.DiscardServlet;
import was.v5.servlet.HomeServlet;

import java.io.IOException;
import java.util.List;

public class ServerMainV7 {

    private static final int PORT = 12345;
    public static void main(String[] args) throws IOException {
        List<Object> controllers = List.of(new SiteController(), new SearchController());
        AnnotationServlet annotationServlet = new AnnotationServlet(controllers);

        ServletManager servletManager = new ServletManager();
        servletManager.setDefaultServlet(annotationServlet);
        servletManager.add("/", new HomeServlet());
        servletManager.add("/favicon.ico", new DiscardServlet());

        HttpServer server = new HttpServer(PORT, servletManager);
        server.start();
    }
}
