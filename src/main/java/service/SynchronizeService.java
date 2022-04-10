package service;


import respositories.AstronautRepository;
import respositories.SatelitRepository;

import javax.jws.WebService;

public class SynchronizeService {


    public static String SPACESTATION = "http://api.open-notify.org/iss-now.json";


    SynchronizeService(AstronautRepository astronautRepository, SatelitRepository satelitRepository)throws Exception{
        if (astronautRepository == null)
            throw  new Exception(" can not be null") ;
        if (satelitRepository==null)
            throw new Exception("can not be null");
    }


}
