@javax.ws.rs.Path("")
public class HelloWorld {
    @javax.ws.rs.GET
    @javax.ws.rs.Consumes("text/plain")
    public void sayHello(
            @javax.ws.rs.container.Suspended javax.ws.rs.container.AsyncResponse response) {
        if (response.resume("Hello, world!")) {
        }
    }
}
