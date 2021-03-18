package com.mixamus.autoparts.controllers;

import com.mixamus.autoparts.service.CheckOrderNumberService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
@AllArgsConstructor
public class CheckOrderNumber {

  CheckOrderNumberService orderNumberService;


}
