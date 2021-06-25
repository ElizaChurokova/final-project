package kg.itacademy.finalproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/auth").permitAll()
                .antMatchers("/api/user/**").permitAll()
                .antMatchers("api/user-role").permitAll()
               // .antMatchers("/api/medType").hasRole("ADMIN")
                .antMatchers("/api/medType").permitAll()
                .antMatchers("/api/vaccine").permitAll()
                .antMatchers("/api/direction").permitAll()
                .antMatchers("/api/labtest").permitAll()
                .antMatchers("/api/visit-type").permitAll()
                .antMatchers("/api/chronic-disease").permitAll()
                .antMatchers("/api/allergy").permitAll()
                .antMatchers("/api/blood-group").permitAll()
                .antMatchers("/api/med-institution").permitAll()
                .antMatchers("/api/lab-test-result").permitAll()
                .antMatchers("api/med-personal-details").permitAll()
                .antMatchers("/api/initial-visit").permitAll()
                .antMatchers("/api/additional-visit").permitAll()
                .antMatchers("/api/med-card").permitAll()
                .and().httpBasic().and().logout().and().formLogin();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
        .usersByUsernameQuery("select login, password, status from users where login=?")
        .authoritiesByUsernameQuery("select u.login, ur.role_name from users_role ur join users u on ur.user_id = u.id where u.login = ?");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
