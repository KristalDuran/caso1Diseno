
import java.io.IOException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raque
 */
@Path("ConsultaRest")
public class ConsultaRest {
    String firmaRest = "159";
    @GET
    public String consultar(@QueryParam("nombre") String nombre,
            @QueryParam("firma") String firma) throws IOException{
        return ""; 
     }
                  
}
