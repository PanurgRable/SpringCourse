package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    String[] classicalMusic = new String[]{"classic1", "Classic2", "Classic3"};
    @Override
    public String getSong() {

        return classicalMusic[2];
    }
}
