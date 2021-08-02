package com.omnitrix.springcloud.service.impl;

import com.omnitrix.springcloud.dao.PaymentDao;
import com.omnitrix.springcloud.entity.Payment;
import com.omnitrix.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceIpml implements PaymentService {

    @Resource   //@Autowired也可以
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}