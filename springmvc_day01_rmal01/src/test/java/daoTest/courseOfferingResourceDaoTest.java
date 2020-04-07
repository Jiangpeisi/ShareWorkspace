package daoTest;

import com.jiangpeisi.dao.ICourseOfferingDao;
import com.jiangpeisi.dao.ICourseOfferingResourceDao;
import com.jiangpeisi.dao.ICourseResourceDao;
import com.jiangpeisi.domain.CourseOffering;
import com.jiangpeisi.domain.CourseResource;
import com.jiangpeisi.domain.dataWrapper.CourseOfferingResource;
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
public class courseOfferingResourceDaoTest {
    @Autowired
    ICourseOfferingResourceDao courseOfferingResourceDao;
    @Autowired
    ICourseOfferingDao courseOfferingDao;
    @Autowired
    ICourseResourceDao courseResourceDao;

    @Test
    public void insertTest() {
        System.out.println("------insertTest--------");
        CourseOfferingResource cor = new CourseOfferingResource();
        cor.setCourseOfferingId(1);
        cor.setCourseResourceId(1);
        courseOfferingResourceDao.insert(cor);
    }

    @Test
    public void findAllTest() {
        System.out.println("------findAllTest--------");
        List<CourseOfferingResource> cors = courseOfferingResourceDao.findAll();
        for (CourseOfferingResource cor : cors) {
            System.out.println(cor);
        }
    }

    @Test
    public void findByCourseResourceTest() {
        System.out.println("------findByCourseResourceTest--------");
        CourseResource cr = courseResourceDao.findById(3);
        System.out.println(cr);
        System.out.println("-------");
        List<CourseOffering> cos = courseOfferingResourceDao.findByCourseResource(cr);
        for (CourseOffering co : cos) {
            System.out.println(co);
        }
    }

    @Test
    public void findByCourseOfferingTest() {
        System.out.println("------findByCourseOfferingTest--------");
        CourseOffering co = courseOfferingDao.findById(1);
        System.out.println(co);
        List<CourseResource> crs = courseOfferingResourceDao.findByCourseOffering(co);
        System.out.println("-------");
        for (CourseResource cr : crs) {
            System.out.println(cr);
        }
    }
}
