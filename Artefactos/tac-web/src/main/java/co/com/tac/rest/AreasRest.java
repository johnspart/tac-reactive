package co.com.tac.rest;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.AsyncResponse;
import javax.ws.rs.container.Suspended;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import co.com.tac.dto.Area;
import co.com.tac.services.AreaService;
import rx.Observable;
import rx.schedulers.Schedulers;

@Path("/areas")
@RequestScoped
public class AreasRest {

	@Inject
	private AreaService areaService;

	@GET
	@Path("/getAreas")
	@Produces(MediaType.APPLICATION_JSON)
	public void getAreas(@Suspended final AsyncResponse ar) {
		Observable<List<Area>> list = areaService.obtenerAreas();
        list.subscribeOn(Schedulers.computation()).subscribe((values) -> {
            Response resp = Response.ok(values).build();
            ar.resume(resp);
        });
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response almacenarArea(Area area) {
		try {
			this.areaService.almacenarArea(area);
			return Response.status(Status.OK).build();
		} catch (Exception e) {
			e.printStackTrace();
			return Response.status(Status.EXPECTATION_FAILED).build();
		}
	}

}
