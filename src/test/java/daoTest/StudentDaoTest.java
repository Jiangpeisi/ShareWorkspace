package daoTest;

import com.jiangpeisi.dao.ICourseEnrollmentDao;
import com.jiangpeisi.dao.IStudentDao;
import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.Student;
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
public class StudentDaoTest {
   @Autowired
    IStudentDao studentDao;
   @Test
   public void insert(){
       Student student=new Student();
       student.setUsername("233");
       student.setPassword("233");
       student.setFindkey("233");
       studentDao.insert(student);
   }
   @Test
   public void findByName(){
       Student student=new Student();
       student.setUsername("233");
       student.setPassword("233");
       student.setFindkey("233");
       System.out.println(studentDao.findByName(student.getUsername()));
   }
    @Test
    public void findById(){
        Student student=new Student();
        student.setId(11);
        System.out.println(studentDao.findById(student.getId()));
    }
    @Test
    public void update(){
        Student student=new Student();
        student.setUsername("233");
        student.setEmail("1158289024821209");
        studentDao.update(student);
    }
    @Test
    public void updatePassword(){
        Student student=new Student();
        student.setUsername("233");
        student.setPassword("123124124");
        studentDao.updatePassword(student);
    }
   @Test
    public void delete(){
       Student student=new Student();
       student.setUsername("233");
       student.setPassword("233");
       student.setFindkey("233");
       studentDao.delete(student);
   }
}
