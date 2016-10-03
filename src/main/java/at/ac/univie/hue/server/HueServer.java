package at.ac.univie.hue.server;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/service")
public class HueServer {
    
    @PUT
    @Path("/update-light")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateLight(String json) {
        if (json == null || json.isEmpty()) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        
        String hueIp = System.getProperty("hue_ip");
        
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target("http://" + hueIp).path("/api/6dd2506f56ef41c9119969894be4468d/lights/1/state");
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.put(Entity.entity(json, MediaType.APPLICATION_JSON));
        
        return response;
    }
    
}
