package com.nf_automation.xml;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeAdapter extends XmlAdapter<String, LocalDateTime> {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;

    @Override
    public LocalDateTime unmarshal(String v) throws Exception{
        if(v == null || v.isEmpty()) return null;
        return LocalDateTime.parse(v,dtf);
    }

    @Override
    public String marshal(LocalDateTime v) throws Exception {
        if(v == null) return null;
        return v.format(dtf);
    }

}
