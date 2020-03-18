package br.edu.ensala.restful;

import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.edu.ensala.restful.CrossOrigin.class);
        resources.add(br.edu.ensala.restful.RegisterAPI.class);
        resources.add(br.edu.ensala.restful.RoomAPI.class);
        resources.add(br.edu.ensala.restful.UserAPI.class);
    }
    
}
