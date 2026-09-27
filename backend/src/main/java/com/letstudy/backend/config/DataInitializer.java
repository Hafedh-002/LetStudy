package com.letstudy.backend.config;
import com.letstudy.backend.model.Admin; import com.letstudy.backend.repository.AdminRepository; import org.springframework.boot.CommandLineRunner; import org.springframework.context.annotation.Bean; import org.springframework.context.annotation.Configuration; import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration public class DataInitializer {
 @Bean CommandLineRunner createDefaultAdmin(AdminRepository repo,PasswordEncoder encoder)
 {
  return args->{if(repo.findByUsername("admin").isEmpty()) repo.save(new Admin("admin",encoder.encode("admin123")));};}
}
