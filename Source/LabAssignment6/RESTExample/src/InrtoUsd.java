import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/conversion")
public class InrtoUsd {

	@GET
	@Produces("application/xml")
	@Path("/itou")
	public String convertItoU() {
 
		Double USD;
		Double INR =100000.0;
		USD=INR/68.5;
 
		String result = "@Produces(\"application/xml\") Output: \n\nINR to USD Converter Output: \n\n" + USD;
		return "<inrtousdservice>" + "<INR>" + INR + "</INR>" + "<inrtousdoutput>" + result + "</inrtousdoutput>" + "</inrtousdservice>";
	}
 
	@Path("/inrtou/{i}")
	@GET
	@Produces("application/xml")
	public String convertItoUfromInput(@PathParam("i") Double i) {
		Double USD;
		Double INR = i;
		USD = INR /68.5;
 
		String result = "@Produces(\"application/xml\") Output: \n\nINR to USD Converter Output: \n\n" + USD;
		return "<inrtousdservice>" + "<INR>" + INR + "</INR>" + "<inrtousdoutput>" + result + "</inrtousdoutput>" + "</inrtousdservice>";
	}
	
}
