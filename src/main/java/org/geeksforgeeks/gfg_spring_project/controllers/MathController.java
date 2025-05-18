//package org.geeksforgeeks.gfg_spring_project.controllers;
//
//
//import org.geeksforgeeks.gfg_spring_project.services.MathService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class MathController {
//    private final MathService mathService ;
//
//    @Autowired
//    public MathController(MathService mathService) {
//        this.mathService = mathService ;
//    }
//
//    @GetMapping("/math")
//    public double doMath(@RequestParam double a , @RequestParam double b , @RequestParam char operator) {
//        double result ;
//        switch (operator) {
//            case '+' -> result =  this.mathService.add(a , b) ;
//            case '-' -> result = this.mathService.sub(a , b) ;
//            case '*' -> result = this.mathService.mul(a , b) ;
//            case '/' -> result = this.mathService.div(a , b) ;
//            default -> result = Double.MIN_VALUE ;
//        }
//
//        return  result ;
//    }
//
//    @GetMapping("/temperature")
//    public double doTemp(@RequestParam double a , @RequestParam char unit) {
//        if ( unit == 'C') {
//            return ( (a * 9/5) + 32 ) ;
//        } else if ( unit == 'F') {
//            return ( (a - 32 ) * 5/9 ) ;
//        } else {
//            return 0.0 ;
//        }
//    }
//}
