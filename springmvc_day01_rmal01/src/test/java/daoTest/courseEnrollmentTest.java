package daoTest;

import com.jiangpeisi.dao.ICourseEnrollmentDao;
import com.jiangpeisi.dao.ICourseOfferingDao;
import com.jiangpeisi.dao.IStudentDao;
import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.Student;
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
public class courseEnrollmentTest {
    @Autowired
    ICourseEnrollmentDao courseEnrollmentDao;

    @Autowired
    ICourseOfferingDao courseOfferingDao;

    @Autowired
    IStudentDao studentDao;

    @Test
    public void findByCourseOfferingTest() {
        System.out.println("------findByCourseOfferingTest-------");
        CourseOffering co = courseOfferingDao.findById(4);
        List<Student> students = courseEnrollmentDao.findByCourseOffering(co);
        for (Student s : students) {
            System.out.println(s);
        }
    }

    @Test
    public void findByStudentTest() {
        System.out.println("------findByStudentTest-------");
        Student student = studentDao.findByName("12");
        List<CourseOffering> cos = courseEnrollmentDao.findByStudent(student);
        for (CourseOffering co : cos) {
            System.out.println(co);
        }
    }
}
