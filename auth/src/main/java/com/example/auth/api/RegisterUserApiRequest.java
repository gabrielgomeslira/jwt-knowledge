package com.example.auth.api;

public record RegisterUserApiRequest (
    String email,
    String password,
    String fullName
    ){
}
