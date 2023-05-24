
package com.egg.news.servicios;

import com.egg.news.entidades.Noticia;
import com.egg.news.excepciones.MiException;
import com.egg.news.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticiaServicio {
    
    @Autowired
    private NoticiaRepositorio noticiaRepositorio;
    
    
    @Transactional
    public void crearNoticia(String titulo, String cuerpo) throws MiException{
        
        validar(titulo, cuerpo);
        
        Noticia noticia = new Noticia();
        
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        
        noticiaRepositorio.save(noticia);
    }
    
    
    public List<Noticia> listarNoticias(){
    
      List<Noticia> noticias = new ArrayList();
      
      noticias = noticiaRepositorio.findAll();
      
      return noticias;
    }
    
    
//    public List<Noticia> listarNoticiasConBajas(){
//    
//      List<Noticia> noticias = new ArrayList();
//      
//      noticias = noticiaRepositorio.mostrarNoticiasConBajas();
//      
//      return noticias;
//    }
    
        
    public void modificarNoticia(String id, String titulo, String cuerpo) throws MiException{
        
        validar(titulo, cuerpo);
        
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            
            Noticia noticia = respuesta.get();
            
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            
            noticiaRepositorio.save(noticia);
            
        }
       
    }
    
    public void darBajaN(String id){
        
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        
        if (respuesta.isPresent()) {
            
            Noticia noticia = respuesta.get();
            
            noticia.setBaja(new Date());
            
            noticiaRepositorio.save(noticia);
            
        }
    
    }
    
    
    public Noticia getOne(String id){
    
        return noticiaRepositorio.getOne(id);
        
    }
    
    
    private void validar(String titulo, String cuerpo) throws MiException{
                   
        if (titulo.isEmpty() || titulo == null) {
            throw new MiException("El titulo no puede ser nulo o estar vacio");
        }
        
        
        if (cuerpo.isEmpty() || titulo == null) {
            throw new MiException("El cuerpo no puede ser nulo o estar vacio");
        }
        
        
    }
    
}
