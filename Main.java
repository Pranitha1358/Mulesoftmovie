package mulesoft;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
public static void main(String [] args) {
	createtable.createNewTable();
	insert("  SHYAM SINGHA ROY "," Nani  "," SaiPallavi    ",2022,"Rahul sankrityan");
	insert("GYPSY","Jeeva","Sunny Wayne",2020,"Raju Murugan");
	insert("PREMAM"," Nivin Pauly","Sai Pallavi",2015,"Alphonse Puthren");
	insert("JAI BHIM","Surya","Lijomol Jose",2021,"T.J.Gnanavel");
	insert("THERI","Vijay","Samantha",2016,"Atlee");
	select.selectAll();
	select.selectactormovie();
}
private static void insert(String moviename,String leadactor,String actress,Integer yearofrelease,String director) {
	Connection con=Dbconnection.connect();
	PreparedStatement ps=null;
	try {
		String sql="INSERT INTO movies(moviename,leadactor,actress,yearofrelease,director) VALUES(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, moviename);
		ps.setString(2, leadactor);
		ps.setString(3, actress);
		ps.setInt(4,yearofrelease);
		ps.setString(5, director);
		ps.execute();
		System.out.println("Data has been inserted");
	}catch(SQLException e) {
		System.out.println(e.toString());
	}
}
}
