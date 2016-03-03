import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/htoaconversion")
public class HectoAcr {

	  @GET
	  @Produces("application/json")
	  public Response convertHectoA() throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double hectare = 2.0;
		Double acre;
		acre = hectare*2.47105; 
		jsonObject.put("Hectare Value", hectare); 
		jsonObject.put("Acre Value", acre);

		String result = "@Produces(\"application/json\") Output: \n\nHectare to Acre Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }

	  @Path("/hectoacr/{f}")
	  @GET
	  @Produces("application/json")
	  public Response convertFtoCfromInput(@PathParam("f") Double f) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		Double acre;
		acre =  f * 2.47105; 
		jsonObject.put("Hectare Value", f); 
		jsonObject.put("Acre Value", acre);

		String result = "@Produces(\"application/json\") Output: \n\nHectare to Acre Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
	  
	  public Double convertHtoA(@PathParam("f") Double f)
		{
		  
		  Double acre;
		  acre = f*2.47105;
		  return acre;
		}
	
}
