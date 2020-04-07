package daoTest;

import com.jiangpeisi.dao.ICourseDao;
import com.jiangpeisi.dao.ICourseOfferingDao;
import com.jiangpeisi.dao.ITeacherDao;
import com.jiangpeisi.domain.Course;
import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//整合junit和spring，让junit在启动时候加载springIOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件,需要用到的配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class courseOfferingDaoTest {
    @Autowired
    ICourseOfferingDao courseOfferingDao;

    @Autowired
    ICourseDao courseDao;

    @Autowired
    ITeacherDao teacherDao;

    @Test
    public void testFindAll() {
        List<CourseOffering> cos = courseOfferingDao.findAll();
        System.out.println("------testFindAll--------");
        for (CourseOffering co : cos) {
            System.out.println("--------------");
            System.out.println(co);
        }
    }

    @Test
    public void testFindById() {
        CourseOffering co = courseOfferingDao.findById(3);
        System.out.println("------testFindById--------");
        System.out.println(co);
    }

    @Test
    public void testFindByCourse() {
        List<CourseOffering> cos = courseOfferingDao.findByCourse(1);
        System.out.println("------testFindByCourse--------");
        for (CourseOffering co : cos) {
            System.out.println("--------------");
            System.out.println(co);

        }
    }

    @Test
    public void testFindByTeacher() {
        List<CourseOffering> cos = courseOfferingDao.findByTeacher(2);
        System.out.println("------testFindByTeacher--------");
        for (CourseOffering co : cos) {
            System.out.println("--------------");
            System.out.println(co);

        }
    }

    @Test
    public void testInsert(){
        System.out.println("------testInsert--------");
        Course course = courseDao.findById(2);
        Teacher teacher = teacherDao.findById(1);
        CourseOffering co = new CourseOffering();
        co.setCourse(course);
        co.setTeacher(teacher);

        courseOfferingDao.insert(co);
    }

    @Test
    public void testUpdate(){

    }

    @Test
    public void testDelete(){

    }

}
