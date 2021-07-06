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
//        http.csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/api/auth").hasAnyRole("DOCTOR", "ADMIN", "MEDADMIN")
//                .antMatchers("/api/user/**").hasAnyRole("DOCTOR", "ADMIN", "MEDADMIN")
//                .antMatchers("api/user-role").hasRole("ADMIN")
//                .antMatchers("/api/medType").hasRole("ADMIN")
//                .antMatchers("/api/vaccine").hasRole("ADMIN")
//                .antMatchers("/api/direction").hasRole("ADMIN")
//                .antMatchers("/api/labtest").hasAnyRole("ADMIN", "MEDADMIN")
//                .antMatchers("/api/chronic-disease").hasAnyRole("ADMIN", "MEDADMIN")
//                .antMatchers("/api/allergy").hasAnyRole("ADMIN", "MEDADMIN")
//                .antMatchers("/api/blood-group").hasRole("ADMIN")
//                .antMatchers("/api/med-institution").hasRole("ADMIN")
//                .antMatchers("/api/lab-test-result").hasRole("DOCTOR")
//                .antMatchers("api/med-personal-details").hasRole("MEDADMIN")
//                .antMatchers("/api/visit").hasRole("DOCTOR")
//                .antMatchers("/api/med-card").hasAnyRole("MEDADMIN", "DOCTOR")
//                .and().httpBasic().and().logout().and().formLogin();
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/api/auth/sign-in").permitAll()
                .antMatchers("/api/auth/sign-up").hasAnyRole("DOCTOR", "ADMIN", "MEDADMIN")
                .antMatchers("/api/user/**").hasAnyRole("DOCTOR", "ADMIN", "MEDADMIN")
                .antMatchers("/api/user/find/{login}").hasRole("PATIENT")
                .antMatchers("/api/user/ban/{id}").hasRole("DOCTOR")
                .antMatchers("/api/user/unban/{id}").hasRole("DOCTOR")
                .antMatchers("/api/user/get-status/{status}").hasAnyRole("DOCTOR", "ADMIN", "MEDADMIN")
                .antMatchers("api/user-role/**").hasRole("ADMIN")
                .antMatchers("/api/medType").hasRole("ADMIN")
                .antMatchers("api/medType/{id}").permitAll()
                .antMatchers("/api/vaccine").hasAnyRole("ADMIN", "MEDADMIN")
                .antMatchers("/api/vaccine/{id}").permitAll()
                .antMatchers("/api/direction").hasAnyRole("ADMIN", "MEDADMIN")
                .antMatchers("/api/direction/**").permitAll()
                .antMatchers("/api/labtest").hasAnyRole("ADMIN", "MEDADMIN")
                .antMatchers("/api/labtest/**").permitAll()
                .antMatchers("/api/chronic-disease/**").hasAnyRole("ADMIN", "MEDADMIN")
                .antMatchers("/api/chronic-disease/**").hasAnyRole("DOCTOR", "ADMIN", "MEDADMIN")
                .antMatchers("/api/allergy").hasAnyRole("ADMIN", "MEDADMIN")
                .antMatchers("/api/allergy/**").hasAnyRole("DOCTOR", "ADMIN", "MEDADMIN")
                .antMatchers("/api/blood-group").hasAnyRole("ADMIN", "MEDADMIN")
                .antMatchers("/api/blood-group/**").hasAnyRole("DOCTOR", "ADMIN", "MEDADMIN")
                .antMatchers("/api/med-institution").hasAnyRole("ADMIN", "MEDADMIN")
                .antMatchers("/api/med-institution/**").permitAll()
                .antMatchers("/api/lab-test-result/**").hasAnyRole("MEDADMIN", "DOCTOR")
                .antMatchers("api/med-personal-details").hasAnyRole("MEDADMIN", "ADMIN")
                .antMatchers("api/med-personal-details/**").hasAnyRole("MEDADMIN", "ADMIN", "PATIENT")
                .antMatchers("/api/visit").hasRole("DOCTOR")
                .antMatchers("/api/visit/**").permitAll()
                .antMatchers("/api/visit/{medcard_id}").permitAll()
                .antMatchers("/api/med-card").hasAnyRole("MEDADMIN", "DOCTOR")
                .antMatchers("/api/med-card/find-by-user-id/{id}").permitAll()
                .antMatchers("/api/med-card/**").permitAll()

                .and().httpBasic().and().logout().and().formLogin();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
        .usersByUsernameQuery("select login, password, status from users where login=?")
        .authoritiesByUsernameQuery("select u.login, ur.role_name from users_role ur join users u on u.users_role_id = ur.id where u.login = ?");
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources/**", "/configuration/**", "/swagger-ui.html/**", "/webjars/**");
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
