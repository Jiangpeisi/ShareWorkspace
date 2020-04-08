package serviceTest;

import com.jiangpeisi.dao.ICourseEnrollmentDao;
import com.jiangpeisi.dao.IStudentDao;
import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.Student;
import com.jiangpeisi.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;

//整合junit和spring，让junit在启动时候加载springIOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件,需要用到的配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class StudentServiceTest {
    @Autowired
    IStudentService studentService;
    @Test
    public void insert(){
        Student student=new Student();
        student.setUsername("233");
        student.setPassword("233");
        student.setFindkey("233");
        System.out.println(studentService.insert(student));
    };
@Test
    public void login(){
    Student student=new Student();
    student.setUsername("233");
    student.setPassword("2333");
    System.out.println(studentService.login(student));
}
@Test
    public void updatePassword(){
    Student student=new Student();
    student.setUsername("233");
    student.setPassword("23333");
    student.setFindkey("233");
    System.out.println(studentService.updatePassword(student));
}
    //    public String delete(Student student);
    @Test
    public void update(){

    }
    @Test
    public void findByName(){
        System.out.println(studentService.findByName("233"));
    }
    @Test
    public void chooseCourse(){
        CourseOffering co=new CourseOffering();
        co.setId(3);
        Student student=new Student();
        student.setId(8);
        System.out.println(studentService.chooseCourse(co,student));
    }
    @Test
    public void findChooseCourse(){
        Student student=new Student();
        student.setId(3);
        System.out.println(studentService.findChooseCourse(student));
    }
}
