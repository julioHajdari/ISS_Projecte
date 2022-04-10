package service;

import jdk.nashorn.internal.ir.RuntimeNode;
import models.Satelite;
import okhttp3.*;
import okhttp3.Request;
import org.omg.CORBA.*;
import org.omg.CORBA.Object;
import respositories.AstronautRepository;
import respositories.BasedRepository;
import respositories.SatelitRepository;
import utils.Utils;

import java.util.List;

public class SatelitService {


    public SatelitService(AstronautRepository astronautRepository, SatelitRepository satelitRepository) throws Exception {


        if (astronautRepository == null)
            throw new Exception(" can not be null");
        if (satelitRepository == null)
            throw new Exception("can not be null");

    }

    public void synDatabaseWithOpenSpaceStation() {

        try {

            Request request = new Request.Builder()
                    .url(SynchronizeService.SPACESTATION).build();

            OkHttpClient client = new OkHttpClient();
            Call call = client.newCall(request);
            Response response = call.execute();

            String result = response.body().string();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

  /*  public static SatelitRepository realtimecoordinate(Integer latitude, Integer longtitude) {

        Satelite satelit = null;

        try {


        } catch (Exception e) {
            e.printStackTrace();
        }

        return satelit;
    }*/


}
