package daoTest;

import com.jiangpeisi.dao.ICourseResourceDao;
import com.jiangpeisi.domain.CourseResource;
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
public class courseResourceDaoTest {
    @Autowired
    ICourseResourceDao courseResource;

    @Test
    public void testFindAll() {
        List<CourseResource> crs = courseResource.findAll();
        System.out.println("------testFindAll--------");
        for (CourseResource cr : crs) {
            System.out.println("--------------");
            System.out.println(cr);
        }
    }

    @Test
    public void testFindById(){
        System.out.println("------testFindById--------");
        CourseResource cr1 = courseResource.findById(1);
        CourseResource cr2 = courseResource.findById(2);
        System.out.println(cr1);
        System.out.println(cr2);
    }
}
