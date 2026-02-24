package korit12.cardatabase3.service;

import korit12.cardatabase3.domain.AppUser;
import korit12.cardatabase3.domain.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> user = appUserRepository.findByUsername(username);

        UserBuilder builder = null;
        if (user.isPresent()) {
            AppUser currentUser = user.get();
            builder = User.withUsername(username)
                    .password(currentUser.getPassword())
                    .roles(currentUser.getRole());
        } else{
            throw new UsernameNotFoundException("사용자를 찾지 못했습니다.");
        }
        return builder.build();
    }
}
