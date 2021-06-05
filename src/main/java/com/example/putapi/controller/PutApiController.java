package com.example.putapi.controller;

import com.example.putapi.dto.PutRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put/{userId}")
    public PutRequestDto put(@RequestBody PutRequestDto putRequestDto, @PathVariable Long userId){
        //put메서드도 post와 마찬가지로 dataBody를 사용하기때문에 @ReuquestBody어노테이션을 사용해준다.
        System.out.println(userId);
        return putRequestDto;
    }


}
/*
    {
            "name": "",
            "age":  ,
            "carList" :[
            {
            "carName": "",
            "carNumber": ""
            }
            {
            "carName": "",
            "carNumber": ""
            }
            ]
     }

 */