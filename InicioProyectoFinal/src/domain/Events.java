package domain;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Events {

	private String avenue;
	private String street;
	private String event;
	private String result;
	
	public Events() {
		
	}

	public Events(String avenue, String street, String event, String result) {
		super();
		this.avenue = avenue;
		this.street = street;
		this.event = event;
		this.result = result;
	}

	public String getAvenue() {
		return avenue;
	}

	public void setAvenue(String avenue) {
		this.avenue = avenue;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String streer) {
		this.street = streer;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public StringProperty avenueProperty() {
		return new SimpleStringProperty(avenue);
	}
	public StringProperty streetProperty() {
		return new SimpleStringProperty(street);
	}
	public StringProperty eventProperty() {
		return new SimpleStringProperty(event);
	}
	public StringProperty resultProperty() {
		return new SimpleStringProperty(result);
	}
	
	public String[] getDataName() {
		String[] data= {"avenue","street","event","result"};
		return data;
	}
	
	public String[] getData(){
		String[] data= {this.avenue,this.street,this.event,this.result};
		return data;
	}
	
	@Override
	public String toString() {
		return "Events [avenue=" + avenue + ", streer=" + street + ", event=" + event + ", result=" + result + "]";
	}
	
	

}
