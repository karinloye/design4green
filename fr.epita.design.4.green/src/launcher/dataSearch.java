package launcher;

import Exception.FilloException;
import Fillo.Connection;
import Fillo.Fillo;
import Fillo.Recordset;

public class dataSearch {

	
		public static void main(String[] args) throws FilloException {
			
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection("C:\\Users\\ADEBOWALE\\Desktop\\fr.epita.design.4.green\\src\\datafile.xls");
			
			String strQuery = "Select * from UserData";
			Recordset rs = connection.executeQuery(strQuery);

			while(rs.next()){
				System.out.println(rs.getField("first_name")+ ("\t\t")+ rs.getField("last_name")+ ("\t\t")+ rs.getField("email"));
			}
			rs.close();
			connection.close();

	}

}
