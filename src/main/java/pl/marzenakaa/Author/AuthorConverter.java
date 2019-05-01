package pl.marzenakaa.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class AuthorConverter implements Converter<String, Author> {

    @Autowired
    AuthorDAO authorDAO;

    @Override
    public Author convert(String s) {
        return authorDAO.findById(Long.parseLong(s));
    }

}