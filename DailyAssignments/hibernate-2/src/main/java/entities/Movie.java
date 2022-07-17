package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {
@Id
private int id;
private String name;
private int year;
private int rating;
public Movie() {
	super();
}
public Movie(int id, String name, int year, int rating) {
	super();
	this.id = id;
	this.name = name;
	this.year = year;
	this.rating = rating;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "Movie [id=" + id + ", name=" + name + ", year=" + year + ", rating=" + rating + "]";
}


}
