package daoTest;

import com.jiangpeisi.dao.ICourseEnrollmentDao;
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
public class courseEnrollmentDaoTest {
    @Autowired
    ICourseEnrollmentDao enrollmentDao;
    @Test
    public void test(){
        Student student=new Student();
        student.setId(3);
        List<CourseOffering> cos = enrollmentDao.findByStudent(student);
        System.out.println("------testFindByStudent--------");
        System.out.println("学生:"+student+"         选了");
        for (CourseOffering co : cos) {
            System.out.println("--------------");
            System.out.println(co);
        }
    }
    @Test
    public void test2(){
        CourseOffering courseOffering=new CourseOffering();
        courseOffering.setId(4);
        List<Student> students=enrollmentDao.findByCourseOffering(courseOffering);
        System.out.println("开课课程："+courseOffering);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
