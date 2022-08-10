package com.example.prometheus.config;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StopWatch;
import org.springframework.web.filter.OncePerRequestFilter;

@Configuration
public class RequestFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
        throws ServletException, IOException {

        StopWatch watch = new StopWatch();

        watch.start();
        filterChain.doFilter(request, response);
        watch.stop();

        System.out.println("Handled request. URI='" + request.getRequestURI()
                               + "', code=" + response.getStatus()
                               + ". Execution time=" + watch.getLastTaskTimeMillis() + "ms");
    }

}
