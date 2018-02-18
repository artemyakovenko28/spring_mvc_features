package com.company.spring_rest_app.model;

import java.util.ArrayList;
import java.util.List;

public class Visitor {
    private final String ip;
    private final List<String> pageVisited = new ArrayList<>();

    public Visitor(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public List<String> getPageVisited() {
        return pageVisited;
    }

    public void addPageVisited(String page) {
        pageVisited.add(page);
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "ip='" + ip + '\'' +
                ", pageVisited=" + pageVisited +
                '}';
    }
}
