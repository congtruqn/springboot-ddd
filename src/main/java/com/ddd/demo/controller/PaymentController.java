package com.ddd.demo.controller;

import com.ddd.demo.controller.dtos.UserDto;
import com.ddd.demo.domain.model.Account;
import com.ddd.demo.service.PaymentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/payments")
public class PaymentController {

    @Autowired
    private PaymentService _paymentService;


    @RequestMapping(method = RequestMethod.GET, path = "/{paymentId}")
    public Account getAllPayment(@PathVariable(value = "paymentId") String paymentId){
        //TODO add pagination, sorting,...
        return this._paymentService.execute(paymentId);
    }

    @PostMapping("/employees")
    public String addOneEmployee(@Valid @RequestBody UserDto employee) {
        return this._paymentService.save(employee);
    }
}
