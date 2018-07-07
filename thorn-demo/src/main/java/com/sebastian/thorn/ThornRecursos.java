package com.sebastian.thorn;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * recursos expuestos.
 * @author Sebastian Avila A.
 *
 */
@Path("/")
public class ThornRecursos {
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String saludo() {
    return "jax-rs demo";
  }
}
