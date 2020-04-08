package serviceTest;
import com.jiangpeisi.dao.ICourseEnrollmentDao;
import com.jiangpeisi.dao.IStudentDao;
import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.CourseResource;
import com.jiangpeisi.domain.Student;
import com.jiangpeisi.service.ICourseOfferingService;
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
public class CourseOfferingServieTest {
    @Autowired
    ICourseOfferingService courseOfferingService;
    @Test
   public void  findStudents(){
       CourseOffering co=new CourseOffering();
       co.setId(4);
        System.out.println(courseOfferingService.findStudents(co));
   };
@Test
public void findCourseResources(){
    CourseOffering co=new CourseOffering();
    co.setId(1);
    System.out.println(courseOfferingService.findCourseResources(co));
}
@Test
  public void findAll(){
      System.out.println(courseOfferingService.findAll());
  }
}
