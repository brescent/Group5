package test;

import com.project.entity.StockEntity;
import com.project.entity.UserEntity;
import com.project.service.IStockService;
import com.project.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserTset {
    @Autowired
    private IStockService stockService;

    @Test
    public void testUser() {
        stockService.buy(new StockEntity(1,"航空母舰",17));
    }

}
