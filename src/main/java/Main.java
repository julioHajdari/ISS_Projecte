import respositories.AstronautRepository;
import respositories.SatelitRepository;
import service.AstronautService;
import service.SatelitService;
import utils.Utils;

public class Main {

    public static void main(String[] args) throws Exception {
        Utils.getDbSession();
        AstronautRepository astronautRepository = new AstronautRepository();
        SatelitRepository satelitRepository = new SatelitRepository();


        AstronautService astronautService = new AstronautService(astronautRepository, satelitRepository);
        SatelitService satelitService = new SatelitService(astronautRepository, satelitRepository);

        satelitService.synDatabaseWithOpenSpaceStation();
    }


}

