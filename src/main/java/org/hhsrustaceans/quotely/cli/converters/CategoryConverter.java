package org.hhsrustaceans.quotely.cli.converters;

import org.hhsrustaceans.quotely.quote.options.Category;
import picocli.CommandLine.ITypeConverter;

//The CategoryConverter class is used to convert a string to a Category object.
public class CategoryConverter implements ITypeConverter<Category> {
    /**
     * @param s contains a string argument that will be converted to a Category object.
     * @return a new Category object.
     * @see ITypeConverter;
     * @Override annotation is used to override the convert method.
     */
    @Override
    public Category convert(String s) {
        return new Category(s, s);
    }
}