package respositories;

import org.hibernate.SessionFactory;
import utils.Utils;

public class BasedRepository {

    protected SessionFactory sessionFactory = null;
    BasedRepository (){
        if (sessionFactory == null)
            sessionFactory = Utils.getDbSession();
    }
}
