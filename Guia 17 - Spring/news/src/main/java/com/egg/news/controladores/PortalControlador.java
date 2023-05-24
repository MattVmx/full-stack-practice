
package com.egg.news.controladores;

import com.egg.news.entidades.Noticia;
import com.egg.news.entidades.Usuario;
import com.egg.news.excepciones.MiException;
import com.egg.news.repositorios.NoticiaRepositorio;
import com.egg.news.servicios.NoticiaServicio;
import com.egg.news.servicios.UsuarioServicio;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PortalControlador {
    
    @Autowired
    private NoticiaServicio noticiaServicio;
    
    @Autowired
    private NoticiaRepositorio noticiaRepositorio;
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @GetMapping("/")
    public String incio(){
        
       
        return "index.html";
    }
    
    
    @GetMapping("/registrar")
    public String registrar(){
    
     return "registro.html";
    } 
    
    @PostMapping("/registro")
     public String registro(@RequestParam String nombre, @RequestParam String email, @RequestParam String password, @RequestParam String password2, ModelMap modelo){
         
        try {
            usuarioServicio.registrar(nombre, email, password, password2);
            modelo.put("exito", "Usuario registrado con éxito");
            
            return "index.html";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);
            
        }
    
     return "registro.html";
    } 
    
   
    @GetMapping("/login")
    public String login(@RequestParam(required = false)String error, ModelMap modelo){
        
        if (error != null) {
            modelo.put("error", "Usuario o contraseña incorrectos");
        }
     return "login.html";
    }
    
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String inicio(HttpSession session, ModelMap modelo){
        
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        
        if (logueado.getRol().toString().equals("ADMIN")) {
            return "redirect:/admin/dashboard";
        }
        
         List<Noticia> noticias = noticiaRepositorio.mostrarNoticiasConBajas();
        
        modelo.addAttribute("noticias", noticias);
    
        
     return "inicio.html";
    } 
      
}
