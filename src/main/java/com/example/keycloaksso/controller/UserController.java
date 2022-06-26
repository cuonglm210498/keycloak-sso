package com.example.keycloaksso.controller;

import com.example.keycloaksso.entity.User;
import com.example.keycloaksso.model.BaseResponse;
import com.example.keycloaksso.model.Payload;
import com.example.keycloaksso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

/**
 * author cuonglm18
 */
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Payload payload;

    @GetMapping("/{id}")
    @RolesAllowed({"admin", "user"})
    public ResponseEntity<BaseResponse<User>> findById(@PathVariable Long id) {
        System.out.println(payload.getName());
        return ResponseEntity.ok(BaseResponse.ofSuccess(userService.findById(id)));
    }

    @PostMapping
    @RolesAllowed({"admin"})
    public ResponseEntity<BaseResponse<Void>> save(@RequestBody User user) {
        System.out.println(payload.getName());
        userService.save(user);
        return ResponseEntity.ok(BaseResponse.ofSuccess(null));
    }
}
