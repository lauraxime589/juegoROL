package com.example;


public class PersonajesMananger {
    private ArrayList<Personaje>
   personajes = new ArrayList<>();
   
     public void agregarPersonaje(Personaje personaje) {
        assert !
     existeNombre(personaje.getNombre()) : "El nombre del personaje ya existe ";
                                 personajes.add(personaje);   
     }

     private boolean existeNombre(String nombre) {
                                       for (Personaje personaje : personajes ){
                                          if 
                                     (personaje.gerNombre().equals(nombre)) {
                                          return true;
                                     }     

                                       } 
                                       return false;  
                                            
     }

}
    

