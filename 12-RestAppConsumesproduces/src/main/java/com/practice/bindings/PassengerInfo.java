package com.practice.bindings;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
public class PassengerInfo
{	
private String name;
private String from;
private String to;
private String doj;
private String trainNumber;
}
