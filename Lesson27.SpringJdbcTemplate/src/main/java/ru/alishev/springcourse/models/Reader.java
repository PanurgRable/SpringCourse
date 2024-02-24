package ru.alishev.springcourse.models;

public class Reader {
    private int reader_id;
    private String reader_name;
    private int reader_year;

    public Reader(int reader_id, String reader_name, int reader_year) {
        this.reader_id = reader_id;
        this.reader_name = reader_name;
        this.reader_year = reader_year;
    }

    public Reader(){

    }


    public int getReader_id() {
        return reader_id;
    }

    public void setReader_id(int reader_id) {
        this.reader_id = reader_id;
    }

    public String getReader_name() {
        return reader_name;
    }

    public void setReader_name(String reader_name) {
        this.reader_name = reader_name;
    }

    public int getReader_year() {
        return reader_year;
    }

    public void setReader_year(int reader_year) {
        this.reader_year = reader_year;
    }
}
