package com.example.samprojectdb;

import com.example.samprojectdb.entity.User;
import com.example.samprojectdb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserRepo userRepo;
    //@Autowired
    //private PatientAppService patientAppService;

    //@Autowired
    //private NomineeService nomineeService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String auth=request.getHeader("Authorization");
        System.out.println(auth);
        if(auth!=null && !"".equals(auth) && auth.startsWith("Bearer ")){
            String subject=jwtService.extractID(auth);
            System.out.println(subject);
            // System.out.println(subject);
            if(subject!=null && SecurityContextHolder.getContext().getAuthentication()==null){
                User user=userRepo.getUserByID(Long.parseLong(subject));
                System.out.println(user);
                //if(subject.startsWith("PAT_")){
                   // Patient_login_info patient=patientAppService.getPatientById(subject);
                    // System.out.println(patient);
                    //if(patient!=null){
                        UsernamePasswordAuthenticationToken ut=new UsernamePasswordAuthenticationToken(user,null,null);
                        ut.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                        SecurityContextHolder.getContext().setAuthentication(ut);
                    //}

                }
            }
        filterChain.doFilter(request,response);
        }

}
