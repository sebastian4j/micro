package com.sebastian.thorn;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import io.thorntail.Thorntail;

/**
 * main app.
 * @author Sebastian Avila A.
 *
 */
@ApplicationPath("/")
public class ThornApp extends Application {
  public static void main(String[] args) throws Exception {
    Thorntail.run();
  }
}
