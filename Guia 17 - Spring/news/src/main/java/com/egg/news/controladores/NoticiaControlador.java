package com.egg.news.controladores;

import com.egg.news.entidades.Noticia;
import com.egg.news.excepciones.MiException;
import com.egg.news.repositorios.NoticiaRepositorio;
import com.egg.news.servicios.NoticiaServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/noticia")
public class NoticiaControlador {

    @Autowired
    private NoticiaRepositorio noticiaRepositorio;
    
    @Autowired
    private NoticiaServicio noticiaServicio;
    
    
    @GetMapping("/registrarN")
    public String registrarN(ModelMap modelo){
        modelo.addAttribute("noticia", new Noticia());
        return "subirNoticia.html";
    }
    
    
    @PostMapping("/registro")
    public String registro(@RequestParam String titulo, @RequestParam String cuerpo){
        
        try {
            noticiaServicio.crearNoticia(titulo, cuerpo);
        } catch (MiException ex) {
            Logger.getLogger(AdminControlador.class.getName()).log(Level.SEVERE, null, ex);
            return "subirNoticia.html";
        }
    
        return "redirect:/";
    }
    
    
    @GetMapping("/modificar/{id}")
    public String modificar(@PathVariable String id, String titulo, String cuerpo, ModelMap modelo){
        
        modelo.put("noticia", noticiaServicio.getOne(id));
    
        return "modificarNoticia.html";
    }
    
    
    @PostMapping("/modificado/{id}")
    public String modificarN(@PathVariable String id, String titulo, String cuerpo, ModelMap modelo){
    
        try {
            noticiaServicio.modificarNoticia(id, titulo, cuerpo);
            
            return "redirect:/";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "modificarNoticia.html";
        }
    }
    
    
    @GetMapping("/baja/{id}")
    public String darBaja(@PathVariable String id, ModelMap modelo){
        
        noticiaServicio.darBajaN(id);
    
        return "redirect:/";
    }
    
    

    @GetMapping("/mostrarNoticia/{id}")
    public String mostrarN(@PathVariable String id, String titulo, String cuerpo, ModelMap modelo) {

        List<Noticia> noticia = new ArrayList();
        noticia = noticiaRepositorio.mostrarNoticia(id);

        modelo.addAttribute("noticia", noticia);

        return "noticia.html";
    }

}
