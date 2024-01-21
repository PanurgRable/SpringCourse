package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {
    String[] rockMusic = new String[]{"rock1", "rock2", "rock3"};
    @Override
    public String getSong() {

        return rockMusic[0];
    }
}
