package respositories;

import dto.SatelitInformation;
import models.Satelite;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import java.util.Locale;


public class SatelitRepository extends BasedRepository {
    public SatelitRepository(){
        super();
    }

    public  void  saveToDatabase (SatelitInformation satelitInmation , String satelitName) throws Exception{
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = null;


        try {


            transaction = session.beginTransaction();

            List<Satelite> dbitem = session
                    .createQuery("from Satelite s where lower(s.name) like :name ")
                    .setParameter("name", satelitName.toLowerCase()).getResultList();
            Satelite item = new Satelite();

            if (dbitem.size()>0){
                item = dbitem.get(0);
            }
            else {
                item.setName(satelitName);
            }


           item.setLatitude(satelitInmation.getPosition().getLatitude());
           item.setLongtitude(satelitInmation.getPosition().getLongitude());

           item.setTimestamp(satelitInmation.getTimestamp());
           session.saveOrUpdate(item);
           transaction.commit();



        }catch (Exception e ){
            e.printStackTrace();
        }
    }



}
