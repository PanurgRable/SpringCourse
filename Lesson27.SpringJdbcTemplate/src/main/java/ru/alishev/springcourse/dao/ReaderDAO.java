package ru.alishev.springcourse.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Book;
import ru.alishev.springcourse.models.Reader;

import java.util.List;

@Component
public class ReaderDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ReaderDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Reader> index() {
        return jdbcTemplate.query("SELECT * FROM Reader", new BeanPropertyRowMapper<>(Reader.class));
    }
    public Reader show(int id) {
        return jdbcTemplate.query("SELECT * FROM reader WHERE reader_id=?", new Object[]{id},
                        new BeanPropertyRowMapper<>(Reader.class))
                .stream().findAny().orElse(null);
    }
    public void save(Reader reader) {
        jdbcTemplate.update("INSERT INTO reader(reader_name, reader_year) VALUES(?, ?)", reader.getReader_name(),
                reader.getReader_year());
    }
}
