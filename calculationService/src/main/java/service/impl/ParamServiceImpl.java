package service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.ParamRepository;
import service.ParamService;


@Service
@RequiredArgsConstructor
public class ParamServiceImpl extends ParamService {
    private final ParamRepository paramRepository;

    @Override
    public void createParam(){

    }

}
