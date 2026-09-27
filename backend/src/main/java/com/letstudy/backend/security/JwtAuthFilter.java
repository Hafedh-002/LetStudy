package com.letstudy.backend.security;
import jakarta.servlet.FilterChain; import jakarta.servlet.ServletException; import jakarta.servlet.http.HttpServletRequest; import jakarta.servlet.http.HttpServletResponse; import java.io.IOException; import org.springframework.security.authentication.UsernamePasswordAuthenticationToken; import org.springframework.security.core.authority.SimpleGrantedAuthority; import org.springframework.security.core.context.SecurityContextHolder; import org.springframework.stereotype.Component; import org.springframework.web.filter.OncePerRequestFilter;
@Component
public class JwtAuthFilter extends OncePerRequestFilter {
 private final JwtService jwtService;
 public JwtAuthFilter(JwtService jwtService){this.jwtService=jwtService;}
 @Override protected void doFilterInternal(HttpServletRequest request,HttpServletResponse response,FilterChain chain)throws ServletException,IOException{
  String header=request.getHeader("Authorization");
  if(header!=null && header.startsWith("Bearer ")){
   String token=header.substring(7);
   if(jwtService.valid(token)){
    String username=jwtService.username(token);
    var auth=new UsernamePasswordAuthenticationToken(username,null,java.util.List.of(new SimpleGrantedAuthority("ROLE_ADMIN")));
    SecurityContextHolder.getContext().setAuthentication(auth);
   }
  }
  chain.doFilter(request,response);
 }
}
