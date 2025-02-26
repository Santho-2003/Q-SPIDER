package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class MainofHRMS 
{
		private static final String dburl = "jdbc:mysql://localhost:3306/hotel_db";
		private static final String user = "root";
		private static final String password = "root";
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			try {
				Connection  con = DriverManager.getConnection(dburl,user,password);
				while(true) {
					System.out.println();  // empty printing statement 
					System.out.println("              WELCOME TO           ");
					System.out.println("   SANTHO'S HOTEL RESERVATION SYSTEM     ");
					Scanner sc = new Scanner(System.in);
					System.out.println("1. RESERVE ROOM");
					System.out.println("2. VIEW RESERVATIONS");
					System.out.println("3. GET ROOM NUMBER");
					System.out.println("4.UPDATE RESERVATIONS");
					System.out.println("5. DELETE RESERVATIONS");
					System.out.println("0. EXIT");
					System.out.println("Choose an option : ");
					int choice = sc.nextInt();
					switch(choice) {
						case 1 : reserveRoom(con, sc);
						      break;
						case 2 : viewReservations(con);
						      break;
						case 3 : getRoomNo(con, sc);
						      break;
						case 4 : updateReservations(con, sc);
						      break;
						case 5 : deleteReservations(con, sc);
						      break;
						case 0 : exit();
						      sc.close();
						      return;
						default : System.out.println("Invalid choice ... try again.");
					}
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// method for new reservation 
		private static void reserveRoom(Connection con , Scanner sc) {
			try {
				System.out.println("Enter Guest Name : ");
				String name = sc.next();
				sc.nextLine();  // for next line 
				System.out.println("Enter Guest Contact Number : ");
				String contact = sc.nextLine();
				//sc.nextLine();  // for next line 
				System.out.println("Enter Room Number : ");
				int room = sc.nextInt();
				String query = "INSERT INTO RESERVATIONS(guest_name,guest_contact,room_number) VALUES"
						+ "('"+name+"','"+contact+"',"+room+")"; // ISSUE THE QUERY
				try(Statement stmt= con.createStatement()){  // CREATE STATEMENT 
					int count = stmt.executeUpdate(query);  // EXECUTE THE QUERY
					if(count>0) {  // PROCESS THE QUERY
						System.out.println("Reservation successfull!!!");
					}else {
						System.out.println("Reservation failed!!");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// method for view reservations
		private static void viewReservations(Connection con) {
			String query="SELECT 'room_number' FROM RESERVATIONS"; //ISSUE THE QUERY
			try(Statement stmt = con.createStatement()){ // CREATE STATEMENT 
			    ResultSet rs = stmt.executeQuery(query);  // EXECUTE THE QUERY
				System.out.println("        CURRENT RESERVATIONS LIST      ");
				System.out.println("+-----------+------------------+-------------+-------------------+--------------------+");
				System.out.println("|   r_id    |      guest_name  |   contact   |    room_number    |    r_date          |");
				System.out.println("+-----------+------------------+-------------+-------------------+--------------------+");

				while (rs.next()) {
					int id = rs.getInt("r_id");
					String guest = rs.getString("guest_name");
					String contact = rs.getString("guest_contact");
					int room = rs.getInt("room_number");
					String date = rs.getString("r_date");

					System.out.printf("| %-10d | %-13s | %-15s | %-10d | %-19s |\n ", id,guest,contact,room,date);
				}
				System.out.println("+-----------+-----------------+-------------+----------------+---------------------+");
			}catch(SQLException e) {
					e.printStackTrace();
			}
		}
		//method for get reservation room number 
		private static void getRoomNo(Connection con,Scanner sc) {
			try {
				System.out.println("Enter Reservation Id : ");
				int id = sc.nextInt();
				System.out.println("Enter Guest Name : ");
				String name = sc.next();
			String query = "SELECT ROOM_NUMBER FROM RESERVATIONS WHERE R_ID="+id+" AND GUEST_NAME='"+name+"'";
			   try(Statement stmt = con.createStatement()){
				   ResultSet rs = stmt.executeQuery(query);
				   if(rs.next()) {
					   int room = rs.getInt("ROOM_NUMBER");
					   System.out.println("ROOM NUMBER FOR GIVEN RESERVATION ID : "+id+" GUEST NAME : "+name+"  ROOM NUMBER : "+room);
				   }else {
					   System.out.println("RESERVATION NOT FOUND FOR GIVEN ID "+id+" AND GUEST NAME : "+name);
				   }
			   }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// method for update reservations 
		private static void updateReservations(Connection con , Scanner sc) {
			try {
				System.out.println("enter reservation id to update : ");
				int id = sc.nextInt();
				sc.nextLine();
				if(!reservationExists(con,id)) {
					System.out.println("Reservation not found for given ID.");
					return;
				}
				System.out.print("Enter New Guest Name : ");
				String name = sc.nextLine();
				System.out.print("Enter New Contact Number : ");
				String contact = sc.nextLine();
				System.out.print("Enter New Room Number : ");
				int room = sc.nextInt();
			String query = "UPDATE RESERVATIONS SET GUEST_NAME= '"+name+"',"+"GUEST_CONTACT = '"+contact+"',"+
				"ROOM_NUMBER = '"+room+"' "+"WHERE R_ID = "+id; // ISSUE THE QUERY
			    try(Statement stmt = con.createStatement()){  // CREATE STATEMENT 
			    	int count = stmt.executeUpdate(query); // EXECUTE THE QUERY 
			    	if(count>0) {  // PROCESS THE QUERY 
			    		System.out.println("Reservation updated successfully!!!!");
			    	}else {
			    		System.out.println("Reservation updation failed!!!!");
			    	}
			    }
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// method for delete the reservation 
		private static void deleteReservations(Connection con , Scanner sc) {
			try {
				System.out.print("Enter reservation id to delete : ");
				int id = sc.nextInt();
				if(!reservationExists(con, id)) {
					System.out.println("Reservation not found for given ID to Delete. ");
					return;
				}
				String query = "DELETE FROM RESERVATIONS WHERE R_ID = "+id;
				try(Statement stmt = con.createStatement()){
					int count = stmt.executeUpdate(query);
					if(count>0) {
						System.out.println("Reservation deleted successfully!!!");
					}else {
						System.out.println("Reservation deletion failed!!!!");
					}
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		// method for checking reservation is exist or not 
		private static boolean reservationExists(Connection con , int id) {
			try {
				String query ="SELECT 'r_id','guest_name' FROM RESERVATIONS WHERE r_id="+id;
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT room_number, guest_name FROM reservations");
			    return rs.next(); // if there's a result , the reservation is exist 
			    } 
			catch (SQLException e) {
			   e.printStackTrace();
			   return false;  // handle database error 
			}
		}
		// method for exit 
		public static void exit() throws InterruptedException {
			System.out.print("Exiting System");
			int i=5;
			while(i!=0) {
				System.out.print(".");
				Thread.sleep(5000);
				i--;
			}
			System.out.println();
			System.out.println("Thank You Using Hotel Reservation System!!!!");
		}
	}
