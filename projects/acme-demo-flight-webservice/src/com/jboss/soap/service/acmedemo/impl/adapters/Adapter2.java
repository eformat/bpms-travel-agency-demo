//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.30 at 01:53:21 PM BST 
//


package com.jboss.soap.service.acmedemo.impl.adapters;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter2
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return new Date(value);
    }

    public String marshal(Date value) {
        if (value == null) {
            return null;
        }
        return value.toString();
    }

}
