package service.impl;

import service.TransferService;
import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl implements TransferService {
    @Override
    public double transfer(double money) {

        return money*23.000;
    }
}
