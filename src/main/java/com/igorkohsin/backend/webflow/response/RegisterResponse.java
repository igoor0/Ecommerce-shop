package com.igorkohsin.backend.webflow.response;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {
private String token;
private String message;
}
