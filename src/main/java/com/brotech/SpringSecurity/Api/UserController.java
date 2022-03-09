package com.brotech.SpringSecurity.Api;

import com.brotech.SpringSecurity.domain.Role;
import com.brotech.SpringSecurity.domain.User;
import com.brotech.SpringSecurity.service.UserService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RequestMapping("/")
@RestController
@Data
@Slf4j
public class UserController {

    private  final UserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>>getUser(){

        log.info(userService.getUser().size()+"size");
        return ResponseEntity.ok().body(userService.getUser());
    }

    @PostMapping(path = "/user/save")
    public  ResponseEntity<User>saveUser(@RequestBody User user){

        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/user/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user));
    }

    @PostMapping(path = "/role/save")
    public  ResponseEntity<Role>saveRole(@RequestBody Role role){

        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/role/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));
    }

    @PostMapping(path = "/role/addToUser")
    public  ResponseEntity<?>saveRole(@RequestBody RoleToUserForm form){

        userService.addRoleToUser(form.getUserName(),form.getRole());
        return ResponseEntity.ok().build();
    }


}

@Data
class RoleToUserForm{
    private String userName;
    private String role;
}
