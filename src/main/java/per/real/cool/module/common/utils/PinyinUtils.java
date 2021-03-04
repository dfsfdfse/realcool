package per.real.cool.module.common.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class PinyinUtils {
    /**
     * 获取中文大写拼音首字母
     * @param str
     * @return
     * @throws BadHanyuPinyinOutputFormatCombination
     */
    public static String getFirstLetterUppercase(String str) throws BadHanyuPinyinOutputFormatCombination {
        HanyuPinyinOutputFormat fmt = new HanyuPinyinOutputFormat();
        fmt.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        fmt.setCaseType(HanyuPinyinCaseType.UPPERCASE);
        String rt = "";
        for (char c : str.toCharArray()) {
            String[] pinyin = PinyinHelper.toHanyuPinyinStringArray(c, fmt);
            if(pinyin.length>0 && pinyin[0].length()>0){
                rt += pinyin[0].charAt(0);
            }
        }
        return rt;
    }
}
