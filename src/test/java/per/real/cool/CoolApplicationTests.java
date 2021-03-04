package per.real.cool;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import per.real.cool.module.common.utils.PinyinUtils;
import per.real.cool.module.system.dao.OfficeDao;
import per.real.cool.module.system.dao.UserDao;
import per.real.cool.module.system.entity.SysOffice;
import per.real.cool.module.system.entity.SysUser;

import java.util.List;

@SpringBootTest
class CoolApplicationTests {
    @Autowired
    UserDao userDao;
    @Autowired
    OfficeDao officeDao;
    @Test
    void contextLoads() throws BadHanyuPinyinOutputFormatCombination {

    }

}
