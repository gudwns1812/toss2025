package was.myannotation;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;
import was.httpserver.PageNotFoundException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class AnnotationServlet implements HttpServlet {

    List<Object> controllers;

    public AnnotationServlet(List<Object> controllers) {
        this.controllers = controllers;
    }


    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        String path = request.getPath();
        for (Object controller : controllers) {
            Method[] methods = controller.getClass().getDeclaredMethods();
            for (Method method : methods) {
                if (method.isAnnotationPresent(GetMapping.class)) {
                    method.setAccessible(true);
                    if (path.equals(method.getAnnotation(GetMapping.class).value())) {
                        invoke(request, response, controller, method);
                        return;
                    }
                }
            }
        }
        throw new PageNotFoundException("Page not found: " + path);
    }

    private static void invoke(HttpRequest request, HttpResponse response, Object controller, Method method) {
        try {
            method.invoke(controller, request, response);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}