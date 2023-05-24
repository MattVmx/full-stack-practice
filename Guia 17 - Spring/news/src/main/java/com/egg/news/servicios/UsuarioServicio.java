
package com.egg.news.servicios;

import com.egg.news.entidades.Usuario;
import com.egg.news.enumeraciones.Rol;
import com.egg.news.excepciones.MiException;
import com.egg.news.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class UsuarioServicio implements UserDetailsService{
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Transactional
    public void registrar(String nombre, String email, String password, String password2) throws MiException{
    
        validar(nombre, email, password, password2);
        
        Usuario usuario = new Usuario();
        
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        
        usuario.setRol(Rol.USER);
        
        usuarioRepositorio.save(usuario);
    }
    
    
    private void validar(String nombre, String email, String password, String password2) throws MiException{
                   
        if (nombre.isEmpty() || nombre == null) {
            throw new MiException("El nombre no puede ser nulo o estar vacio");
        }
        
        
        if (email.isEmpty() || email == null) {
            throw new MiException("El email no puede ser nulo o estar vacio");
        }
        
        
        if (password.isEmpty() || password == null) {
            throw new MiException("La contraseña no puede ser nula o estar vacia");
        }
        
        
        if (password2.isEmpty() || password2 == null) {
            throw new MiException("Debe ingresar nuevamente la contraseña");
        }
        
        
        if (!(password2.equals(password))) {
            throw new MiException("No repitió la contraseña correctamente");
        }
        
        
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        
        Usuario usuario = usuarioRepositorio.buscarPorEmail(email);
        
        if (usuario != null) {
            
            List<GrantedAuthority> permisos = new ArrayList<>();
            
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());
            
            permisos.add(p);
            
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            
            HttpSession session = attr.getRequest().getSession(true);
            
            session.setAttribute("usuariosession", usuario);
            
            return new User(usuario.getEmail(), usuario.getPassword(), permisos);
        } else{
            return null;
        }
        
    }
}
