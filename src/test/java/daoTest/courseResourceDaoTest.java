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
    ICourseResourceDao courseResourceDao;

    @Test
    public void testFindAll() {
        List<CourseResource> crs = courseResourceDao.findAll();
        System.out.println("------testFindAll--------");
        for (CourseResource cr : crs) {
            System.out.println("--------------");
            System.out.println(cr);
        }
    }

    @Test
    public void testFindById(){
        System.out.println("------testFindById--------");
        CourseResource cr1 = courseResourceDao.findById(1);
        CourseResource cr2 = courseResourceDao.findById(2);
        System.out.println(cr1);
        System.out.println(cr2);
    }

    @Test
    public void testInsert(){
        System.out.println("------testInsert--------");
        CourseResource cr = new CourseResource();
        cr.setCourseId(1);
        cr.setResourceName("123");
        System.out.println(cr);
        courseResourceDao.insert(cr);
    }


    @Test
    public void testDelete(){
        System.out.println("------testDelete--------");
        CourseResource cr =courseResourceDao.findById(7);
        System.out.println(cr);
        courseResourceDao.delete(cr);
    }
}
