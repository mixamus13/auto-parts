package com.mixamus.autoparts.dto;

import lombok.*;

@Builder
@RequiredArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ClientDto {

  String username;
  String firstname;
  String lastname;
  String password;
  String phone;
}
