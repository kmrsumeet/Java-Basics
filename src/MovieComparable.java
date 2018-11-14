import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Collections;

public class MovieComparable implements Comparable<MovieComparable>{
	
	private double rating;
	private String name;
	private int year;
	
	@Override
	public int compareTo(MovieComparable m) {
		return this.year - m.year;
	}
	
	public MovieComparable(String n,double rt,int yr){
		this.name = n;
		this.rating = rt;
		this.year = yr;
	}
	
	public double getRating(){
		return rating;
	}
	public String getName(){
		return name;
	}
	
	public int getYear(){
		return year;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<MovieComparable> list = new ArrayList<MovieComparable>();
		list.add(new MovieComparable("DDLJ", 7.9, 1992));
		list.add(new MovieComparable("Mulk", 8.7, 2018));
		list.add(new MovieComparable("Taare Zameen Par", 8.3,2005));
		list.add(new MovieComparable("Munna Bhai", 8.1, 2004));
		list.add(new MovieComparable("Swades", 8.4, 2005));
		
		Collections.sort(list);
		System.out.println("Movies after sorting");
		for(MovieComparable movie: list){
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
		}

	}
	
}