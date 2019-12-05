package com.codeclan.example.courseTracker.repositories.customerrepository;

import com.codeclan.example.courseTracker.models.Booking;
import com.codeclan.example.courseTracker.models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findAllCustomersByCourseId(Long course_id){
        List<Customer> results = null;
        Session session = entityManager.unwrap(Session.class);
        try {
            Criteria cr = session.createCriteria(Booking.class);
            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("bookings.course_id", course_id));
            results = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return results;
    }

}
