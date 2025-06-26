package com.heath.app.dao;

import com.heath.app.model.GymRegistration;
import com.heath.app.model.UserLoginData;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GymDataDaoImpl implements GymDatadao {
    @Autowired
    private EntityManager entityManager;
    @Override
    public List<GymRegistration> getGymList() {
        Session currSession = entityManager.unwrap(Session.class);
        Query<GymRegistration> qry = currSession.createQuery("from GymRegistration", GymRegistration.class);
        List<GymRegistration> lst= qry.getResultList();
        return lst;
    }
    @Override
    public GymRegistration getGymById(int id) {
        return entityManager.find(GymRegistration.class, id);
    }

    @Override
    public void saveGym(GymRegistration gym) {
        entityManager.persist(gym);

    }

    @Override
    public void deleteGym(int id) {
        GymRegistration gym = entityManager.find(GymRegistration.class, id);
        if (gym != null) {
            entityManager.remove(gym);
        }
    }


}
