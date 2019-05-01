package pl.marzenakaa.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class CategoryConverter implements Converter<String, Category> {
    @Autowired
    CategoryDAO categoryDao;

    @Override
    public Category convert(String s) {
        return categoryDao.findById(Long.parseLong(s));
    }
}
