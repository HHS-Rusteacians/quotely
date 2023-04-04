package org.hhsrustaceans.quotely.cli.converters;

import org.hhsrustaceans.quotely.quote.options.Category;
import picocli.CommandLine.ITypeConverter;

public class CategoryConverter implements ITypeConverter<Category> {
    @Override
    public Category convert(String s) {
        return new Category(s, s);
    }
}
