package com.letstudy.backend.controller;
import com.letstudy.backend.model.Admin; import com.letstudy.backend.repository.AdminRepository; import com.letstudy.backend.security.JwtService; import org.springframework.http.ResponseEntity; import org.springframework.security.crypto.password.PasswordEncoder; import org.springframework.web.bind.annotation.*; import java.util.Map;
@RestController @RequestMapping("/api/admin") public class AdminController {
 private final AdminRepository repo; private final PasswordEncoder encoder; private final JwtService jwt;
 public AdminController(AdminRepository repo,PasswordEncoder encoder,JwtService jwt){this.repo=repo;this.encoder=encoder;this.jwt=jwt;}
 @PostMapping("/login") public ResponseEntity<?> login(@RequestBody Map<String,String> body){String username=body.getOrDefault("username","");String password=body.getOrDefault("password","");return repo.findByUsername(username).filter(a->encoder.matches(password,a.getPassword())).<ResponseEntity<?>>map(a->ResponseEntity.ok(Map.of("token",jwt.generate(a.getUsername()),"username",a.getUsername()))).orElseGet(()->ResponseEntity.status(401).body(Map.of("message","Invalid username or password")));}
 @GetMapping("/me") public ResponseEntity<?> me(org.springframework.security.core.Authentication auth){return ResponseEntity.ok(Map.of("username",auth.getName()));}
}
