package com.restfully.shop.domain;

import javax.xml.bind.annotation.XmlAttribute;

//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.net.URI;
//@JsonInclude(Include.NON_EMPTY)
public class LinkResource  {

private String uri;
private String rel;


public LinkResource() {
    this (null, null);
}

public LinkResource(String uri) {
    this(uri, null);
}

public LinkResource(String uri,String rel) {

    this.uri = uri;
    this.rel = rel;

}

@XmlAttribute(name = "href")
public String getUri() {
    return uri;
}
@XmlAttribute(name = "rel")
public String getRel(){return rel;}

public void setUri(String uri) {
    this.uri = uri;
}


}
