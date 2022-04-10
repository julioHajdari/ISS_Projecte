package service;

import respositories.AstronautRepository;
import respositories.SatelitRepository;

public class AstronautService {
    public AstronautService(AstronautRepository astronautRepository, SatelitRepository satelitRepository)throws Exception{

        if (satelitRepository==null)
            throw new Exception("can not be null");
        if (astronautRepository==null)
            throw new Exception("can not be null");
    }

  /*  public static AstronautRepository coordinateByName (){
        try {

        }
    }*/
}
