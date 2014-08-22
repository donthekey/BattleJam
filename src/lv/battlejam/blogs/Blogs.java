package lv.battlejam.blogs;

import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;

public class Blogs {

    
    ArrayList articles;

    public void main(String[] args) throws ClassNotFoundException {

        articles = new ArrayList();
    }

    public ArrayList getArticles() {

        ArrayList articlesFromDB = new ArrayList();

        return articlesFromDB;
    }

    public class Article {

        private int id;
        private String title;
        private String author;
        private String text;
        

    }
}
