package com.bobmura.web.security;

import com.bobmura.web.domain.BobUser;
import com.bobmura.web.repository.BobUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private BobUserRepository bobUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        BobUser bobUser = bobUserRepository.findByUserEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("유저가 없습니다."));

        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_USER");

        UserDetails userDetails = new User(username, bobUser.getUserPass(), Arrays.asList(authority));

        return userDetails;
    }
}
