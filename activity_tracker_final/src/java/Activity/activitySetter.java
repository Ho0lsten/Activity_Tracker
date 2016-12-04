/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Activity;

import Hibernate.Activity;
import Hibernate.Category;
import Hibernate.HibernateUtil;
import java.time.LocalDateTime;
import org.hibernate.Session;

/**
 *
 * @author MM-Produktion
 */
public class activitySetter {
    
     public static void createActivity(String activityName, String activityDescription,Integer fkCaegoryId,LocalDateTime activityStartTime,LocalDateTime activityEndTime) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Activity act = new Activity();     
        act.setActivityName(activityName);
        act.setActivityDescription(activityDescription);
        act.setFkCategoryId(fkCaegoryId);
        act.setActivityStartTime(activityStartTime);
        act.setActivityEndTime(activityEndTime);
        session.save(act);
        session.getTransaction().commit();

    }
    
}