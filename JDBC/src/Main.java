import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Main {
	
	
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicals","root","12345");
			PreparedStatement ps = null;
			
			
			
			Scanner sc =  new Scanner(System.in);
			
			int choice = 0;
			
			
			while(choice != 5) {
				System.out.println("Enter from below options: ");
				System.out.println("1)Insert into table: ");
				System.out.println("2)Show table: ");
				System.out.println("3)Delete Table entry: ");
				System.out.println("4)Exit: ");
				
				choice  = sc.nextInt();			
			switch(choice) {
			case 1:
				insert_data(ps,con);
				break;
			case 2:
				read_data(ps,con);
				break;
			case 3:
				delete_data(ps,con);
				break;
			case 4:
				update_data(ps,con);
				break;
			}
			}
			
			con.close();
		}

		catch(Exception e) {
			System.out.println(e);
		}

	}
	
	public static void insert_data(PreparedStatement ps,Connection con) {
		try {
			ps = con.prepareStatement("INSERT INTO MOVIES(NAME,RATING) VALUES(?,?)");
			Scanner sc = new Scanner(System.in);
			
			String name = sc.next();
			Float rating = sc.nextFloat();
			
			ps.setString(1, name);
			ps.setFloat(2,rating);
			
			ps.executeUpdate();
			
			System.out.println("Inserted Successfully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}	
	}
	
	public static void update_data(PreparedStatement ps,Connection con) {
		
		try {
			ps = con.prepareStatement("UPDATE MOVIES SET RATING = ? WHERE NAME = ?");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter name of movie you want to update");
			
			String name = sc.next();
			
			
			ps.setString(2, name);
			
			System.out.println("Enter rating of movie you want to update");
			
			Float newRating = sc.nextFloat();
			
			ps.setFloat(1, newRating);
			
			ps.executeUpdate();
			
			System.out.println("Updated Successfully");
			
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
		
	}
	public static void delete_data(PreparedStatement ps,Connection con) {
		try {
			ps = con.prepareStatement("DELETE FROM MOVIES WHERE NAME = ?");
			
			Scanner sc = new Scanner(System.in);
			
			String name = sc.next();
			
			
			ps.setString(1, name);
			ps.executeUpdate();
			
			System.out.println("Deleted Successfully");
			
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}
	public static void read_data(PreparedStatement ps,Connection con) {
		try {
			ps = con.prepareStatement("SELECT * FROM MOVIES");
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println("Name       "+ "             "+"Rating");
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + "                    "+ rs.getString(2));
			}
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}
}