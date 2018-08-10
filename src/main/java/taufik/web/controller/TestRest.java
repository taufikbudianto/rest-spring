/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taufik.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Taufik
 */
@RestController

public class TestRest {
    
    @RequestMapping(value="/test",method=RequestMethod.GET)
    public void getData(){
        System.out.println("Test");
    }
    
}
