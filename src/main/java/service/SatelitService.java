package service;

import respositories.AstronautRepository;
import respositories.SatelitRepository;

public class SatelitService {


    public SatelitService(AstronautRepository astronautRepository, SatelitRepository satelitRepository) throws Exception {


        if (astronautRepository == null)
            throw  new Exception(" can not be null") ;
        if (satelitRepository==null)
            throw new Exception("can not be null");

    }


}
