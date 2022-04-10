package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import dto.SatelitInformation;

import okhttp3.*;
import okhttp3.Request;
import respositories.AstronautRepository;
import respositories.SatelitRepository;

public class SatelitService {

    AstronautRepository astronautRepository ;
    SatelitRepository satelitRepository;


    public SatelitService(AstronautRepository astronautRepository, SatelitRepository satelitRepository) throws Exception {

        this.astronautRepository= astronautRepository;
        this.satelitRepository = satelitRepository;

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

            ObjectMapper objectMapper = new ObjectMapper();

            SatelitInformation satelitInformation = objectMapper.readValue(result,SatelitInformation.class);
            if (satelitInformation != null){
                System.out.println("Yuhu");
                satelitRepository.saveToDatabase(satelitInformation , "ISS");

            }
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
