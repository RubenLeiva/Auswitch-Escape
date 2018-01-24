package fin;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class VRank {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] columnas = {"Posicion", "Nombre", "Tiempo"};
		Object[][] data= {{new Integer(1), "Almorrana", new Double(100.3)},
				{new Integer(2), "Pedro", new Double(132.45)}};
		JTable table = new JTable(data, columnas);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		
		TableColumn column = null;
		for (int i = 0; i < 5; i++) {
		    column = table.getColumnModel().getColumn(i);
		    if (i == 2) {
		        column.setPreferredWidth(100); //third column is bigger
		    } else {
		        column.setPreferredWidth(50);
		    }
		}
	}

}
