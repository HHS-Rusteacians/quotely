package org.hhsrustaceans.quotely.cli.converters;

import org.hhsrustaceans.quotely.quote.options.Category;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CategoryConverterTest {

    @Test
    public void testCategoryConverter() {

        CategoryConverter categoryConverter = new CategoryConverter();
        try {
            //test if the converter can convert a string to a category
            Assertions.assertDoesNotThrow(() -> categoryConverter.convert("Motor"));
        } catch (Exception e) {
            //throw an exception if the string is not converted to a category
            Assertions.assertThrows(Exception.class, () -> categoryConverter.convert("Not a category"));
            e.printStackTrace();
        }
    }

}
