package com.exercise.car.contoller;

import com.exercise.car.Entity.CartDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {


    @GetMapping("/getcar")
    public String getCar(){
        CartDTO newCar = new CartDTO();
        return newCar.toString();
    }

    @PostMapping("/postcar")
    public String postCar(@RequestBody CartDTO car){
        return car.toString();
    }




}
